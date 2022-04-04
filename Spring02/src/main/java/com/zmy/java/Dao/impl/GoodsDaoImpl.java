package com.zmy.java.Dao.impl;

import com.zmy.java.Dao.GoodsDao;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 14:15
 */
@Repository
public class GoodsDaoImpl implements GoodsDao {

    /**
     * 根据名字寻商品价格
     *
     * @param name
     */
    @Override
    public void Query(String name) {
        System.out.println(name + "查询该商品的价格~~~");
    }
}
