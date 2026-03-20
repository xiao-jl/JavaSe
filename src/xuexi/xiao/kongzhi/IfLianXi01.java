package xuexi.xiao.kongzhi;

// if-练习01

// if练习-输入分数获取等级

import java.util.Scanner;

public class IfLianXi01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入分数:");

        int a = sc.nextInt();

        if (a <= 100 & a >= 90) {
            System.out.println("优秀");
        } else if (a < 90 & a >= 80) {
            System.out.println("好");
        } else if (a < 80 & a >= 70) {
            System.out.println("良");
        } else if (a < 70 & a >= 60) {
            System.out.println("及格");
        } else if (a < 60 & a >= 0) {
            System.out.println("不及格");
        } else {
            System.out.println("你这分不对吧");
        }

    }
}
