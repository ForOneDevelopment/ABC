package com.example.demo.example.controller;

import com.example.demo.example.entity.Student;
import com.example.demo.example.service.StudentService;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestfulController {

    private static final Logger logger = Logger.getLogger(RestfulController.class);

    private StudentService studentService;
    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping("/get")
    public String get() {
        logger.info("get方式!");
        return "get方式!";
    }

    @PostMapping("/post")
    public String post(@RequestBody String msg) throws JacksonException {
        logger.info("post方式!");
        //反序列化
        ObjectMapper objectMapper = new ObjectMapper();
        Student s = objectMapper.readValue(msg, Student.class);
        logger.info(s.getStudentId() + " " + s.getName() + " " + s.getScore());
        studentService.insert(s);
        return "success!!!";
    }

    @PutMapping("/put")
    public String put(@RequestBody String msg) {
        logger.info("put方式!");
        return msg;
    }

    @DeleteMapping("/delete")
    public String delete(String msg) {
        logger.info("delete方式!");
        return "delete " + msg + " success!";
    }

    /**
     * 设置返回状态为417
     *
     * @param msg
     * @return
     */
    @GetMapping("/status")
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public String status(String msg) {
        logger.info("status方式!");
        return msg;
    }
}
