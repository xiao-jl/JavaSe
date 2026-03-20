package xuexi.xiao.kongzhi;

// for-练习03

// for练习-获取数据1-100之间的偶数和

public class ForLianXi03 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);

    }
}
