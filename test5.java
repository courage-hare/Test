package com.qfedu.iftest;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //从键盘输入三角形的三边长，判断出这三边能否构成三角形
        //提示语,获取sc,接收a
        System.out.println("请输入三角形的三条边,判断是否可以组成三角形,\n" +
                "请输入第一个边长:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //提示语2,获取sc1,接收b
        System.out.println("请输入第二个边长:");
        Scanner sc1 = new Scanner(System.in);
        int b = sc.nextInt();
        //提示语3,获取sc2,接收c
        System.out.println("请输入第三个边长:");
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();

        //判断,假如if(出现负值),调用Math.abs()绝对值方法即可.
        if((a+b)>c&&Math.abs(a-b)<c){
            System.out.println("恭喜您,您输入的三条边,可以构成三角形.");
        }else{
            System.out.println("抱歉,您输入的三条边,组不成三角形.");
        }
    }
}
