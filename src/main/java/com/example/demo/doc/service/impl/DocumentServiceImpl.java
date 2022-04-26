package com.example.demo.doc.service.impl;

import com.example.demo.doc.controller.DocumentController;
import com.example.demo.doc.dao.DocumentMapper;
import com.example.demo.doc.entity.Document;
import com.example.demo.doc.entity.DocumentExample;
import com.example.demo.doc.entity.DocumentRecord;
import com.example.demo.doc.service.DocumentService;
import com.example.demo.example.dao.StudentMapper;
import com.example.demo.interactive.Construct;
import com.example.demo.util.Base64RAR;
import com.example.demo.util.ImageBase64Converter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DocumentServiceImpl implements DocumentService {

    private static final Logger logger = Logger.getLogger(DocumentServiceImpl.class);

    private DocumentMapper documentMapper;
    @Resource
    public void setDocumentDao(DocumentMapper documentMapper){
        this.documentMapper = documentMapper;
    }

    @Override
    public List<Document> list() {
        DocumentExample example =new DocumentExample();
        example.setOrderByClause("id desc");
        return documentMapper.selectByExample(example);
    }

    @Override
    public int add(DocumentRecord record) {
        Document document = new Document();
        //可按Document内元素顺序写，其中操作id自增
        //文件id，获取上一个文件id+1
        int lastDocumentId;
        Document lastDocument = documentMapper.getLastDocument();
        if (lastDocument == null){
            lastDocumentId = 0;
        }else{
            lastDocumentId = lastDocument.getDocumentId();
        }
        document.setDocumentId(lastDocumentId + 1); //上传文件document id每次加1
        //首次上传设置版本号为1
        document.setVersionId(1);
        if(record.getHistoryDocumentId() != null) {
            document.setHistoryDocumentId(record.getHistoryDocumentId());
        }
        //必填项不做判断
        document.setDocumentName(record.getDocumentName());
        document.setDocumentSecretLevel(record.getDocumentSecretLevel());
        document.setDocumentReleaseNumber(record.getDocumentReleaseNumber());
        document.setDocumentReleaseTime(record.getDocumentReleaseTime());
        document.setOperatorName(record.getOperatorName());
        //document.setOperator_name("admin"); //先默认设置为管理员
        //设置文件操作时间
        document.setOperateTime(new Date());
        if(record.getOperateRemarks() != null) {
            document.setOperateRemarks(record.getOperateRemarks());
        }
        //设置类型为上传操作
        document.setOperateType("upload");
        document.setDocumentText(record.getDocumentText());
        //将图片存储在指定路径，并将路径保存在数据库中
        //暂时以上传文件名为文件夹名，以递增数字为图片名
        if(record.getPictureData() != null) {
            String foldName = record.getDocumentName();
            int pictureName = 1;
            try {
                for (String pictureData : record.getPictureData()) {
                    String unzip = Base64RAR.unZip(pictureData);
                    File picture = ImageBase64Converter.convertBase64ToFile
                            (unzip, Construct.picturePath + "/" + foldName, Integer.toString(pictureName));
                    pictureName++;
                }
            } catch (IOException e1) {
                logger.error("e1 add Base64字符串解压出错!");
                return -1;
            }
            //将图片地址存入数据库中
            document.setPictureLink(Construct.picturePath + "/" + foldName);
        }
        documentMapper.insert(document);
        //id已经自动注入到document bean中
        int id = document.getId();
        //logger.info("add id is " + id);
        return id;
    }

    @Override
    public void delete(int id) {
        documentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Document get(int id) {
        return documentMapper.selectByPrimaryKey(id);
    }

    @Override
    //更新，不是迭代历史版本
    public int edit(DocumentRecord record) {
        int recordId = record.getId();
        Document prevDocument = documentMapper.selectByPrimaryKey(recordId); // 先获取该编辑对象的原始版本
        Document document = new Document();
        //文件id不变
        document.setDocumentId(prevDocument.getDocumentId());
        //编辑后的version id需加1
        int lastVersionId = prevDocument.getVersionId();
        document.setVersionId(lastVersionId + 1);
        //其他信息以编辑后的为准
        //应规定几项不可修改，如历史文件id不变
        document.setHistoryDocumentId(record.getHistoryDocumentId());
        //必填项不做判断
        document.setDocumentName(record.getDocumentName());
        document.setDocumentSecretLevel(record.getDocumentSecretLevel());
        document.setDocumentReleaseNumber(record.getDocumentReleaseNumber());
        document.setDocumentReleaseTime(record.getDocumentReleaseTime());
        document.setOperatorName(record.getOperatorName());
        document.setOperateTime(new Date());
        if(record.getOperateRemarks() != null) {
            document.setOperateRemarks(record.getOperateRemarks());
        }
        //设置操作类型为编辑
        document.setOperateType("edit");
        document.setDocumentText(record.getDocumentText());
        //处理图片
        String pictureLink = prevDocument.getPictureLink();
        //如果图片变更过，将原路径图片都删除并换新图片
        if(record.getPictureFlag()) {
            File pictureFold = new File(pictureLink);
            File[] pictures = pictureFold.listFiles();
            //文件夹不为空则删除全部图片
            if (pictures.length != 0) {
                for (File picture : pictures) {
                    picture.delete();
                }
            }
            if (record.getPictureData() != null) {
                int pictureName = 1;
                try {
                    for (String pictureData : record.getPictureData()) {
                        String unzip = Base64RAR.unZip(pictureData);
                        File picture = ImageBase64Converter.convertBase64ToFile
                                (unzip, pictureLink, Integer.toString(pictureName));
                        pictureName++;
                    }
                } catch (IOException e1) {
                    logger.error("e1 update Base64字符串解压出错!");
                    return -1;
                }
            }
        }
        //沿用之前的文件夹地址
        document.setPictureLink(pictureLink);
        //实际是往数据库新增一条记录
        documentMapper.insert(document);
        //id已经自动注入到document bean中
        int id = document.getId();
        //logger.info("edit id is " + id);
        return id;
    }

}
