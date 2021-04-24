package com.qfedu.looptest;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //=手动输入两个数字m和n，运算求出m~n之间所有偶数的和
        //提示,获取,接收m,n,定义sum变量
        System.out.println("请输入任意两个数字的区间,求他们之间的偶数和" +
                ",请输入第一个数字:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("请输入第二个数字:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int sum = 0;

        //使用for循环 表达式i=m,循环体sum+=i i++, 跳出i<=n;
        for (int i = m; i <= n; i++) {
            //求偶就再加一个判断这么省事...
            if(i%2==0){sum+=i;}
        }
        System.out.println(m+"~"+n+"之间偶数的和为:"+sum);
    }
}
