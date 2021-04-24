package com.qfedu.looptest;

public class test3 {
    public static void main(String[] args) {
        //实现求1-100之和
        //定义和变量sum
        int sum = 0;
        //是for循环,循环累加,小于101,i累加
        for (int i = 1; i < 101; i++) {
            sum+=i;
        }
        //输出1-100的和
        System.out.println("1-100之和为:"+sum);
    }
}
