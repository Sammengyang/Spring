package com.zmy.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 16:45
 */
@Configuration  // 作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.zmy.spring"})
public class SpringConfig {

}
