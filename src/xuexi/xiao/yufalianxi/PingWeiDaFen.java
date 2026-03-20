package xuexi.xiao.yufalianxi;

//评委打分

/*
 * 6位评委打分
 * 去掉最低分和最高分
 * 计算4位评委的平均分
 *
 * */

import java.util.Scanner;

public class PingWeiDaFen {

    public static void main(String[] args) {

        int[] array = new int[6];

        //键盘录入
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            System.out.print("请输入第" + (i + 1) + "个评委给出的分数（0~100）：");
            int score = sc.nextInt();
            array[i] = score;

        }

        int max = getMax(array);
        int min = getMin(array);
        int sum = sum(array);

        int avg = (sum - max - min) / (array.length - 2);

        System.out.println("这个选手的最终得分是：" + avg);

    }

    //求和
    public static int sum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        return sum;

    }

    //获取最大值
    public static int getMax(int[] array) {

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {

                max = array[i];

            }

        }

        return max;

    }

    //获取最小值
    public static int getMin(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {

                min = array[i];

            }

        }

        return min;

    }

}
