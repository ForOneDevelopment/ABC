package com.example.demo.doc.service;

import com.example.demo.doc.entity.Document;
import com.example.demo.doc.entity.DocumentRecord;

import java.util.List;

public interface DocumentService {
    List<Document> list();

    void add(DocumentRecord record);

    void delete(int id);

    Document get(int id);

    void update(Document document);
}
