package xuexi.xiao.string;

//StringBuilderDemo

/*
 * String和StringBuilder的区别：
 *   String的内容是固定的
 *   StringBuilder的内容是可变的
 *
 * 构造方法：
 *   StringBuilder();
 *
 * 初始化默认长度为16
 *
 * 成员方法：
 *   public int capacity() ：         返回当前容量
 *   public int length() ：           返回长度（字符个数）
 *
 *   容量：理论值
 *   长度：实际值
 *
 *   public StringBuilder append(任意类型) ：       添加
 *   public StringBuilder reverse() ：            反转
 *
 *   public String toString() ：             StringBuilder转成String
 *   StringBuilder(String str) ：            String转成StringBuilder
 *
 * */

public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        System.out.println("sb：" + sb);
        System.out.println("sb.capacity：" + sb.capacity());
        System.out.println("sb.length：" + sb.length());



        System.out.println("===================================");



    //添加功能

        //append的第一种写法
        sb.append("hello");
        sb.append("world");

        //append的第二种写法（链式编程）
        sb.append(true).append("100");

        System.out.println("sb.append：" + sb);



        System.out.println("===================================");



    //反转功能
        sb.reverse();
        System.out.println("sb.reverse：" + sb);



        System.out.println("==================================");



    //转换
        //StringBuilder --- String
        String s = sb.toString();
        System.out.println("sb.toString：" + s);

        //String --- StringBuilder
        String ss = "hello";
        System.out.println("StringBuilder(String str)：" + ss);



        System.out.println("==================================");



    //判断字符串是否对称
        String ss1 = "OvO";
        sb.reverse();
        String ss2 = ss1;

        boolean bool = ss2.equals(ss1);
        System.out.println(bool);



    }
}

