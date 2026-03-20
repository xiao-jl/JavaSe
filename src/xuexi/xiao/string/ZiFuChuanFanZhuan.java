package xuexi.xiao.string;

//字符串反转

import java.util.Scanner;

public class ZiFuChuanFanZhuan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String str = sc.nextLine();

        String ss = ziFuChuanFanZhuan(str);
        System.out.println(ss);

    }

    public static String ziFuChuanFanZhuan(String str){

        String s = "";

        for (int i = str.length()-1;i >= 0;i --) {
            s += str.charAt(i);
        }

        return s;
    }

}
