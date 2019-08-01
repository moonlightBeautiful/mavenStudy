package com.java1234.service.impl;

import com.java1234.dao.UserDao;
import com.java1234.entity.User;
import com.java1234.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户Service实现类
 *
 * @author Administrator
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

}
