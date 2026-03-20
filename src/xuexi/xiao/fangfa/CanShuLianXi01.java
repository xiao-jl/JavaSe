package xuexi.xiao.fangfa;

// 参数练习01

// 参数练习-使用方法遍历数组

public class CanShuLianXi01 {

    public static void main(String[] args) {

        int[] array = {11, 22, 33, 44, 55, 66};

        printArray(array);

    }

    public static void printArray(int[] array) {

        for (int i = 0; i <= array.length; i++) {
            System.out.print("[");
            for (i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.print(array[i] + "]");
                } else {
                    System.out.print(array[i] + ",");
                }

            }
        }

    }

}
