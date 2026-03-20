package xuexi.xiao.zu;

// 数组练习01

// 数组练习-找最值
// 80,90,87,93,92,81,99,49,68

public class ShuZuLianXi01 {
    public static void main(String[] args) {

        int[] a = {80, 90, 87, 93, 92, 81, 99, 49, 68};

        //定义参照物
        int MAX = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > MAX) {
                MAX = a[i];
            }
        }

        System.out.println("最大值是:" + MAX);

    }
}
