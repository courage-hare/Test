package com.qfedu.looptest;

public class test4 {
    public static void main(String[] args) {
        //计算10的阶乘
        //定义乘积变量
        int ride = 1;//切记不能为0
        for (int i = 1; i < 11; i++) {
            ride*=i;
        }
        //输出
        System.out.println("10的阶乘为:"+ride);
    }
}
