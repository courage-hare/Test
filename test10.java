package com.qfedu.iftest;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //10、随意输入一个数字1-7，
        // 判断是周几，
        // 输入其他数字提示输入错误。（switch语句写
        //提示,获取sc,接收week
        System.out.println("请输入1-7一个数字,判断是周几:");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        //switch语句开始
        switch(week){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("输入有误,程序终止");
                break;
        }

    }
}
