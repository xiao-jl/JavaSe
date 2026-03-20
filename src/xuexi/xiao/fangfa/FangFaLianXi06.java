package xuexi.xiao.fangfa;

// 方法练习06

// 方法练习-打印传递的字符串（可变长度）

import java.util.Scanner;

public class FangFaLianXi06 {

    public static void main(String[] args) {

        print("Hello", "world", "!", "111", "……");

        Scanner sc = new Scanner(System.in);

    }

    public static void print(String... a) {

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }

    }

}
