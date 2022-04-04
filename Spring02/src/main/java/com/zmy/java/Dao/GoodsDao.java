package com.zmy.java.Dao;

import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 14:14
 */
@Repository
public interface GoodsDao {

    /**
     *  根据名字寻商品价格
     *
     * @param name
     */
    void Query(String name);
}
