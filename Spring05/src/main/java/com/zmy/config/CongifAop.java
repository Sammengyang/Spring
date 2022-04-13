package com.zmy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-13 23:23
 */
@Configuration
@ComponentScan(basePackages = {"com.zmy"})
@EnableAspectJAutoProxy(proxyTargetClass = true)// 默认false
public class CongifAop {
}
