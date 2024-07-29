package com.blue.springboot;

import com.blue.mapper.EmpMapper;
import com.blue.mapper.UserMapper;
import com.blue.mybatis.Emp;
import com.blue.mybatis.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.ibatis.jdbc.Null;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.*;

//@SpringBootTest//springboot整合单元测试类的注解
class ApplicationTests {

    @Autowired
    private EmpMapper empMapper;

//    @Test
//    public void testDelete(){
//        empMapper.deleteById(16);
//    }



//    @Test
//    public void testGetByCondition(){
//        List<Emp> list = empMapper.getByCondition(null, null, LocalDate.of(2010, 1, 1), LocalDate.of(2022, 1, 1));
//        list.forEach(System.out::println);
//    }

    //批量删除员工
    @Test
    public void testDeleteByIds(){
        List<Integer> ids = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        empMapper.deleteByIds(ids);
    }

//    生成JWT
    @Test
    public void testGenJWT(){
        Map<String,Object> claims = new HashMap<>();
        claims.put("id",1);
        claims.put("name","blue");

        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256,"blue")//签名算法
                .setClaims(claims)//设置载荷
                .setExpiration(new Date(System.currentTimeMillis()+3600*1000))
                .compact();//设置有效期
        System.out.println(jwt);
    }

//    解析JWT
    @Test
    public void testParseJwt(){
        Claims claims = Jwts.parser()
                .setSigningKey("blue")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiYmx1ZSIsImlkIjoxLCJleHAiOjE3MjIyMzg5MzF9.t-7wkYmZbBaQ9kp4614So6dTB8BYsGvq1QX01RkFcJA")
                .getBody();
        System.out.println(claims);
    }

}
