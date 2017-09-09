package org.lanqiao.dao;

import org.lanqiao.bean.Classs;

import java.util.List;

/**
 * Created by 1111 on 2017/9/4.
 */
public interface IClassDao {
    /**
     *
     * @returnteach表与class表的关联查询
     */
    List<Classs> getAllClassInfo();

    /**
     *
     * @param id
     * @return查询的班级信息
     */
    List<Classs> getClassInfoById(int id);
}
