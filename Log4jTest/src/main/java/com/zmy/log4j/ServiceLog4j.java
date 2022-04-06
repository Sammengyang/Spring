package com.zmy.log4j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 9:37
 */
@Service(value = "serviceLog4j")
public class ServiceLog4j {
    // 实例化log对象
    private Log log = LogFactory.getLog(this.getClass());

    public void after(){
        // 用log4j输出信息
        log.info("after 方法被执行.....");
    }

    public void before(){
        // 用log4j输出信息
        log.info("before 方法被执行....");
    }

    public void around(){
        log.info("around 被执行......");
    }
}
