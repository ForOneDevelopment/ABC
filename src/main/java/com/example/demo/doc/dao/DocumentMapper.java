package com.example.demo.doc.dao;

import com.example.demo.doc.entity.Document;
import com.example.demo.doc.entity.DocumentExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Document record);

    int insertSelective(Document record);

    List<Document> selectByExample(DocumentExample example);

    Document selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);

    //获取上一个最大的文件版本号
    Document getBiggestDocument();

    List<Document> selectAllDocuments();
}