package com.example.demo.doc.service;

import com.example.demo.doc.entity.Document;
import com.example.demo.doc.entity.DocumentRecord;

import java.util.List;

public interface DocumentService {
    List<Document> list();

    int add(DocumentRecord record);

    int delete(DocumentRecord record);

    Document get(int id);

    int edit(DocumentRecord record);

    List<Document> search(String keyword);
}
