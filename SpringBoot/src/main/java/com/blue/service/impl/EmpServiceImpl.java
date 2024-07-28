package com.blue.service.impl;

import com.blue.mapper.EmpMapper;
import com.blue.mybatis.Emp;
import com.blue.mybatis.PageBean;
import com.blue.service.EmpService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.service.impl
 * @Author: JuferBlue
 * @CreateTime: 2024-07-28  21:11
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize) {
        //1.设置分页参数
        PageHelper.startPage(page,pageSize);
        //2.执行查询
        List<Emp> empList = empMapper.getAll();
        Page<Emp> p = (Page<Emp>) empList;

        //3.封装PageBean对象
        PageBean pageBean = new PageBean(p.getTotal(),p.getResult());
        System.out.println("我是开始");
        System.out.println(p.getResult());
        System.out.println("我是结束");
        return pageBean;
    }
}
