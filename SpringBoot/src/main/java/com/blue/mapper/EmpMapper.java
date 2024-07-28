package com.blue.mapper;

import com.blue.mybatis.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Mapper
public interface EmpMapper {
     //根据ID 删除数据
     @Delete("delete from emp where id=#{id}")
     public void deleteById(Integer id); //参数id与注解id绑定


     //插入数据
     @Options(useGeneratedKeys = true,keyProperty = "id")//主键回填
     @Insert("insert into emp(username,password,name,gender,image,job,entrydate,dept_id,create_time,update_time)"+
             "values(#{username},#{password},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
     public void insert(Emp emp); //可以直接与实体类绑定

     //更新数据
     @Update("update emp set username=#{username},password=#{password},name=#{name},gender=#{gender},image=#{image},job=#{job},entrydate=#{entrydate},dept_id=#{deptId},create_time=#{createTime},update_time=#{updateTime} where id=#{id}")
     public void update(Emp emp);

     //根据ID查询数据
     @Select("select * from emp where id=#{id}")
     public Emp getById(Integer id);

     //条件查询
     //#在sql语句中，#{}表示占位符，${}表示拼接字符串
//     @Select("select * from emp where name like '%${name}%' and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
     //用concat拼接字符串更安全
     @Select("select * from emp where name like concat('%',#{name},'%') and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time desc")
     public List<Emp> getByCondition(String name, short gender, LocalDate begin, LocalDate end );

}
