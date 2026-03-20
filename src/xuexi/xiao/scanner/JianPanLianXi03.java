package xuexi.xiao.scanner;

// 键盘练习03

// 键盘录入练习-获取三个数据的最大值

import java.util.Scanner;

public class JianPanLianXi03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();

        System.out.println("请输入第一个数据：");
        int b = sc.nextInt();

        System.out.println("请输入第一个数据：");
        int c = sc.nextInt();

        int tamp = (a > b) ? a : b;
        int max = tamp > c ? tamp : c;

        System.out.println("三个数据最大值是：" + max);

    }
}
