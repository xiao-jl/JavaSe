package xuexi.xiao.random;

// 随机数练习01

// 随机数练习-猜数字(1-200)

import java.util.Random;
import java.util.Scanner;

public class SuiJiShuLianXi01 {
    public static void main(String[] args) {

        int nun = 0;

        Random random = new Random();
        int num = random.nextInt(199) + 1;

        while (true) {

            System.out.println("请输入数字（1-200）:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (a > num) {
                System.out.println("你猜的" + a + "大了");
            } else if (a < num) {
                System.out.println("你猜的" + a + "小了");
            } else {
                System.out.println("你猜对了！");
                break;
            }

        }

    }
}
