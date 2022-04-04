package com.zmy.factorymethod;

import java.util.Scanner;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-01 17:54
 */
public class PizzaStore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("选择地点   1.北京  2. 伦敦");
        int choice = sc.nextInt();
        if (choice == 1){
            // 创建北京口味的披萨
            new BJOrderPizza();
        }else if (choice == 2){
            // 创建伦敦披萨
            new LDOrderPizza();
        }else {
            System.out.println("选择错误！");
        }

    }
}
