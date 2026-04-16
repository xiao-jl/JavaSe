//package (用于声明当前文件的包名)
package h666.com.zongjie;

//import (用于导入其他包中的类或接口)
//导入键盘录入的包
import java.util.Scanner;
//导入随机数的包
import java.util.Random;
//导入集合类的包
import java.util.ArrayList;


//java.lang 是核心基础包，编译器会自动导入该包下的所有类，不需要另外导入




/*类第一个关键字是访问控制关键字：
 *   private (访问控制：私有，只能在声明它的类内部访问)
 *   protected (访问控制：受保护，可以在声明它的类及其子类中访问，同包内其他类也可以访问)
 *   public (访问控制：公共，可以在任何地方访问)
 * */

/*类第二个关键字 class 是声明是一个类
* class (用于声明一个类，类是面向对象编程的基本构造块)
* */
public class ZongJie {
    //main方法
    /*main第一个关键字是访问控制关键字：
    *   private (访问控制：私有，只能在声明它的类内部访问)
    *   protected (访问控制：受保护，可以在声明它的类及其子类中访问，同包内其他类也可以访问)
    *   public (访问控制：公共，可以在任何地方访问)
    * */

    /*main第二个关键字是声明类是静态的
    *   static (用于声明静态变量或静态方法，静态成员属于类本身，而不是类的实例)
    * */

    /*main第三个关键字是声明返回值的数据类型，void表示没有返回值
    * 四类八种数据类型
    * */
    public static void main(String[] args) {

    //数组：
        /*
        * 初始化：
        *      动态初始化：只需要给出数组长度,默认给出初始化值
        *          数组类型 [] 数组名 = new 数据类型[数组长度];      new:为数组申请内存分配
        *
        *      静态初始化：只需要给出初始化值,默认给出数组长度
        *          数组类型 [] 数组名 = new 数据类型[]{元素1,元素2,元素3,……};
        *          数组类型 [] 数组名 = {元素1,元素2,元素3,……};
        * */
        int[] aaa = new int[5];
        int[] bbb = {1,2,3,4,5};

        //遍历一维数组
        for (int i = 0; i < bbb.length; i++) {
            System.out.println(bbb[i]);
        }

        //二维数组
        int[] [] ccc = {{1,2,3},{4,5,6},{7,8,9}};
        //遍历二维数组
        for (int i = 0; i < ccc.length; i++) {
            for (int j = 0; j < ccc[i].length; j++) {
                System.out.println(ccc[i][j]);
            }
        }



    //选择、循环
        int a = 0;

    //选择

        //if
        if (a == 0) {
            a = 0;
        }else if (a == 1) {
            a = 1;
        }else{
            a = 0;
        }

        //switch
        switch (a) {
            case 0:
                a = 0;
                break;
            case 1:
                a = 1;
                break;
            case 2:
                a = 2;
                break;
            default:
                a = 0;
                break;
        }

    //循环

        //for
        for (int i = 0; i <= 5; i++) {
            i++;
        }

        //while
        while (a < 5) {
            a++;
        }

        //do……while
        do {
            a++;
        }while(a < 5);



    //键盘录入
        //为键盘录入申请内存（开启）
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入任意数字以继续运行：");     //提醒一下，否则可能没有提示导致无法执行下一步
        int sssccc = sc.nextInt();
        //为键盘录入关闭内存（关闭）
        sc.close();



    //随机数
        //创建对象
        Random Random = new Random();
        //获取随机数，范围：包括0,但不包括10
        int num = Random.nextInt(10);



    //ArrayList集合类
        //创建对象---String类型
        ArrayList<String> array = new ArrayList<String>();

        array.add("Hello");
        array.add("Java");
        array.add("!!!");

        System.out.println(array);
        //遍历
        //非标准写法
        for (int i = 0;i < array.size();i ++) {
            System.out.println(array.get(i));
        }

        //标准遍历
        for (int i = 0;i < array.size();i ++) {
            String s = array.get(i);    //接受的数据类型用同类型泛型
            System.out.println(s);
            //可以用s变量做很多事情了
        }


        //创建对象---构造方法类型
        ArrayList<Lei> array2 = new ArrayList<Lei>();

        Lei s1 = new Lei("A",1);
        Lei s2 = new Lei("B",2);
        Lei s3 = new Lei("C",3);

        array2.add(s1);
        array2.add(s2);
        array2.add(s3);

        System.out.println("array2");
        System.out.println(array2);

        for (int i = 0;i < array.size();i ++) {
            Lei s = array2.get(i);
            System.out.println(s.getA()+"---"+s.getB());
        }



    }



//此处以上是main方法内的
//======================================================================================================================
//此处以下是main方法外的



//不可修改方法、变量
    //final (用于声明常量、最终类或最终方法，最终变量不能被修改，最终类不能被继承，最终方法不能被重写)
    public final void aaa () {
        final int a = 0;
    }



//封装
    //this不能用于static方法中
    private int a;
    //设置（更改）    （名字：set + 方法名）
    public void setA(int b) {
        this.a = a;
    }
    //获取（返回数值）    （名字：get + 方法名）
    public int getA() {
        return a;
    }
    /*使用：
    * main方法中：
    *   setA更改数值
    *   getA获取数值
    * */



//重载
    /*方法重载:
     *   在同一类，出现相同方法名
     * 特点:
     *   1.同一个类中方法名相同，但参数列表不同
     *       参数列表的个数不同
     *       参数对应的数据类型不同
     * 使用场景:
     *   根据参数不同，执行不同的代码块
     * */
    public static int CZ(int a, int b) {
        return a + b;
    }
    public static int CZ(int a, int b, int c) {
        return a + b + c;
    }
    /*使用：
    * main中：
    *   根据不同的参数执行不同的方法
    * */



//构造方法
     /* 构造方法：
     *       给对象的数据初始化
     * 格式：
     *       1.方法名和类名相同
     *       2.没有返回值类型（void也不能写）
     *       3.没有具体返回值
     *
     * 使用方法：
     *      构造方法名 对象名 = new 构造方法();
     *
     * */

//无参构造方法
public class WuCanGouZaoFangFa {
    public WuCanGouZaoFangFa() {
        System.out.println("这是一个无参构造方法");
    }
}

//有参构造方法
public class YouCanGouZaoFangFa {
    private int a1;
    //封装
    //获取（更改）
    public void seta(int a1) {
        this.a1 = a1;
    }
    //设置（返回数值）
    public int getA() {
        return a1;
    }
}
    /*使用：
    *   在main方法中：
    *       类名 对象名 = new 构造方法(……);      注：…… 为形参
    * 如果没有构造方法，系统会提供一个默认无形参的构造方法
    * 如果已经给出构造方法，系统后续将不再提供默认的无参构造方法
    *
    * 构造方法可以重载
    * */



//枚举
    enum aaa {
        a,b,c,d,e,f
    }

}
