package com.blue.springboot;

import com.blue.mapper.UserMapper;
import com.blue.mybatis.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest//springboot整合单元测试类的注解
class ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testUserMapper(){
        List<User> userList = userMapper.userList();
        userList.stream().forEach(System.out::println);

    }


}
