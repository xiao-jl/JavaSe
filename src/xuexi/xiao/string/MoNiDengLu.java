package xuexi.xiao.string;

//模拟登陆

import java.util.Scanner;

public class MoNiDengLu {
    public static void main(String[] args) {

        String ming = "admin";
        String mi = "admin";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("请输入用户名：");
            String name = sc.nextLine();
            System.out.print("请输入密码：");
            String pwd = sc.nextLine();

            if (ming.equals(name) && mi.equals(pwd)) {
                System.out.println("登录成功！");
                break;
            } else {
                if ((2 - i) == 0) {
                    System.out.println("用户被锁定，请与管理员联系！");
                } else {
                    System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                }
            }

        }

    }
}
