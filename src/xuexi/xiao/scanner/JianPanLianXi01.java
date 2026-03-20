package xuexi.xiao.scanner;

// 键盘练习01

// 键盘录入练习-两个数据求和

import java.util.Scanner;

public class JianPanLianXi01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据:");
        int one = sc.nextInt();

        System.out.println("请输入第二个数据:");
        int two = sc.nextInt();

        int he = one + two;
        System.out.println("两个数据的和是:" + he);

    }
}
