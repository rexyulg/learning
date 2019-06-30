package com.rex.dao.impl;

import com.rex.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public String save() {
        return "666保存成功！";
    }
}
