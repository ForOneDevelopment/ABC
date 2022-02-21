package com.example.demo.doc.controller;

import com.example.demo.doc.service.DocumentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {

    private static final Logger logger = Logger.getLogger(DocumentController.class);

    private DocumentService documentService;
    @Autowired
    public void setDocumentService(DocumentService documentService){
        this.documentService = documentService;
    }

}
