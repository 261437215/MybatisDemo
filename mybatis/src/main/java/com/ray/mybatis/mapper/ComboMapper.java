package com.ray.mybatis.mapper;

import com.ray.mybatis.entity.Combo;

public interface ComboMapper {
    // 根据id查询运营商拥有的用户和电话信息
    public Combo selectUserById(Integer id);
}
