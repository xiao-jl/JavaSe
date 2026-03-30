package xuexi.xiao.string;

//String

/*
 * String：字符串类
 *      由多个字符组成的一串数据
 *      本质是一个字符数组
 *
 * 构造方法：
 *      String(String original)：把字符串数据封装成字符串对象
 *      string(char[]value)：把字行数组的数据封装成字符串对象
 *      string(char[]value，int index，int count)：把字符数组中的一部分数据封装成字符串对象
 *
 * String类的获取功能：
 *      int length()：获职字符串的长度，其实也就是字符个数
 *      char charAt(int index)：获取指定索引处的字符
 *      int indexOf(String str)：获取str在字符串对象中第一次出现的索引
 *      String substring(int start)：从start开始截取字符串
 *      String substring(int start,int end)：从start开始，到end结束越取字符串。包括start，不包括end
 *
 * String类的转换功能：
 *      char[] toCharArray()：把字符串转换为字符数组
 *      String toLowerCase()：把字符串转换为小写字符串
 *      String toUpperCase()：把字符串转换为大写字符串
 *
 * String类的其他功能：
 *      String trim()：去除字符串两端空格
 *      String[] split(String str)：按照指定符号分割字符串
 *
 * 注意:：字符串是一种比较特殊的引用数据类型，直接输出字符串对象输出的该对象中的数据
 *
 * */

import javax.imageio.ImageIO;

public class StringDemo {
    public static void main(String[] args) {

        String a = "";
        String s = "Hello Java!!!";
        String ss01 = " Hello Java!!! ";
        String ss02 = "aa,bb,cc";

        //String(String original)：把字符串数据封装成字符串对象
        String s1 = "Helloworld";
        System.out.println("s1:" + s1);

        // string(char[]value)：把字符数组的数据封装成字符串对象
        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //string(char[]value，int index，int count)：把字符数组中的一部分数据封装成字符串对象
        String s3 = new String(chs, 0, 3);
        System.out.println("s3:" + s3);

        //直接赋值打印
        String s4 = "hello";
        System.out.println("s4:" + s4);

        System.out.println("========================================");

        //int length(): 获取字符串的长度，其实也就是字符个数
        System.out.println(s1.length());

        //char charAt(int index):获职指定索引处的字符
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));

        //int indexOf(String str):获职str在字符串对象中第一次出现的索引
        System.out.println(s1.indexOf('h'));
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.indexOf("o"));

        //String substring(int start):从start开始截职字符串
        System.out.println(s1);
        System.out.println(s1.substring(5));

        //String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end
        System.out.println(s1);
        System.out.println(s1.substring(3, 8));

        System.out.println("========================================");

        //char[] toCharArray()：把字符串转换为字符数组
        char[] chs1 = s.toCharArray();
        for (int i = 0;i < chs1.length;i ++) {
            System.out.println(chs1[i]);
        }

        //String toLowerCase()：把字符串转换为小写字符串
        System.out.println(s.toLowerCase());
        System.out.println("Hello JAVA!!!".toUpperCase());

        //String toUpperCase()：把字符串转换为大写字符串
        String s01 = s.substring(0,1);
        String s02 = s.substring(1);
        String s03 = s01.toUpperCase() + s02.toLowerCase();
        System.out.println(s03);

        System.out.println("========================================");

        //String trim()：去除字符串两端空格
        System.out.println(ss01.trim());

        //String[] split(String str)：按照指定符号分割字符串
        String[] strArray = ss02.split(",");
        for (int i = 0;i < strArray.length;i ++) {
            System.out.println(strArray[i]);
        }

    }
}
