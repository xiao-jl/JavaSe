package xuexi.xiao.fangfa;

// 方法练习02

// 方法练习-两个数求最大值

import java.util.Scanner;

public class FangFaLianXi02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数:");
        int a = sc.nextInt();

        System.out.println("请输入第二个数:");
        int b = sc.nextInt();

        int c = max(a, b);
        System.out.println("两个数据最大值是:" + c);

    }

    public static int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }
}
