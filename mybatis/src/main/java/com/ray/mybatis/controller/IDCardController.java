package com.ray.mybatis.controller;

import com.ray.mybatis.entity.IDCard;
import com.ray.mybatis.mapper.IDCardMapper;
import com.ray.mybatis.utils.Result;
import com.ray.mybatis.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.RelationSupport;
import java.util.List;

/**
 * Date: 2020-10-04
 */
@RestController
public class IDCardController {
    @Autowired
    private IDCardMapper idCardMapper;

    /**
     *  获取用户信息的身份证列表
     *  localhost:8080/selectIdOfUser
     */
    @GetMapping("/selectIdOfUser")
    public Result listOfUser(){
        List<IDCard> idCards = idCardMapper.selectIdOfUser();
        return ResultUtil.success(idCards);
    }

}
