package com.example.demo.test;
import org.apache.log4j.Logger;

public class TestLog {
    private static final Logger logger = Logger.getLogger(TestLog.class);

    public static void main(String[] args) {
        //设置里最低级别为info，打不出debug
        logger.debug("2222222");
        logger.info("111111");
        logger.warn("333333");
        logger.error("444444");
    }
}

