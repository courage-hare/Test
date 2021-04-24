package com.qfedu.looptest;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //输入五个数，通过运算，求出这五个数最大值或最小值。
        //定义最大max最小min变量
        int max = 0;
        int min = 0;
        for (int i = 1; i <= 5; i++) {
            //提示,获取,接收
            System.out.println("请输入第" +
                    i+"个数字");
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            //判断赋值
            if(i==1){
                max = temp;
                min = temp;
            }
            if(temp>max){
                max=temp;
            }
            else if(temp<min){
                min=temp;
            }
        }
        System.out.println("以上输出最大值为:"+max+",最小值为:"+min);
    }
}
