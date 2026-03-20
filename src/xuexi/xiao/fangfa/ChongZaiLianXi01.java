package xuexi.xiao.fangfa;

// 重载练习01

// 重载练习-比较两个数据是否相等
// 2个byte类型，2个short类型，2个int类型，2个long类型


public class ChongZaiLianXi01 {

    public static void main(String[] args) {

        // 默认 int类型
        System.out.println(Deng(10, 20));

        // 强制转换 byte类型
        System.out.println(Deng((byte) 10, (byte) 20));

        //
        System.out.println(Deng(10L, 20L));

    }

    public static boolean Deng(byte a, byte b) {

        System.out.println("byte");
        return a == b;

    }

    public static boolean Deng(short a, short b) {

        System.out.println("short");
        return a == b;

    }

    public static boolean Deng(int a, int b) {

        System.out.println("int");
        return a == b;

    }

    public static boolean Deng(long a, long b) {

        System.out.println("long");
        return a == b;

    }

}
