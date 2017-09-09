package org.lanqiao.service.impl;

import org.apache.log4j.Logger;
import org.lanqiao.bean.User;
import org.lanqiao.dao.IUserDao;
import org.lanqiao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 1111 on 2017/9/1.
 */
@Service
public class UserServiceImpl implements IUserService {
    Logger logger=Logger.getLogger(UserServiceImpl.class);
    @Autowired
    private IUserDao userDao;
    public List<User> getAllUser() {
        logger.info("进入service方法");
        return  userDao.getAllUser();
    }

    public User getUserById(int id) {
        return null;
    }

    public int delUserById(int id) {
        System.out.println(1/0);
        return userDao.delUserById(id);
    }

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUserById(User user) {
        return userDao.updateUserById(user);
    }

    public List<User> getUserByCondition(User user) {
        return userDao.getUserByCondition(user);
    }
}
