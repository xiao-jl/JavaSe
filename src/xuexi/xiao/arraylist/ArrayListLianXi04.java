package xuexi.xiao.arraylist;

//ArrayList练习04

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListLianXi04 {
    public static void main (String[] args) {

        ArrayList<ArrayListLianXi04_Lei> array = new ArrayList<ArrayListLianXi04_Lei>();

        Scanner sc = new Scanner(System.in);

        //录入数据
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄：");
        int age = sc.nextInt();

        //设置数据
        ArrayListLianXi04_Lei s = new ArrayListLianXi04_Lei();
        s.setName(name);
        s.setAge(age);

        //存储数据至ArrayList集合
        array.add(s);

        //遍历数据
        for(int i = 0;i < array.size();i++) {
            ArrayListLianXi04_Lei ss = array.get(i);
            System.out.println(ss.getName()+"---"+ss.getAge());
        }

    }
}
