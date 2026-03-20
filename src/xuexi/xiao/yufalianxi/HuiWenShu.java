package xuexi.xiao.yufalianxi;

//回文数

/*
 * 五位回文数:
 *   万位与个位相同
 *   千位与十位相同
 *
 * 例如:
 *   12321
 *
 * */

public class HuiWenShu {
    public static void main(String[] args) {

        for (int i = 10000; i < 100000; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            int wan = i / 10 / 10 / 10 / 10 % 10;

            if ((ge == wan) && (shi == qian)) {

                System.out.println(i);

            }

        }

    }
}
