package xuexi.xiao.fangfa;

// 方法

// 函数:方法

/*格式
 * 修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2……){
 *   方法体;
 *   return 返回值;
 * }
 *
 * */

// 空类型(void)不能直接打印

public class FangFa {

    public static void main(String[] args) {

        Hello();

        ziFuChuan("a", "b", "c", "……");

    }

    public static void Hello() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

    }

    //字符串类型(String)
    public static void ziFuChuan(String... a) {


    }

}
