package com.example.demo.example.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestfulController {

    private static final Logger logger = Logger.getLogger(RestfulController.class);

    @GetMapping("/get")
    public String get() {
        logger.info("get方式!");
        return "get方式!";
    }

    @PostMapping("/post")
    public String post(@RequestBody String msg) {
        logger.info("post方式!");
        return msg;
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
