package com.rex.service.impl;

import com.rex.dao.UserDao;
import com.rex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String save() {
        return userDao.save();
    }
}
