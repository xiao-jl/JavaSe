package xuexi.xiao.random;

// 随机数

/*
 * 1.导包
 *   import java.util.Random;
 * 2.创建对象
 *   Random Random = new Random();
 * 3.获取随机数
 *   int num = Random.nextInt(10);
 *   范围:包括0,但不包括10
 *
 * */

import java.util.Random;

public class SuiJiShu {
    public static void main(String[] args) {

        Random random = new Random();

        //0-9
        int num = random.nextInt(10);

        System.out.println(num);

        //1-10
        int num2 = random.nextInt(10) + 1;

    }
}
