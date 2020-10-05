package com.ray.mybatis.controller;

import com.ray.mybatis.mapper.UserMapper;
import com.ray.mybatis.entity.User;
import com.ray.mybatis.utils.Result;
import com.ray.mybatis.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Date: 2020-10-04
 */

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;


    /**
    *  @Date: 2020/10/4
     * @Description: 根据id获取信息
    */
    @GetMapping("/user/{id}")
    public User selectById(@PathVariable("id") Integer id){
        User user = userMapper.selectById(id);
        return user;
    }


    /**
    *  @Date: 2020/10/4
     * @Description: 查询所有用户信息
    */
    @GetMapping("/user/all")
    public List<User> list(){
        List<User> userList = userMapper.list();
        return userList;
    }


    /**
    *  @Date: 2020/10/4
     * @Description: 新增用户信息
    */
    @PostMapping("/user")
    public String insert(User user){
        int result = userMapper.insert(user);
        if (result == 1){
            return "success";
        }
        return "null";
    }


    /**
    *  @Date: 2020/10/4
     * @Description: 修改用户信息
    */
    @PostMapping("user/{id}")
    public String update(User user,@PathVariable("id") Integer id){
        int result = userMapper.update(user);
        if (result == 1){
            return "success";
        }
        return "fail";
    }


    /**
    *  @Date: 2020/10/4
     * @Description: 删除用户信息
    */
    @DeleteMapping("user/{id}")
    public String delete(@PathVariable("id") Integer id){
        int result = userMapper.delete(id);
        if (result == 1){
            return "success";
        }
        return "fail";
    }


    /**
    *  @Date: 2020/10/5
     * @Description: 根据id查询用户的所有电话信息(一对多)
    */
    @GetMapping("/user/phone/{id}")
    public User selectPhoneById(@PathVariable("id") Integer id){
        User user = userMapper.selectPhoneById(id);
        return user;
    }

    @GetMapping("/user/combo/{id}")
    public Result selectComboById(@PathVariable("id") Integer id){
        User users = userMapper.selectComboById(id);
        return ResultUtil.success(users);
    }
}
