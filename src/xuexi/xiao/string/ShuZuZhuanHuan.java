package xuexi.xiao.string;

//数组转换

public class ShuZuZhuanHuan {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        String s = shuZuZhuanHuan(arr);

        System.out.println("s:" + s);

    }

    public static String shuZuZhuanHuan (int[] arr) {

        String s = "";

        s += "[";
        for (int i = 0; i < arr.length; i ++) {
            if (i == arr.length - 1) {
                s += arr[i];
            }else{
                s += arr[i];
                s += ",";
            }
        }
        s += "]";

        return s;

    }

}
