package com.example.demo.conteoller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.Util.IpUtil;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
   @Autowired
   UserService userService;
   //登录user
    @ResponseBody
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") int password,
                        HttpServletRequest request){
        if (password==12346&&!username.isEmpty()){
            request.getSession().setAttribute("user",username);
            return "登录成功！";
        }
        return "登录失败！";
    }
   //查询所有数据
   @PostMapping("/user")
    @ResponseBody
    public List<User> alluser(){
        List<User> list = userService.list();
        return list;
    }
    //添加user表的数据
    @ResponseBody
    @PostMapping("/adduser")
    public String adduser(User user){
//        Map map = new HashMap();
//        map.put(userName,0);
//        map.put(a,0);
//        map.put(Birthday,0);
        boolean b = userService.save(user);
        if (b==true){
            return "添加成功！";
        }
        return "添加失败";
    }
    //根据id删除表
    @ResponseBody
    @PostMapping("/delete")
    public String deleteuser(User user){

        boolean removeById = userService.removeById(user.getUserId());
        if (removeById==true){
            return "删除成功！";
        }
        return "删除失败";
    }
    //根据id修改姓名
    @ResponseBody
    @PostMapping("/update")
    public String updateuser(User user){
//        System.out.println(id);
        boolean b = userService.updateById(user);
        if (b==true){
            return "修改成功！";
        }
        return "修改失败";
    }
    //分页查询数据
    @ResponseBody
    @PostMapping("/pnuser/{pn}")
    public List pag(@PathVariable int pn){
        User user = new User();
        //pn==页数
        //num==每页查询数
        int num=2;
        //start==索引开始的位置
        int start=(pn-1)*num;
        int pages= userService.count();
        //总共的页数
        int pagess =(pages+1)/num;
        Page<User> page = userService.page(new Page<>(start, num));
        List pageRecords = page.getRecords();

        pageRecords.add("第"+pn+"页"+"共"+pages+"条数据"+"共"+pagess+"页");
        return pageRecords;
    }
    @ResponseBody
    @PostMapping("/ip")
    public String getip(HttpServletRequest request){
        String ip = IpUtil.getIp(request);
        return ip;
    }

}
