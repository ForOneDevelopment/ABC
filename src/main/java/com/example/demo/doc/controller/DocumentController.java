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
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/document/post")
    public String postDocument(@RequestBody String JSONString) {
        logger.info("postDocument!");
        RestResponse restResponse = new RestResponse();
        String result;
        DocumentRecord record;
        //将前端发来的JSON反序列化，转为DocumentRecord
        try {
            record = objectMapper.readValue(JSONString, DocumentRecord.class);
        }catch (Exception e1){
            //打出错误日志
            logger.error("e1 postDocument JSON数据格式有误，解析JSON数据失败: ");
            //e1.printStackTrace();
            //通过接口返回，服务器无法根据客户端请求的内容特性完成请求(Not Acceptable)
            restResponse.setCode(406);
            restResponse.setMessage("JSON数据格式有误，解析JSON数据失败!");
            try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(restResponse);
            }catch (Exception e2){
                logger.error("e2 postDocument 后台回应转JSON数据失败: ");
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
            logger.error("e3 postDocument 后台回应转JSON数据失败: ");
            //e3.printStackTrace();
            return "后台回应转JSON数据失败!";
        }
        return result;
    }
}
