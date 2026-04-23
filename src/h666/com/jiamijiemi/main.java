package h666.com.jiamijiemi;

import h666.com.jiamijiemi.haxizhi.MD5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //死循环
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("1.进制转换\t2.加密解密\n0.退出\n");
                int a01 = sc.nextInt();
                //第一层判断
                switch (a01) {
                    case 1:

                        //第二层判断-1

                        break;
                    case 2:
                        System.out.println("1.哈希值加密（无解密）\n0.退出\n");
                        int a02 = sc.nextInt();

                        //第二层判断-2
                        switch (a02) {
                            case 0:
                                return;
                            case 1:
                                System.out.println("请选择加密算法：");
                                System.out.println("1.MD5\t2.SHA-1\t3.SHA-256\t3.SHA-512\t3.bcrypt\n0.退出\n");
                                int a03 = sc.nextInt();
                                switch (a03) {
                                    case 0:
                                        return;
                                    case 1:
                                        System.out.println("请输入要加密的字符串：");
                                        String MD5_zhi = sc.next();
                                        MD5.MD5(MD5_zhi);
                                }
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("请输入有效数字！");
                                break;
                        }
                        break;
                    default:
                        System.out.println("请输入有效数字！");
                        break;
                }
            } catch (Exception e) {
                System.out.println("请输入有效数字！");
            }
        }

    }
}
