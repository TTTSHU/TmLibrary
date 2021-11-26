package com.example.demo.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServuceImp  extends ServiceImpl<UserMapper,User> implements UserService {
    @Autowired
    StringRedisTemplate template;

    @Override
    public String getUserById() {

        return null;
    }
}
