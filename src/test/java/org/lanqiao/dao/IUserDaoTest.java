package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Created by 1111 on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring-mybatis.xml"})
public class IUserDaoTest {


    //private static Logger logger=Logger.getLogger(IUserDao.class);
    @Resource
    private IUserDao userDao;
    @Test
    public void updateUserById() throws Exception {
        User user=new User();
        user.setUserId(1);
        user.setUserName("kk");
        userDao.updateUserById(user);
    }
    @Test
    public void getUserById() throws Exception {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(userDao.getUserById(list));
    }
}