package xuexi.xiao.duixiang;

//基础测试类

/*
 * 类与对象的使用
 * 成员变量和局部变量的区别
 * 封装（private）
 * this关键字
 * 构建方法
 *
 * */

/*
 * main方法不适合放在事物描述类中，必须重新创建一个测试类
 *
 * 使用一个类：其实就是使用一个类的成员（成员变量和成员方法）
 * 使用一个类的成员，必须先拥有这个类的对象
 *
 * 创建对象的格式：
 *       类名 对象名 = new 类名();
 *
 * 访问类中成员：
 *       访问成员变量：对象名.变量名
 *       访问成员方法：对象名.方法名(……)     注：…… 为形参
 *
 * */

/*
 * 通过对象直接访问成员变量，会存在数据安全问题
 *
 * 成员变量赋值：
 *       1.无参：无参结构方法 + set……()方法
 *       2.有参：带参结构方法
 *
 * */

public class JiChuCeShiLei {

    //成员变量
    int a;

    public static void main(String[] args) {

        //创建对象
        JiChuChengYuanLei s = new JiChuChengYuanLei();
        System.out.println("s:" + s);     //xuexi.xiao.duixiang.GongGongLei@1b6d3586

        //输出成员变量
        System.out.println("变量a：" + s.a);

        //给成员变量赋值
        s.a = 10;

        //再次输出成员变量
        System.out.println("变量a：" + s.a);

        System.out.println("================================");

        //调用成员方法
        s.fangFa();

        System.out.println("================================");

        //封装
        //private的修改变量
        s.setB(18);
        System.out.println(s.getB());

    }

    //成员方法
    public void fangFa() {

        System.out.println("我是成员方法");

    }

}
