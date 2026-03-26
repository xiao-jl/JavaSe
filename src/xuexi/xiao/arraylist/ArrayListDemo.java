package xuexi.xiao.arraylist;

//ArrayListDemo

import java.util.ArrayList;

/* 集合类
*
*   特点：
*       长度可变
*
* ArrayList<E>：
*   大小数组可变的实现
*
* <E>：一种特殊的数据类型，泛型
*   使用：
*       在<E>的地方使用引用数据类型替换
*
*
*
* 构造方法：
*   ArrayList
*
* 成员方法：
*   添加元素：
*       public Boolean add (E e) ：    在末尾添加一个元素
*       public Boolean add (int index，E element) ：    在指定索引处添加一个元素
*
*   获取元素：
*       public E get (int index) ：    返回指定索引的元素
*
*   集合长度：
*       public int size () ：    返回集合中元素的个数
*
*   删除元素：
*       public void clear () ：    移除此列表中的所有元素
*       public E remove (int index) ：    删除指定索引处的元素，返回被删除的元素
*       public boolean remove (Object o) ：    删除指定的元素，返回删除是否成功
*   修改元素：
*       public E set (int index,E element) ：    修改指定索引处的元素，返回被修改的元素
*
* */

public class ArrayListDemo {
    public static void main(String[] args) {

        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        System.out.println("array:" + array);



        System.out.println("=====================");



        //public Boolean add (E e) ：    在末尾添加一个元素
        array.add("Java");
        array.add("!!!");

        //public Boolean add (int index，E element) ：    在指定索引处添加一个元素
        array.add(0,"Hello");

        System.out.println("array:" + array);



        System.out.println("=====================");



        //public E get (int index) ：    返回指定索引的元素
        System.out.println("get (0):" + array.get(0));
        System.out.println("get (1):" + array.get(1));
        System.out.println("get (2):" + array.get(2));



        System.out.println("=====================");



        //public int size () ：    返回集合中元素的个数
        System.out.println("size:" + array.size());



        System.out.println("=====================");



        //public E remove (int index) ：    删除指定索引处的元素，返回被删除的元素
        System.out.println("remove:" + array.remove(2));

        //public boolean remove (Object o) ：    删除指定的元素，返回删除是否成功
        System.out.println("remove:" + array.remove("Java"));



        System.out.println("=====================");



        //public E set (int index,E element) ：    修改指定索引处的元素，返回被修改的元素
        System.out.println("set:" + array.set(0,"A"));



        System.out.println("=====================");



        System.out.println("array:" + array);

    }
}
