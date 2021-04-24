package com.qfedu.iftest;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*2、随意输入一个数字a，若a>20,输出a的值。
         */
        //提示语
        System.out.println("请随意输入一个整数:");
        //获取输入数据
        Scanner sc = new Scanner(System.in);
        //接收数据
        int a = sc.nextInt();
        //进行判断
        if(a>20){
            System.out.println("您输入的整数为:"+a);
        }else{
            System.out.println("抱歉您输入的小于或等于20,不进行输出,结束了");
        }
    }
}
