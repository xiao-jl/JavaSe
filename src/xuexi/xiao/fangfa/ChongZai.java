package xuexi.xiao.fangfa;

// 重载

/*方法重载:
 *   在同一类，出现相同方法名
 *
 * 特点:
 *   1.同一个类中方法名相同，但参数列表不同
 *       参数列表的个数不同
 *       参数对应的数据类型不同
 *
 * 使用场景:
 *   根据参数不同，执行不同的代码块
 *
 * */

public class ChongZai {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int num = CZ(a, b, c);
        System.out.println(num);

    }

    public static int CZ(int a, int b) {

        return a + b;

    }

    public static int CZ(int a, int b, int c) {

        return a + b + c;

    }

    //double类型
    public static double CZ(int a, int b, int c, int d) {

        return a + b + c + d;

    }

}
