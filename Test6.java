package com.qfedu.looptest;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        //由输入的值决定循环的执行次数，循环变量默认从1开始
        //提示,获取,接收
        System.out.println("请输入需要循环的次数,默认为1");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //定义初始
        int i = 1;
        do{
            System.out.println("语句执行第"+i+"次");
            i++;
        }while(i<(num+1));

    }
}
