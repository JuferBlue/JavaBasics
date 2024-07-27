package com.blue.pojo;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.pojo
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  22:28
 * @Description: TODO
 * @Version: 1.0
 */
public class Address {
    private String province;
    private String city;

    public Address(){}

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
