package xuexi.xiao.fangfa;

// 方法练习04

// 方法练习-求三个数据中的最大值

import java.util.Scanner;

public class FangFaLianXi04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();

        System.out.println("请输入第三个数据:");
        int c = sc.nextInt();

        int d = max(a, b, c);
        System.out.println("三个数据最大值是:" + d);

    }

    public static int max(int a, int b, int c) {

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        return max;

    }

}
