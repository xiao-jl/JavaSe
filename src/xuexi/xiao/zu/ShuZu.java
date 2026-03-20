package xuexi.xiao.zu;

// 数组

/*数组:数组是可以存储多个相同数据类型(元素)的有序容器
 * 基本数据类型,引用数据类型,数组都可以存储
 * 存储的多个变量的数据类型要一致
 *
 * 初始化：
 * 动态初始化：    只需要给出数组长度,默认给出初始化值
 *   数组类型 [] 数组名 = new 数据类型[数组长度];      new:为数组申请内存分配
 *
 * 静态初始化：    只需要给出初始化值,默认给出数组长度
 *   数组类型 [] 数组名 = new 数据类型[]{元素1,元素2,元素3,……};
 *   数组类型 [] 数组名 = {元素1,元素2,元素3,……};
 *
 * */

/*格式:
 * 1.
 * 数组类型 [] 数组名;
 * 2.
 * 数据类型 数组名 [];
 *
 * */

/*获取:
 * 数组名[索引]
 * 数组中的每个元素都是有编号的,
 * 最大的编号是,数组的长度-1
 * 通过数组名和编号配合,才可以获取指定编号的元素值
 *
 * 编号:索引
 *
 * */

public class ShuZu {
    public static void main(String[] args) {

        int[] aaa;
        int[] bbb;


        int[] ccc = new int[10];

        System.out.println(ccc);    // [I@1b6d3586   直接输出数组名,获取的是数组的地址值
        System.out.println(ccc[0]); // 0    默认值

        //赋值
        ccc[0] = 1;
        System.out.println(ccc[0]);

        int[] ddd = {1, 2, 3};
        System.out.println(ddd[0]);
        System.out.println(ddd[1]);
        System.out.println(ddd[2]);

        System.out.println("===============================");

        System.out.println(ddd.length);     // 获取数组长度   length:遍历

        System.out.println("===============================");

        //打印数组中所有的值
        for (int i = 0; i < ddd.length; i++) {
            System.out.println(ddd[i]);
        }

        //空指针
        int[] eee = {1, 2, 3};
        eee = null;
        System.out.println(eee[0]);

    }
}
