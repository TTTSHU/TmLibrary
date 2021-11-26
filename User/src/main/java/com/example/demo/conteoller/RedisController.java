package com.example.demo.conteoller;

import com.example.demo.Util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RedisController {
    @Autowired
    RedisUtil redisUtil;
    @PostMapping("/redis")
    public String addredis(){
        redisUtil.hPut("011","移动","200");
        redisUtil.hPut("011","电信","100");
        return "添加成功!";
    }
    @PostMapping("/getredis")
    public Map<Object, Object> getredis(){
        return redisUtil.hGetAll("011");
    }
}
