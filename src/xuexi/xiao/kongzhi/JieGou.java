package xuexi.xiao.kongzhi;

// 结构

/*类型
 * 1.顺序结构
 * 2.选择结构:if,switch
 * 3.循环结构:for,while,do……while
 * */
public class JieGou {
    public static void main(String[] args) {
// 顺序结构:从上往下依次执行
        System.out.println("顺序开始");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("顺序结束");

// 选择结构:

        // if语句(单选择)

        /*结构:
         *
         * if(关系表达式){
         *   语句体
         * }
         *
         * */

        /*流程:
         * 1.判断结果为true/false
         * 2.true:执行语句体
         *   false:不执行语句体
         * */
        System.out.println("选择1开始");
        int a = 10;
        int b = 10;

        if (a == b) {
            System.out.println("执行了if语句体");
        }

        System.out.println("选择1结束");

        // if语句(双选择)

        /*结构:
         *
         * if(关系表达式){
         *  语句体1;
         * }else{
         * 语句体2;
         * }
         *
         * */

        /*流程:
         * 1.判断结果为true/false
         * 2.true:执行语句体1
         *   false:执行语句体2
         * */

        if (a == b) {
            System.out.println("执行了if语句体1");
        } else {
            System.out.println("执行了if语句体2");
        }

        // if语句(多选择)

        /*结构:
         *
         * if(关系表达式1){
         *  语句体1;
         * }else if(关系表达式2){
         *  语句体2;
         * }
         * ……
         * else{
         *  语句体n……
         * }
         *
         * */

        /*流程:
         * 1.判断结果为true/false
         * 2.true:就执行语句体1
         * 3.false:继续判断关系表达式2 true还是false
         *   如果是true就执行语句体2 false,继续…
         * 4.如果没有任何关系表达式true 执行else里的语句体n
         *
         * */

        if (a < b) {
            System.out.println("a<b");
        } else if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a=b");
        }

        // switch

        /*结构:
         *
         * switch(表达式){
         *   case 值1:
         *       语句体1;
         *      break;
         *   case 值2:
         *       语句体2;
         *      break;
         *   ……
         *   default:
         *       语句体n;
         *      break;
         * }
         *
         * */

        /*格式说明:
         *   表达式:byte,short,int,char
         *       JDK5以后可以是枚举
         *       JDK7以后可以是字符串
         *
         *   case的值:用来和表达式进行匹配
         *   break:中断的意思 (不加则穿透)
         *   default:所有的case值不匹配,最后执行default的语句体
         *
         * */

        /*执行流程:
         * 1,首先判断表达式的值
         * 2,拿看表达式的值,依次去和case里面的值去比较,有匹配的就去执行对应的语句体,执行过程中遇到break就结束
         * 3,如果判断所有的case值都不匹配,就去执行default里的语句体n
         *
         * */

        switch (a) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("3");
                break;

        }


// 循环结构:for,while,do……while

        /*组成:
         * 1.初始化语句:一般由一条语句完成初始化操作(比如:int i = 0)
         * 2.判断条件语句:是一个boolean表达式,判断是否执行循环体
         * 3.循环体语句:循环执行部分，需要多次执行的代码
         * 4.控制条件语句:在一次循环代码结束之后,下一次判断条件语句执行前执行控制循环条件中变量,使循环语句在合适的时候结束
         *
         * */

        /*3种循环和区别:
         *
         *   1.do...while循环 至少执行一次循环体语句
         *   2.for循环和while循环 必须要满足判断条件语句之后才可以去执行循环体语句
         *
         *       for循环和while循环的区别:
         *           for循环结束后，初始化的变量就不能使用了
         *           while循环结束之后，初始化的变量是可以可以使用的
         *
         *   推荐使用顺序:
         *       for-----while-----do……while
         *
         * */


        // for循环

        /*格式:
         * for(初始化语句;判断条件语句;控制条件语句){
         *   循环体语句;
         * }
         *
         * */

        /*执行流程:
         * 1.执行初始化语句
         * 2.执行判断条件语句,看结果true还是false
         *       如果是false,循环结束
         *       如果是true,继续执行
         * 3.执行循环体语句
         * 4.执行控制条件语句
         * 5.回到第二步继续
         *
         * */

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }


        System.out.println("=========================");


        // while循环

        /*格式:
         * while(判断条件语句){
         *   循环体语句;
         * }
         *
         * */

        int i = 0;

        while (i < 5) {
            System.out.println("Hello World!");
            i++;
        }

        // while死循环
        while (true) {
            System.out.println("死循环");
            //中断
            break;
        }

        // do……while循环

        /*格式:
         * 初始化语句;
         * do{
         *   循环体语句;
         *   控制条件语句;
         * }while(判断条件语句);
         *
         * */

        /*流程:
         * 1.执行初始化语句
         * 2.执行循环体语句
         * 3.执行控制条件语句
         * 4.执行判断条件语句，看是true还是false
         *   如果是false,就结東
         *   如果是true,就回到第二步继续
         *
         * */

        int c = 0;

        do {
            System.out.println("do");
            c++;
        } while (c < 3);


        System.out.println("====================================");


        /*
         * break:中断当前的循环
         * 仅能使用在switch和循环中
         *
         * continue:跳过当前这次循环,执行下一次循环
         *
         *
         * */

        // break:
        for (i = 0; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("break");
        }


        System.out.println("====================================");


        // continue
        for (i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

    }
}
