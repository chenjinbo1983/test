package com.example.springboot.interceptor;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器：设置请求、响应字符集；输入日志添加
 */
public class AuthInterceptor implements HandlerInterceptor {

    private static Logger logger = Logger.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("UTF-8");
        //请求的url
        String path = request.getContextPath();
        String serverPortStr = request.getServerPort() == 80 ? "" : ":" + request.getServerPort();
        String servletPath = request.getServletPath();
        String queryString = request.getQueryString();
        String url = request.getScheme() + "://" + request.getServerName() + serverPortStr + path + servletPath +
                (StringUtils.isNotBlank(queryString)?("?" + queryString):"");
        long beginTime = System.currentTimeMillis();
//        logger.info("frontCall：url——"+url +",CallTime——" + beginTime + " ,InParam——"+new Gson().toJson(request.getParameterMap()));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        response.setCharacterEncoding("UTF-8");
        //String methodName = request.getMethod();

        //System.out.println("frontCall：MethodName——"+methodName+",InParam"+new Gson().toJson(handler));
        //logger.info("frontCall：MethodName——"+methodName+",InParam"+new Gson().toJson(handler));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
