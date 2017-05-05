package com.service.impl;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    public void save(User user) {
    userDao.save(user);

    }


    public boolean update(User user) {
        return false;
    }


    public boolean delate(User user) {
        return false;
    }


    public User findById(int id) {
        return null;
    }


    public List<User> findAll() {
        return null;
    }
}
