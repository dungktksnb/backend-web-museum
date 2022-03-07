package com.example.demo.dto.response;

public class ResponseBody {
    private String responseCode;
    private String responseMessage;
    private Object responseData;
    public ResponseBody(Response response, Object data) {
        this.responseCode = response.getResponseCode();
        this.responseMessage = response.getResponseMessage();
        this.responseData = data;
    }

}
