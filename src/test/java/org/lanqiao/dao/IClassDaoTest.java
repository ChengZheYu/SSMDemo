package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.Classs;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 1111 on 2017/9/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring-mybatis.xml"})
public class IClassDaoTest {


    @Resource
    private IClassDao classDao;
    @Test
    public void getAllClassInfo() throws Exception {
        System.out.println(classDao.getAllClassInfo());
    }
    @Test
    public void getClassInfoById() throws Exception {
        System.out.println(classDao.getClassInfoById(1));
    }
}