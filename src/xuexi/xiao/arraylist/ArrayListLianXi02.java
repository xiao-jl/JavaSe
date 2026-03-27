package xuexi.xiao.arraylist;

//ArrayList练习02

import java.util.ArrayList;

public class ArrayListLianXi02 {
    public static void main (String[] args) {

        String[] strArray = {"Hello","Java","!!!"};

        ArrayList<String> Array = new ArrayList<String>();

        for (int i = 0;i < strArray.length;i ++) {

            Array.add(strArray[i]);

        }

        for (int i = 0;i < Array.size();i ++) {
            String s = Array.get(i);
        }

    }
}
