package xuexi.xiao.fangfa;

// 参数练习02

// 参数练习-使用方法获取数组最值

public class CanShuLianXi02 {

    public static void main(String[] args) {

        int[] array = {11, 22, 57, 98, 123, 76, 99};

        getMax(array);
        System.out.println("MAX:" + getMax(array));

    }


    public static int getMax(int[] array) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;

    }

}
