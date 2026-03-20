package xuexi.xiao.yufalianxi;

//数组

/*
 * 打印个位、十位不是7的偶数的的和
 *
 * */

public class ShuZu {
    public static void main(String[] args) {

        int[] aaa = {113, 23, 22, 11, 55, 28, 19, 27, 7, 9, 18};

        int sum = 0;

        for (int x = 0; x < aaa.length; x++) {

            if (aaa[x] % 10 != 7 && aaa[x] % 10 % 10 != 7 && aaa[x] % 2 == 0) {

                System.out.println(aaa[x]);
                sum += aaa[x];

            }

        }

        System.out.println("满足条件的和是:" + sum);

    }
}
