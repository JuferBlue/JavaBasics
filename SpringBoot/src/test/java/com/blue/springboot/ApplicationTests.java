package com.blue.springboot;

import com.blue.mapper.EmpMapper;
import com.blue.mapper.UserMapper;
import com.blue.mybatis.Emp;
import com.blue.mybatis.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest//springboot整合单元测试类的注解
class ApplicationTests {

    @Autowired
    private EmpMapper empMapper;

//    @Test
//    public void testDelete(){
//        empMapper.deleteById(16);
//    }



    @Test
    public void testGetByCondition(){
        List<Emp> list = empMapper.getByCondition("张", (short) 1, LocalDate.of(2010, 1, 1), LocalDate.of(2022, 1, 1));
        list.forEach(System.out::println);
    }
}
