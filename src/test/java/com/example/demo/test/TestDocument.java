package com.example.demo.test;

import com.example.demo.doc.entity.Document;
import com.example.demo.doc.service.DocumentService;
import com.example.demo.example.service.impl.StudentServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDocument {

    private static final Logger logger = Logger.getLogger(StudentServiceImpl.class);

    @Autowired
    DocumentService documentService;

    @Test
    public void contextLoads() throws SQLException {
        logger.info("start...");
        logger.info("update success!");
    }
}
