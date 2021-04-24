package com.qfedu.looptest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //用户输入一个1--10以内的数字，通过运算求出该数字的阶乘
        //提示,获取sc,接收num,定义变量ride
        System.out.println("输入1-10以内的数字,可求出该数字的阶乘:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ride = 1;
        //开始for循环
        for (int i = 1; i <= num; i++) {
            ride *= i;
        }
        System.out.println("您输入的" +
                num+"阶乘为:"+ride);
    }
}
