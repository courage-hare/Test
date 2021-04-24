package com.qfedu.iftest;

public class test7 {
    public static void main(String[] args) {
        //写程序输出一个圆的面积；
        //1.定义常量π
        final double PI=3.14;
        //2.定义半径
        double r = 2;
        //3.代入公式s=πr²
        double s = PI*(r*r);
        System.out.println("圆面积为:"+s);
    }
}
