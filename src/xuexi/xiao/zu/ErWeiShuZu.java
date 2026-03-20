package xuexi.xiao.zu;

// 二维数组

// 一维数组的数组

/*格式:
 *   1.数据类型 [][] 数组名;     ------常用格式
 *   2.数据类型 数组名[][];
 *   3.數组类型 [] 数组名[];
 *
 * 初始化:
 *   动态初始化:
 *       数据类型 [][] 数组名 = new 数据类型[m][n];
 *   静态初始化:
 *       数据类型 [][] 数组名 = new 数据类型[][] {{元素……},{元素……},{元素……},……};
 *     简化:
 *       数据类型 [][] 数组名 = {{元素……},{元素……},{元素……},……};
 *
 * *m:二维数组中一维数组的个数
 *  n:一维数组中的元素个数
 *
 * */

public class ErWeiShuZu {
    public static void main(String[] args) {

        int[][] aaa = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(aaa);    //[[I@1b6d3586      两个中括号
        System.out.println(aaa[0]); //[I@4554617c       一个中括号

        //获取元素
        System.out.println(aaa[0][0]);
        System.out.println(aaa[0][1]);
        System.out.println(aaa[0][2]);


        //遍历二维数组
        for (int i = 0; i < aaa.length; i++) {
            for (int j = 0; j < aaa[i].length; j++) {
                System.out.println(aaa[i][j]);
            }
        }

    }
}
