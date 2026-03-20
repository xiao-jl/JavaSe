package xuexi.xiao.yufalianxi;

//数组反转

public class ShuZuFanZhuan {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        //翻转前
        printarray(array);
        //翻转
        reverse(array);
        //反转后
        printarray(array);

    }

    public static void printarray(int[] array) {

        System.out.print("[");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }

        }

    }

    public static void reverse(int[] array) {

        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

        }

    }

}
