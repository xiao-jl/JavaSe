package xuexi.xiao.duandian;

//基数断点

public class JiShuDuanDian {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("a" + a + ",b" + b);
        sum(a, b);
        System.out.println("a" + a + ",b" + b);

    }

    public static void sum(int a, int b) {

        System.out.println("a" + a + ",b" + b);
        a = b;
        b = a + b;
        System.out.println("a" + a + ",b" + b);

    }

}
