package com.qfedu.looptest;

public class test2 {
    public static void main(String[] args) {
        //实现求1-10这10个数字的和
        //定义变量i,变量和sum
        int i = 1;
        int sum = 0;
        //表达式
        while(i<11){
            //循环体 1+2+3..+10=sum
            sum+=i;
            i++;
        }
        System.out.println("1-10累加和为:"+sum);
    }
}
