package com.example.demo.test;

import com.example.demo.example.entity.Student;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

public class TestJackson {

    private static final Logger logger = Logger.getLogger(TestJackson.class);

    public static void main(String[] args) throws JacksonException {
        //序列化
        Student student = new Student();
        long num = 111;
        student.setStudentId(num);
        student.setName("wen");
        student.setScore(100);
        ObjectMapper objectMapper = new ObjectMapper();
        String userJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        logger.info(userJsonString);

        //反序列化
        Student s = objectMapper.readValue(userJsonString, Student.class);
        logger.info(s.getStudentId() + " " + s.getName() + " " + s.getScore());
    }
}
