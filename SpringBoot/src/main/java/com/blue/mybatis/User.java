package com.blue.mybatis;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.mybatis
 * @Author: JuferBlue
 * @CreateTime: 2024-07-28  00:02
 * @Description: TODO
 * @Version: 1.0
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Integer gender;
    private String phone;

    public User() {
    }
    public User(Integer id, String name, Integer age, Integer gender, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
