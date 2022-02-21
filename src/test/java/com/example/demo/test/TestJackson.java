package com.example.demo.test;

import com.example.demo.doc.entity.DocumentExample;
import com.example.demo.doc.entity.DocumentRecord;
import com.example.demo.example.entity.Student;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.util.Date;

public class TestJackson {

    private static final Logger logger = Logger.getLogger(TestJackson.class);

    public static void main(String[] args) throws JacksonException {
        //序列化
        Student student = new Student();
        long num = 111;
        student.setStudentId(num);
        student.setName("wen");
        student.setScore(100);
        student.setTime(new Date());
        ObjectMapper objectMapper = new ObjectMapper();
        String userJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        logger.info(userJsonString);

        //反序列化
        Student s = objectMapper.readValue(userJsonString, Student.class);
        logger.info(s.getStudentId() + " " + s.getName() + " " + s.getScore() + s.getTime());

        DocumentRecord record = new DocumentRecord();
        record.setHistoryDocumentId("100");
        record.setDocumentName("ABC");
        record.setDocumentSecretLevel("DEF");
        record.setDocumentReleaseNumber("egf");
        record.setDocumentReleaseTime("2022-10-10");
        record.setOperatorName("1111");
        record.setOperateRemarks("11111");
        record.setDocumentText("3333333");
        String JsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(record);
        logger.info(JsonString);


    }
}
