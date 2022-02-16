package com.example.demo.doc.service;

import com.example.demo.doc.entity.Document;

import java.util.List;

public interface DocumentService {
    List<Document> list();

    void add(Document document);

    void delete(int id);

    Document get(int id);

    void update(Document document);
}
