package com.example.demo.doc.controller;

import com.example.demo.doc.entity.DocumentRecord;
import com.example.demo.doc.service.DocumentService;
import com.example.demo.interactive.Constant;
import com.example.demo.interactive.RestResponse;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DocumentController {

    private static final Logger logger = Logger.getLogger(DocumentController.class);

    private DocumentService documentService;
    @Autowired
    public void setDocumentService(DocumentService documentService){
        this.documentService = documentService;
    }

    //JSON jackson
    ObjectMapper objectMapper = new ObjectMapper();

    @PostMapping("/document/test")
    public String test(){
        return "111";
    }

    @PostMapping("/document/add")
    public String addDocument(@RequestBody String JSONString) {
        logger.info("正在上传文件...");
        RestResponse restResponse = new RestResponse();
        String result;
        DocumentRecord record;
        //将前端发来的JSON反序列化，转为DocumentRecord
        try {
            record = objectMapper.readValue(JSONString, DocumentRecord.class);
        }catch (Exception e1){
            //打出错误日志
            logger.error("e1 addDocument JSON数据格式有误，解析JSON数据失败!");
            //通过接口返回，服务器无法根据客户端请求的内容特性完成请求(Not Acceptable)
            restResponse.setCode(406);
            restResponse.setMessage("JSON数据格式有误，解析JSON数据失败!");
            try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
            }catch (Exception e2){
                logger.error("e2 addDocument 后台回应转JSON数据失败!");
                return "后台回应转JSON数据失败!";
            }
            return result;
        }
        //成功获取到Record,注意service层是否有异常！
        int id = documentService.add(record);
        //插入数据失败
        if (id == -1) {
            //之前曾上传过同名文件
            //前提条件失败
            restResponse.setCode(412);
            restResponse.setMessage("之前已上传过同名文件！");
            logger.info("上传文件失败!");
        } else {
            //插入数据成功，并返回id
            restResponse.setCode(200);
            restResponse.setMessage("上传数据成功!");
            restResponse.setData(id);
        }
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
        } catch (Exception e3) {
            logger.error("e3 addDocument 后台回应转JSON数据失败!");
            return "后台回应转JSON数据失败!";
        }
        if(restResponse.getCode() == 200) {
            logger.info("上传文件成功！");
        }
        return result;
    }

    @PostMapping("/document/edit")
    public String updateDocument(@RequestBody String JSONString) {
        logger.info("正在更新文件...");
        RestResponse restResponse = new RestResponse();
        String result;
        DocumentRecord record;
        //将前端发来的JSON反序列化，转为DocumentRecord
        try {
            record = objectMapper.readValue(JSONString, DocumentRecord.class);
        }catch (Exception e1){
            //打出错误日志
            logger.error("e1 updateDocument JSON数据格式有误，解析JSON数据失败!");
            //e1.printStackTrace();
            //通过接口返回，服务器无法根据客户端请求的内容特性完成请求(Not Acceptable)
            restResponse.setCode(406);
            restResponse.setMessage("JSON数据格式有误，解析JSON数据失败!");
            try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
            }catch (Exception e2){
                logger.error("e2 updateDocument 后台回应转JSON数据失败!");
                //e2.printStackTrace();
                return "后台回应转JSON数据失败!";
            }
            return result;
        }
        //成功获取到Record,注意service层是否有异常！
        //执行业务代码
        int id = documentService.edit(record);
        //插入数据成功，并返回id
        restResponse.setCode(200);
        restResponse.setMessage("上传编辑后的数据成功!");
        restResponse.setData(id);
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
        }catch (Exception e3){
            logger.error("e3 updateDocument 后台回应转JSON数据失败!");
            //e3.printStackTrace();
            return "后台回应转JSON数据失败!";
        }
        logger.info("更新文件成功!");
        return result;
    }

    @PostMapping("document/delete")
    public String deleteDocument(@RequestBody String JSONString){
        logger.info("正在删除文件...");
        RestResponse restResponse = new RestResponse();
        String result;
        DocumentRecord record;
        //将前端发来的JSON反序列化，转为DocumentRecord
        try {
            record = objectMapper.readValue(JSONString, DocumentRecord.class);
        }catch (Exception e1){
            //打出错误日志
            logger.error("e1 deleteDocument JSON数据格式有误，解析JSON数据失败!");
            //e1.printStackTrace();
            //通过接口返回，服务器无法根据客户端请求的内容特性完成请求(Not Acceptable)
            restResponse.setCode(406);
            restResponse.setMessage("JSON数据格式有误，解析JSON数据失败!");
            try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
            }catch (Exception e2){
                logger.error("e2 deleteDocument 后台回应转JSON数据失败!");
                //e2.printStackTrace();
                return "后台回应转JSON数据失败!";
            }
            return result;
        }
        //执行删除操作
        int id = documentService.delete(record);
        //删除数据成功，并返回id
        restResponse.setCode(200);
        restResponse.setMessage("删除数据成功!");
        restResponse.setData(id);
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
        }catch (Exception e3){
            logger.error("e3 deleteDocument 后台回应转JSON数据失败!");
            //e3.printStackTrace();
            return "后台回应转JSON数据失败!";
        }
        logger.info("删除文件成功!");
        return result;
    }

    @RequestMapping("/document/search")
    public String searchDocument(@RequestBody String keywordString) {
        logger.info("search Document!");
        RestResponse restResponse = new RestResponse();
        String result;
        //获取到关键词字符串，执行业务代码
        List searchResult = documentService.search(keywordString);
        restResponse.setCode(200);
        restResponse.setMessage("搜索成功！");
        restResponse.setData(searchResult);
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
        }catch (Exception e3){
            logger.error("e3 updateDocument 后台回应转JSON数据失败: ");
            //e3.printStackTrace();
            return "后台回应转JSON数据失败!";
        }
        return result;
    }
}
