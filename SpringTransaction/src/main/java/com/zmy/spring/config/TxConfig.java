package com.zmy.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-15 22:32
 */
@Configuration // 配置类
@ComponentScan(basePackages = "com.zmy.spring")// 开启扫描
@EnableTransactionManagement    //开启事务
public class TxConfig {
    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource() {
        // 加载配置文件
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("db.properties");
        Properties pros = new Properties();
        try {
            pros.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(pros.getProperty("driver"));
        druidDataSource.setUrl(pros.getProperty("url"));
        druidDataSource.setUsername(pros.getProperty("user"));
        druidDataSource.setPassword(pros.getProperty("password"));
        return druidDataSource;
    }
    // 创建 JdbcTemPlate
    @Bean
    public JdbcTemplate getJdbcTemPlate(DataSource dataSource){ // 到ioc容器根据类型找到dataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 注入 DataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
    // 创建事务管理器对象
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
