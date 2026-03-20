package xuexi.xiao.fangfa;

// 方法练习05

// 方法练习-打印1~n

import java.util.Scanner;

public class FangFaLianXi05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sum(a);

    }

    public static void sum(int a) {

        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }

    }

}
