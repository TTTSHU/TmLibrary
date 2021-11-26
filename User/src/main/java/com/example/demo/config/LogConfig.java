package com.example.demo.config;

import com.example.demo.Util.IpUtil;

import com.example.demo.entity.LogClass;
import com.example.demo.service.LogService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Aspect
@Component
public class LogConfig {
     @Autowired
    LogService logService;

    //定义切入点
    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void webLog() {
    }
    @Before("webLog()")
    public void logAdvice() throws Throwable {
        // 接收到请求，记录请求内容
        RequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) attributes;
        HttpServletRequest request = sra.getRequest();
        String url = request.getRequestURI().toString();
        String ipv6 = IpUtil.getIp(request);
        LogClass logClass = new LogClass();
        logClass.setAddDate(new Date());
        logClass.setIp(ipv6);
         logClass.setUrl(url);
         boolean save = logService.save(logClass);
         System.out.println(save);
         System.out.println(logClass);
         }
         }
