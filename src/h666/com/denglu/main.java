package h666.com.denglu;

//模拟多账号登录

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String[] usernames = new String[100]; // 账户名数组
        String[] passwords = new String[100]; // 密码数组

        ZhuCe zhuce = new ZhuCe();
        DengLu denglu = new DengLu();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("===========================================\n");
            System.out.println("\t\t  九幺传媒后台管理系统登录\n");
            System.out.println("===========================================");

            System.out.println("1.登录\t2.注册\t3.？？？\n0.退出\n");
            System.out.print("请输入序号：");
            String type = sc.nextLine();
            System.out.print("\n");


            //执行完毕注册后不会退出程序，执行完登录程序后会退出程序
            switch (type) {
                case "0":
                    return;
                case "1":
                    //执行登录
                    denglu.dengLu(usernames, passwords);
                    return;
                case "2":
                    //执行注册
                    zhuce.zhuCe(usernames, passwords);
                    break;
                case  "3":
                    //待添加

                    break;
                default:
                    System.out.print("\n");
                    System.out.println("请输入有效数字！\n");
            }

        }

    }

}

/*
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *            佛曰:
 *                   写字楼里写字间，写字间里程序员；
 *                   程序人员写程序，又拿程序换酒钱。
 *                   酒醒只在网上坐，酒醉还来网下眠；
 *                   酒醉酒醒日复日，网上网下年复年。
 *                   但愿老死电脑间，不愿鞠躬老板前；
 *                   奔驰宝马贵者趣，公交自行程序员。
 *                   别人笑我忒疯癫，我笑自己命太贱；
 *                   不见满街漂亮妹，哪个归得程序员？
 */
