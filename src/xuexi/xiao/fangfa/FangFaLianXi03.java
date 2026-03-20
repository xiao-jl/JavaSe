package xuexi.xiao.fangfa;

// 方法练习03

// 方法练习-两个数是否相等

import java.util.Scanner;

public class FangFaLianXi03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();

        boolean c = max(a, b);
        System.out.println("两个数据是否相等:" + c);

    }

    public static boolean max(int a, int b) {

        return a == b;

    }

}
