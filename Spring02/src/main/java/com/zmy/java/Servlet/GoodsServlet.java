package com.zmy.java.Servlet;

import com.zmy.java.Servce.GoodService;
import com.zmy.java.pojo.Goods;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-04 14:17
 */
public class GoodsServlet {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring02-config.xml");

        GoodService goodsService = (GoodService) context.getBean("goodsService");
        goodsService.QuseyByName(new Goods("tom",20));
    }

}
