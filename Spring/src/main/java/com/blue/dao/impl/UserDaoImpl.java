package com.blue.dao.impl;

import com.blue.dao.UserDao;
import com.blue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @BelongsProject: JavaBasics
 * @BelongsPackage: com.blue.dao.impl
 * @Author: JuferBlue
 * @CreateTime: 2024-07-27  15:01
 * @Description: TODO
 * @Version: 1.0
 */

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserService userService;
}
