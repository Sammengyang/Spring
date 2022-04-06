package com.zmy.newLog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-06 21:17
 */
@Repository
public class NewLog4j {

    private Log log = LogFactory.getLog(this.getClass());

    public void before(){
        log.info("before+++++++++++++");
    }

    public void after(){
        log.info("after+++++++++++++");
    }

    public void around(){
        log.info("around+++++++++++++");
    }




}
