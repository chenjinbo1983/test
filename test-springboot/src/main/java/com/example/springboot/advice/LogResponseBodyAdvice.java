package com.example.springboot.advice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 输出日志切面
 */
@ControllerAdvice
public class LogResponseBodyAdvice implements ResponseBodyAdvice {
 
    private static Logger logger = Logger.getLogger(LogResponseBodyAdvice.class);
 
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }
 
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        long endTime = System.currentTimeMillis();
//        try{
//            logger.info("frontCall：url——"+request.getURI().getPath()+",ReturnTime"+endTime+" ,OutParam——"+new Gson().toJson(body));
//        }catch (Exception e){
//            System.out.println("actuator执行时，Gson解析body异常");
//        }
        return body;
    }
}