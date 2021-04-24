package com.qfedu.iftest;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class test8 {
    //根据输入的月份，判断该月份有多少天
    public static void main(String[] args) {
        //提示,获取sc,接收mouth
        System.out.println("请输入2021年其中一个月份,得到这个月有多少天:");
        Scanner sc = new Scanner(System.in);
        int mouth = sc.nextInt();
        //使用switch语句
        switch(mouth){
            case 1:
                System.out.println(mouth+"月有31天");
                break;
            case 3:
                System.out.println(mouth+"月有31天");
                break;
            case 5:
                System.out.println(mouth+"月有31天");
                break;
            case 7:
                System.out.println(mouth+"月有31天");
                break;
            case 8:
                System.out.println(mouth+"月有31天");
                break;
            case 10:
                System.out.println(mouth+"月有31天");
                break;
            case 12:
                System.out.println(mouth+"月有31天");
                break;
            case 4:
                System.out.println(mouth+"月有30天");
                break;
            case 6:
                System.out.println(mouth+"月有30天");
                break;
            case 11:
                System.out.println(mouth+"月有30天");
                break;
            case 2:
                System.out.println(mouth+"月有28天");
            default:
                System.out.println("您输入有误,程序终止.");
                break;
        }
    }
}
