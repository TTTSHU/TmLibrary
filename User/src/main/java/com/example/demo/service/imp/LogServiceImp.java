package com.example.demo.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.dao.LogMapper;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.LogClass;
import com.example.demo.entity.User;
import com.example.demo.service.LogService;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImp extends ServiceImpl<LogMapper, LogClass> implements LogService {
}
