package org.lanqiao.dao;

import org.lanqiao.bean.User;

import java.util.List;

/**
 * Created by 1111 on 2017/9/1.
 */
public interface IUserDao {
    /**
     * 获取所有用户
     * @return用户集合
     */
    List<User> getAllUser();

    /**
     * 根据id查询用户
     * @param list
     * @return用户对象
     */
      List<User> getUserById(List<Integer> list);

    /**
     * 根据id删除用户
     * @param id
     * @return执行结果
     */
    int delUserById(int id);

    /**
     * 添加用户
     * @param user
     * @return执行结果
     */
    int addUser(User user);
    /**
     * 修改用户
     * @return执行结果
     */
    int updateUserById(User user);

    List<User> getUserByCondition(User user);
}
