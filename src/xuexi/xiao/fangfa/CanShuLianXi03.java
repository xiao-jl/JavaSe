package xuexi.xiao.fangfa;

// 参数练习03

// 参数练习-使用方法对数组进行求和

public class CanShuLianXi03 {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        sum(array);
        int sum = sum(array);
        System.out.println(sum);

    }

    public static int sum(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;

    }

}
