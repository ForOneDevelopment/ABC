package com.example.demo.doc.controller;

import com.example.demo.doc.entity.DocumentRecord;
import com.example.demo.doc.service.DocumentService;
import com.example.demo.interactive.RestResponse;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        logger.info("add Document!");
        RestResponse restResponse = new RestResponse();
        String result;
        DocumentRecord record;
        //将前端发来的JSON反序列化，转为DocumentRecord
        try {
            record = objectMapper.readValue(JSONString, DocumentRecord.class);
        }catch (Exception e1){
            //打出错误日志
            logger.error("e1 addDocument JSON数据格式有误，解析JSON数据失败: ");
            //e1.printStackTrace();
            //通过接口返回，服务器无法根据客户端请求的内容特性完成请求(Not Acceptable)
            restResponse.setCode(406);
            restResponse.setMessage("JSON数据格式有误，解析JSON数据失败!");
            try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
            }catch (Exception e2){
                logger.error("e2 addDocument 后台回应转JSON数据失败: ");
                //e2.printStackTrace();
                return "后台回应转JSON数据失败!";
            }
            return result;
        }
        //成功获取到Record,注意service层是否有异常！
        //执行业务代码
        documentService.add(record);
        restResponse.setCode(200);
        restResponse.setMessage("上传数据成功！");
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
        }catch (Exception e3){
            logger.error("e3 addDocument 后台回应转JSON数据失败: ");
            //e3.printStackTrace();
            return "后台回应转JSON数据失败!";
        }
        return result;
    }

    @PostMapping("/document/update")
    public String updateDocument(@RequestBody String JSONString) {
        logger.info("update Document!");
        RestResponse restResponse = new RestResponse();
        String result;
        DocumentRecord record;
        //将前端发来的JSON反序列化，转为DocumentRecord
        try {
            record = objectMapper.readValue(JSONString, DocumentRecord.class);
        }catch (Exception e1){
            //打出错误日志
            logger.error("e1 updateDocument JSON数据格式有误，解析JSON数据失败: ");
            //e1.printStackTrace();
            //通过接口返回，服务器无法根据客户端请求的内容特性完成请求(Not Acceptable)
            restResponse.setCode(406);
            restResponse.setMessage("JSON数据格式有误，解析JSON数据失败!");
            try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
            }catch (Exception e2){
                logger.error("e2 updateDocument 后台回应转JSON数据失败: ");
                //e2.printStackTrace();
                return "后台回应转JSON数据失败!";
            }
            return result;
        }
        //成功获取到Record,注意service层是否有异常！
        //执行业务代码
        documentService.update(record);
        restResponse.setCode(200);
        restResponse.setMessage("上传编辑后的数据成功！");
        try {
            result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
        }catch (Exception e3){
            logger.error("e3 updateDocument 后台回应转JSON数据失败: ");
            //e3.printStackTrace();
            return "后台回应转JSON数据失败!";
        }
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
