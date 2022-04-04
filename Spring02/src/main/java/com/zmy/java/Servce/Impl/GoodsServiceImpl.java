package com.zmy.java.Servce.Impl;

import com.zmy.java.Dao.GoodsDao;
import com.zmy.java.Servce.GoodService;
import com.zmy.java.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 14:16
 */
@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodService {

    @Autowired
    private GoodsDao goodsDao;

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        System.out.println("set注入.....");
        this.goodsDao = goodsDao;
    }

    public GoodsServiceImpl() {
    }

    public GoodsServiceImpl(GoodsDao goodsDao) {
        System.out.println("构造器注入....");
        this.goodsDao = goodsDao;
    }


    /**
     *  根据商品名字查询价格
     * @param goods
     */
    @Override
    public void QuseyByName(Goods goods) {
        goodsDao.Query(goods.getName());
    }
}
