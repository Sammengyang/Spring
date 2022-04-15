package com.zmy.spring.dao;

import com.zmy.spring.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-14 22:35
 */
@Repository
public class UserDaoImpl implements UserDao{
    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 添加用户
     * @param user
     */
    @Override
    public void add(User user) {
        String sql = "insert into user values(?,?,?)";
        int update = jdbcTemplate.update(sql, user.getUid(), user.getUname(), user.getUpassword());
        System.out.println("update = " + update);
    }

    /**
     * 根据id修改信息
     * @param user
     */
    @Override
    public void updateUser(User user) {
        String sql = "update user set uname=?,upassword=? where uid=?";
        int update = jdbcTemplate.update(sql,user.getUname(), user.getUpassword(),user.getUid());
        System.out.println("update = " + update);
    }
    /**
     * 通过id删除用户
     * @param uid
     */
    @Override
    public void deleteUser(Integer uid) {
        String sql = "delete from user where uid=?";
        int update = jdbcTemplate.update(sql,uid);
        System.out.println("update = " + update);
    }

    /**
     * 查询总记录数
     * @return
     */
    @Override
    public int getCount() {
        String sql = "select count(*) from user";
        int update = jdbcTemplate.queryForObject(sql,Integer.class);
        return update;
    }

    @Override
    public User getUser(Integer uid) {
        String sql = "select * from user where uid=?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class), uid);
        return user;
    }

    /**
     *  获取所有用户
     * @return
     */
    @Override
    public List<User> getAllUser() {
        String sql = "select * from user";
        List list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
        return list;
    }
    /**
     * 批量添加
     */
    @Override
    public void batchAdd(List<Object[]> list) {
        String sql = "insert into  user values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }
    /**
     * 批量修改
     */
    @Override
    public void batchUpdate(List<Object[]> list) {
        String sql = "update user set uname=?,upassword=? where uid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 批量删除
     * @param list
     */
    @Override
    public void batchDelete(List<Object[]> list) {
        String sql = "delete from user where uid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));
    }

}
