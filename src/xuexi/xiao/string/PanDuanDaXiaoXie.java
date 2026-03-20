package xuexi.xiao.string;

//判断大小写

import java.util.Scanner;

public class PanDuanDaXiaoXie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串数据：");
        String s = sc.nextLine();

        //统计变量
        int a = 0;
        int b = 0;
        int c = 0;

        //遍历字符串
        for (int i = 0;i < s.length();i ++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                a ++;
            } else if (ch >= 'a' && ch <= 'z') {
                b ++;
            } else if (ch >= '0' && ch <= '9') {
                c ++;
            } else {
                System.out.println("字符串'" + ch + "'是非法字符");
            }

        }

        System.out.println("大写字符数：" + a + "\n小写字符数：" + b + "\n数字字符：" + c);

    }
}
