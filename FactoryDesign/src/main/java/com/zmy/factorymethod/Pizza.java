package com.zmy.factorymethod;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 15:55
 */
public abstract class Pizza {
    protected String name; // 名字
    // 准备
    public abstract void prepare();
    // 烘烤
    public void bake(){
        System.out.println(name+"烘烤......");
    }
    // 切
    public void cut(){
        System.out.println(name+"切片......");
    }
    // 打包
    public void box(){
        System.out.println(name+"打包.....");
    }

    public void setName(String name){
        this.name = name;
    }
}
