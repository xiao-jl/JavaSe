package xuexi.xiao.yufalianxi;

//季节


import java.util.Scanner;

public class JiJie {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份(1-12):");

        int a = sc.nextInt();

        //if
        if ((a == 3) || (a == 4) || (a == 5)) {
            System.out.println("现在是春季");
        } else if ((a == 6) || (a == 7) || (a == 8)) {
            System.out.println("现在是夏季");
        } else if ((a == 9) || (a == 10) || (a == 11)) {
            System.out.println("现在是秋季");
        } else if ((a == 12) || (a == 1) || (a == 2)) {
            System.out.println("现在是冬季");
        } else {
            System.out.println("错误月份！");
        }

        //switch
        switch (a) {
            case 3:
            case 4:
            case 5:
                System.out.println("现在是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("现在是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("现在是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("现在是冬季");
                break;
            default:
                System.out.println("错误月份！");
                break;

        }

    }
}
