package xuexi.xiao.fangfa;

// 参数

/*
 * 方法的参数如果是 基本数据 类型:形式参数改变不影响实际参数
 * 方法的参数如果是 引用数据 类型:形式参数改变会直接影响实际参数    （形参，实参 共享一块堆内存）
 *
 * 形式参数:用于接收实际参数定义的变量
 * 实际参数:实际参与运算的变量
 *
 * */

public class CanShu {

    public static void main(String[] args) {

        // 实际参数
        int a = 10;
        int b = 20;

        System.out.println("a=" + a + ", b=" + b);      // a:10     b:20
        CS(a, b);
        System.out.println("a=" + a + ", b=" + b);      // a:10     b:20

        System.out.println("========================");

        int[] arr = {1, 2, 3, 4, 5};

        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }

        yinyong(arr);

        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }

    }

    // 基本数据类型
    public static void CS(int a, int b) {      // 形式参数

        System.out.println("a=" + a + ", b=" + b);      // a:10     b:20
        a = b;
        b = a + b;
        System.out.println("a=" + a + ", b=" + b);      // a:20     b:40

    }


    // 引用数据类型
    public static void yinyong(int[] arr) {

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                arr[x] *= 2;
            }

        }


    }

}
