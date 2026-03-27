package xuexi.xiao.arraylist;

//ArrayList练习01

import java.util.ArrayList;

public class ArrayListLianXi01 {
    public static void main (String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("Hello");
        array.add("Java");
        array.add("!!!");

        for (int i = 0;i < array.size();i ++) {

            String s = array.get(i);
            System.out.println(s);

        }

    }
}
