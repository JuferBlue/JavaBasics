package com.blue.mapper;

import com.blue.mybatis.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //运行时,会自动生成实现类代理对象，交给Spring管理
public interface UserMapper {
    @Select("select * from user")
    //查询全部用户信息
    public List<User> userList();
}
