package com.example.demo.doc.service.impl;

import com.example.demo.doc.dao.DocumentMapper;
import com.example.demo.doc.entity.Document;
import com.example.demo.doc.entity.DocumentExample;
import com.example.demo.doc.entity.DocumentRecord;
import com.example.demo.doc.service.DocumentService;
import com.example.demo.example.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DocumentServiceImpl implements DocumentService {

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
    public void add(DocumentRecord record) {
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
        document.setHistoryDocumentId(record.getHistoryDocumentId());
        document.setDocumentName(record.getDocumentName());
        document.setDocumentSecretLevel(record.getDocumentSecretLevel());
        document.setDocumentReleaseNumber(record.getDocumentReleaseNumber());
        document.setDocumentReleaseTime(record.getDocumentReleaseTime());
        document.setOperatorName(record.getOperatorName());
        //document.setOperator_name("admin"); //先默认设置为管理员
        //设置文件操作时间
        document.setOperateTime(new Date());
        document.setOperateRemarks(record.getOperateRemarks());
        //设置类型为上传操作
        document.setOperateType("upload");
        document.setDocumentText(record.getDocumentText());
        documentMapper.insert(document);
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
    public void update(Document document) {
        int Id = document.getId();
        Document prevDocument = documentMapper.selectByPrimaryKey(Id); // 先获取该编辑对象的原始版本
        // 编辑后的version id需加1
        int lastVersionId = prevDocument.getVersionId();
        document.setVersionId(lastVersionId + 1);
        // 赋值其他非自动生成信息
        document.setDocumentId(prevDocument.getDocumentId());  // 设置文件document id不变
        document.setOperateType("edit");  // 设置操作类型
        document.setOperateTime(new Date());  // 设置操作时间

        documentMapper.insert(document); // 实际是往数据库新增一条记录
    }

}
