package com.ray.mybatis.mapper;

import com.ray.mybatis.entity.IDCard;

import java.util.List;

public interface IDCardMapper {

    /**
    *  @Date: 2020/10/4
     * @Description: 获取用户信息的身份证列表
    */
    public List<IDCard> selectIdOfUser();
}
