package xuexi.xiao.arraylist;

//ArrayList练习02

/*
* 判断第一个字是不是特定的字符
* */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLianXi02 {
    public static void main (String[] args) {

        String[] strArray = {"小亮","张一","小明","张二","张三","小红"};

        ArrayList<String> Array = new ArrayList<String>();

        Collections.addAll(Array, strArray);

        for (int i = 0;i < Array.size();i ++) {

            String s = Array.get(i);

            if (s.startsWith("张")) {

                System.out.println(s);

            }

        }

    }
}
