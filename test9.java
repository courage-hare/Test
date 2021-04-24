package com.qfedu.iftest;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        //输入员工登记A、B、C级，判断其是否加薪，加薪对应500、300、100（switch语句）
        //提示,获取sc,接收rate
        System.out.println("请输入员工等级A.B.C级,相应加薪:");
        Scanner sc = new Scanner(System.in);
        char rate = sc.nextLine().charAt(0);
        //switch语句开始
        switch(rate){
            case 'A':
                System.out.println(rate+"级加薪500");
                break;
            case 'B':
                System.out.println(rate+"级加薪300");
                break;
            case 'C':
                System.out.println(rate+"级加薪100");
                break;
            default:
                System.out.println("您输入有误,程序终止");
                break;
        }
    }
}
