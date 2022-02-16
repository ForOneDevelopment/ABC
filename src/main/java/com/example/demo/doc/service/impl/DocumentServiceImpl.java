package com.example.demo.doc.service.impl;

import com.example.demo.doc.dao.DocumentMapper;
import com.example.demo.doc.entity.Document;
import com.example.demo.doc.entity.DocumentExample;
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
    public void add(Document document) {

        int beginVersionId = 1;
//        String operatorName = "admin";

        Document lastDocument = documentMapper.getLastDocument();
        int lastDocumentId = lastDocument.getId();

        // 设置需要自动生成的属性
        document.setDocumentId(lastDocumentId+1); //上传文件document id每次加1
        document.setVersionId(beginVersionId); // 首次上传版本version id总为1
//        document.setOperator_name("admin"); //先默认设置为管理员
        document.setOperateType("upload"); // 上传操作
        document.setOperateTime(new Date());  //设置文件操作时间

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
        int lastVersionId = document.getVersionId();
        document.setVersionId(lastVersionId + 1);
        documentMapper.updateByPrimaryKeySelective(document);
    }

}
