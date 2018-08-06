package com.test.ssm.service.impl;

import com.test.ssm.dao.UserDao;
import com.test.ssm.model.User;
import com.test.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    public List<User> getAll(){

        return userDao.selectAllUser();
    }
}
