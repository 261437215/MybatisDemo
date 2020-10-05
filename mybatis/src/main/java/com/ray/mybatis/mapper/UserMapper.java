package com.ray.mybatis.mapper;

import com.ray.mybatis.entity.User;
import com.ray.mybatis.utils.Result;

import java.util.List;

// 数据操作层
public interface UserMapper {

    // 根据id获取用户信息
    public User selectById(Integer id);

    //查询所有用户信息
    public List<User> list();

    // 新增用户
    public int insert(User user);

    //修改用户
    public int update(User user);

    //删除用户信息
    public int delete(Integer id);

    // 根据用户id查询所有的用户电话信息
    public User selectPhoneById(Integer id);

    // 根据id查询用户选择的运营商
    public User selectComboById(Integer id);

}

