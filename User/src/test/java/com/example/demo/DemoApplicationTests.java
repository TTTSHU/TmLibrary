package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.Util.RedisUtil;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
  @Autowired()
  UserMapper userMapper;
  @Autowired
  UserService userService;
    @Test
    void contextLoads() {


      //添加对象
//      int adduser = userMapper.adduser("通东", "142332523");
//      System.out.println(adduser);
      //删除对象
//      int deleteuser = userMapper.deleteuser(2);
//      System.out.println(deleteuser);
      //修改对象
//      int assad = userServiceImp.updateuser(3, "assad");
//      int updateuser = userMapper.updateuser(3, "萨达");
//      System.out.println(assad);
//      List<User> users = userMapper.selectList(null);
//      for (Object o :users) {
//        System.out.println(o);
//      }
//      Integer integer = userMapper.selectCount(null);
//      System.out.println("--------------"+integer);
//      List<User> users = userMapper.PagUser(0, 1);
//      for (Object o :users) {
//        System.out.println(user);
//      }
      /*
      * count():
      * */
//      Serializable i = new Integer(6);
//      User user = new User();
//      int userId = user.getUserId();
//      System.out.println(userId);
//      QueryWrapper<User> wrapper = new QueryWrapper<>();
//      wrapper.eq("user_id","3");
//      boolean b = userService.removeById(i);
//      System.out.println(b);
    }

}
