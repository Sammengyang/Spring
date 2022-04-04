package com.zmy.java.Servce;

import com.zmy.java.pojo.Goods;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 14:16
 */
public interface GoodService {

    /**
     *  根据商品名字查询价格
     * @param goods
     */
    void QuseyByName(Goods goods);
}
