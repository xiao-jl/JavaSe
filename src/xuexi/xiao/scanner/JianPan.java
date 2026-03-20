package xuexi.xiao.scanner;

// 键盘

// Scanner键盘录入

// 1.导包

import java.util.Scanner;

public class JianPan {
    public static void main(String[] args) {
        // 2.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 3.接收数据
        System.out.println("请输入一个名字:");
        // 接收数据
        // 字符串
        String a = sc.nextLine();

        System.out.println("请输入身高:");
        // 接收数据
        // 整数
        int b = sc.nextInt();

        System.out.println("请输入年龄:");
        // 接收数据
        int c = sc.nextInt();

        // 集合打印
        System.out.println("名字:" + a + "-----身高:" + b + "-----年龄:" + c);
    }
}
