package com.example.demo.test;

import com.example.demo.util.Base64RAR;
import com.example.demo.util.ImageBase64Converter;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class TestPicture {

    private static final Logger logger = Logger.getLogger(TestPicture.class);

    public static void main(String[] args) throws IOException {
        test2();
    }

    //测试用字符串还原图片
    public static void test2() throws IOException {
        File pic = new File("/Users/hui/Desktop/picture/28509b4e7b9afcea822545b6ec237409.jpeg");
        String beforeZip = ImageBase64Converter.convertFileToBase64(pic.getAbsolutePath());
        String zip = Base64RAR.zipBase64(beforeZip);
        logger.info(zip.length());
        String unzip = Base64RAR.unZip(zip);
        File another = ImageBase64Converter.convertBase64ToFile(unzip,"/Users/hui/Desktop/picture", "a.jpeg");
    }

    //测试将制定文件夹的图片转为压缩Base64字符串
    public static void test1() throws IOException {
        File folder = new File("/Users/hui/Desktop/picture");
        StringBuilder jsonString = new StringBuilder();
        int number = 0;
        if (!folder.exists()) {
            logger.error("No such directory!");
        }
        if (!folder.isDirectory()) {
            logger.error("This folder is not a directory!");
        } else {
            //取出文件夹中所有文件
            File[] files = folder.listFiles();
            if (files.length == 0) {
                logger.info("Empty directory!");
            } else {
                for (File file : files) {
                    if (!file.getName().equals(".DS_Store")) {
                        logger.info(file.getAbsolutePath());
                    /*jsonString.append("picture").append(number++).append(" ")
                            .append(ImageBase64Converter.convertFileToBase64(file.getAbsolutePath()))
                            .append(" ");*/
                        jsonString.append(ImageBase64Converter.convertFileToBase64(file.getAbsolutePath()));
                    }
                }
                logger.info("before zip " + jsonString.toString().length());
                String zip = Base64RAR.zipBase64(jsonString.toString());
                logger.info("zip " + zip.length());
            }
        }
    }
}
