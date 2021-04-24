package com.qfedu.iftest;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //随便输入一个数，判断该数为奇数还是偶数；
        //提示,获取sc,接收num
        System.out.println("请输入一个数,进行判断是偶数还是奇数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //判断
        if(num%2==0){
            System.out.println("您输入的" +
                    num+"是偶数");
        }else{
            System.out.println("您输入的" +
                    num+"是奇数");
        }
    }
}
