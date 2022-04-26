package com.example.demo.interactive;

//前后端交互接口，通用对象模型
public class RestResponse {
    //HTTP状态码
    private int code;
    //具体信息
    private String message;
    //返回对象
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
