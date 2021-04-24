package com.qfedu.iftest;

public class test1 {
    public static void main(String[] args) {
        //1、定义一个int类型的变量为x并赋值为5，
        // 如果x<10,
        // 则让x实现自增，
        // 并输出x最后的值。
        int x = 5;
        if(x<10){
            x++;
        }
        System.out.println("x自增后的值:"+x);
    }
}
