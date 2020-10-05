package com.ray.mybatis.controller;

import com.ray.mybatis.entity.Combo;
import com.ray.mybatis.mapper.ComboMapper;
import com.ray.mybatis.utils.Result;
import com.ray.mybatis.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2020-10-05
 */
@RestController
public class ComboController {
    @Autowired
    private ComboMapper comboMapper;

    /**
    *  @Date: 2020/10/5
     * @Description: 根据id查询运营商拥有的用户和电话信息
    */
    @GetMapping("/combo/user/{id}")
    public Result selectUserById(@PathVariable("id") Integer id){
        Combo combo = comboMapper.selectUserById(id);
        return ResultUtil.success(combo);
    }
}
