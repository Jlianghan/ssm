package com.dao;

import com.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
public interface UserDao {
     void save(User user);
     boolean update(User user);
     boolean delate(User user);
     User findById(int id);
     List<User> findAll();
}
