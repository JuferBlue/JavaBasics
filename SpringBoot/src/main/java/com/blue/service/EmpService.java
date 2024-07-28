package com.blue.service;

import com.blue.mybatis.PageBean;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize);
}
