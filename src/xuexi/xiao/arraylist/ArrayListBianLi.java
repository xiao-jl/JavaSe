package xuexi.xiao.arraylist;

//ArrayList遍历

import java.util.ArrayList;

public class ArrayListBianLi {
    public static void main (String[] args) {

        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        array.add("Hello");
        array.add("Java");
        array.add("!!!");

        System.out.println(array);



        System.out.println("=====================");



        for (int i = 0;i < array.size();i ++) {
            System.out.println(array.get(i));
        }



        System.out.println("=====================");



        //标准写法
        for (int i = 0;i < array.size();i ++) {
            String s = array.get(i);    //接受的数据类型用同类型泛型
            System.out.println(s);
            //可以用s变量做很多事情了
        }

    }
}
