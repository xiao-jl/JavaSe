package xuexi.xiao.duandian;

//引用断点

public class YinYongDuanDian {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }

        change(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

        }


    }

    public static void change(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                arr[i] *= 2;

            }

        }

    }

}
