package com.qfedu.iftest;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //编程输入整数a和b，
        // 若a或b大于100，
        // 则输出a,b的和与100的差，否则输出两数之和。
        //提示语
        System.out.println("请分别输入两个数值,第一个数值:");
        //获取用户输入数值
        Scanner sc = new Scanner(System.in);
        //创建a,b分别接收用户输入数据
        int a = sc.nextInt();
        //提示语2
        System.out.println("请输入第二个数值:");
        //获取用户第二次输入数值sc1
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();

        //进行判断 使用|判断,得其一即可输出
        if(a>100||b>100){
            //进行累加 a+b之和 与 100的差
            int temp = (a+b)-100;
            System.out.println("根据您输入的数值,由于一个大于100,计算2数只和与100差为:"+temp);
        }else{
            int temp = a+b;
            System.out.println("根据您输入的数值,由于都小于100,计算两数之和为:"+temp);
        }
    }
}
