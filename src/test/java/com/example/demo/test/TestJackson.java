package com.example.demo.test;

import com.example.demo.doc.entity.Document;
import com.example.demo.doc.entity.DocumentExample;
import com.example.demo.doc.entity.DocumentRecord;
import com.example.demo.doc.service.DocumentService;
import com.example.demo.example.entity.Student;
import com.example.demo.util.ImageBase64Converter;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestJackson {

    private static final Logger logger = Logger.getLogger(TestJackson.class);

    @Autowired
    private DocumentService documentService;

    @Test
    public void test() throws JacksonException {
        //序列化
        Student student = new Student();
        long num = 111;
        student.setStudentId(num);
        student.setName("wen");
        student.setScore(100);
        student.setTime(new Date());
        ObjectMapper objectMapper = new ObjectMapper();
        String userJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        //logger.info(userJsonString);

        //反序列化
        Student s = objectMapper.readValue(userJsonString, Student.class);
        //logger.info(s.getStudentId() + " " + s.getName() + " " + s.getScore() + s.getTime());

        DocumentRecord record = new DocumentRecord();
        record.setHistoryDocumentId("100");
        record.setDocumentName("ABC");
        record.setDocumentSecretLevel("DEF");
        record.setDocumentReleaseNumber("egf");
        record.setDocumentReleaseTime("2022-10-10");
        record.setOperatorName("1111");
        record.setOperateRemarks("11111");
        record.setDocumentText("3333333");
        File pic1 = new File("/Users/hui/Desktop/picture/28509b4e7b9afcea822545b6ec237409.jpeg");
        String beforeZip1 = ImageBase64Converter.convertFileToBase64(pic1.getAbsolutePath());
        File pic2 = new File("/Users/hui/Desktop/picture/4eb71dd2e62c818aba6dbea0e5989b10.jpeg");
        String beforeZip2 = ImageBase64Converter.convertFileToBase64(pic2.getAbsolutePath());
        List<String> pictures = new ArrayList<>();
        pictures.add(beforeZip1);
        pictures.add(beforeZip2);
        record.setPictureData(pictures);
        record.setPictureFlag(true);
        String JsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(record);
        logger.info(JsonString);
        int id = documentService.add(record);
        logger.info("id is " + id);
    }

    @Test
    public void test2() throws JacksonException {
        ObjectMapper objectMapper = new ObjectMapper();
        DocumentRecord record = new DocumentRecord();
        record.setHistoryDocumentId("100");
        record.setDocumentName("改动");
        record.setDocumentSecretLevel("随意");
        record.setDocumentReleaseNumber("没有");
        record.setDocumentReleaseTime("2022-12-12");
        record.setOperatorName("文");
        record.setOperateRemarks("00000");
        record.setDocumentText("全部改动");
        File pic1 = new File("/Users/hui/Desktop/picture/28509b4e7b9afcea822545b6ec237409.jpeg");
        String beforeZip1 = ImageBase64Converter.convertFileToBase64(pic1.getAbsolutePath());
        File pic2 = new File("/Users/hui/Desktop/picture/4eb71dd2e62c818aba6dbea0e5989b10.jpeg");
        String beforeZip2 = ImageBase64Converter.convertFileToBase64(pic2.getAbsolutePath());
        List<String> pictures = new ArrayList<>();
        pictures.add(beforeZip1);
        //pictures.add(beforeZip2);
        record.setPictureData(pictures);
        record.setPictureFlag(true);
        String JsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(record);
        logger.info(JsonString);
    }
}
