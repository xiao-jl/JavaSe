package xuexi.xiao.arraylist;

//ArrayList练习03

/*
* 存储自定义对象病遍历
* */

import java.util.ArrayList;

public class ArrayListLianXi03 {
    public static void main (String[] args) {

        ArrayList<ArrayListLianXi03_Lei> Array = new ArrayList<ArrayListLianXi03_Lei>();

        ArrayListLianXi03_Lei s1 = new ArrayListLianXi03_Lei("小明",30);
        ArrayListLianXi03_Lei s2 = new ArrayListLianXi03_Lei("小红",35);
        ArrayListLianXi03_Lei s3 = new ArrayListLianXi03_Lei("小亮",40);

        Array.add(s1);
        Array.add(s2);
        Array.add(s3);

        for (int i = 0;i < Array.size();i ++) {

            ArrayListLianXi03_Lei s = Array.get(i);
            System.out.println(s.getA()+"---"+s.getB());

        }

    }
}
