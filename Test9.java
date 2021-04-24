package com.qfedu.looptest;

public class Test9 {
    public static void main(String[] args) {
        //把100——200中不能被3整除的数输出,每四个换一行输出
        //定义变量接收num
        int num = 0;
        for (int i = 100; i <= 200; i++) {
            if(i%3!=0){
                System.out.print(i+",");
                num++;//关键点
                if(num%4==0){
                    System.out.println();
                }

            }
        }
    }
}
