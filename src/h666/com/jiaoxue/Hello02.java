package h666.com.jiaoxue;

public class Hello02 {
    public static void main(String[] args) {

        System.out.println("1");
        System.out.println("2");
        System.out.print("3");  //不换行
        System.out.println("4");


        //   \n       换行
        System.out.println("Hello\njava!");
                                //

        //   \t       缩进
        System.out.println("Hello\tjava!");

        //127
        int a = (byte) 127;
        System.out.println(a);
        // a == -127

        long b = 1L;
        System.out.println(b);

        /*
            byte (8位有符号整数，范围 -128 到 127)
            short (16位有符号整数，范围 -32,768 到 32,767)
            int (32位有符号整数，范围 -2,147,483,648 到 2,147,483,647)
            long (64位有符号整数，范围 -2^63 到 2^63-1)       (值的末尾加 L)

         */

    }
}


//单行注释

/*
* 多
* 行
* 注
* 释
*
* */
