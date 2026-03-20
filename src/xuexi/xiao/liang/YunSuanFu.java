package xuexi.xiao.liang;

// 运算符

/*
 * 算术云算符
 * 赋值运算符
 * 关系运算符
 * 逻辑运算符
 * 三元运算符
 *
 * */

/*算数运算符:+,-,*,/,%,++,--,=,==
 * +，获取多位数相加的和
 * -，获取多位数相减的差
 * *，获取多位数相乘的积
 * /，获取多位数相除的商
 * %，获取多位数相除的余数
 * ++，变量加一（在变量前：先加后赋值或运算，在变量后：先赋值后加）
 * --，变量减一（在变量前：先减后赋值或运算，在变量后：先赋值后减）
 * =，赋值
 * ==，等于、比较两个值是否相等（基本数据类型是比较值，引用数据类型是比较地址值）
 * */

// “++”变量值做加1，“--”变量值做减1
// 整数相除只得整数，除非添加浮点数（例:4.0）
public class YunSuanFu {

    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        // +，-，*,/
        // 数字
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//无浮点，结果是小数则为0

        System.out.println("=====================");

        // 字符串
        System.out.println("Hello" + a + b);//拼接，不运算
        // 字符
        System.out.println('A' + a);//字符‘A’在计算机里存储的数字是65
        System.out.println('a' + a);//字符‘a’在计算机里存储的数字是97

        System.out.println("=====================");

        // ++,--
        System.out.println(a);
        // 单独使用，放在变量的前后无所谓
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        // 参与运算（非单独使用）
        int bb = a++;// 先运算，再++
        int bbb = ++a;// 先++，再运算
        // --同理
        System.out.println(bb);
        System.out.println(bbb);

        System.out.println("=====================");

        // %(取余)，两个数相除的余数
        System.out.println(b % a);
        System.out.println(a % b);


        System.out.println("赋值运算符=====================");


        // 赋值运算符

        /*
         * 基本：=
         * 常用：+=，-=，*=，/=,%=
         *
         * */

        int f = 10;
        f += 20; //f = f + 20
        System.out.println(f);
        f -= 5;
        System.out.println(f);

        // 注意:常用的赋值运算符隐含了强制类型转换
        byte g = 20;
        g += 107;//g = (g的数据类型)(g+107);
        System.out.println(g);


        System.out.println("关系运算符=====================");


        // 关系运算符

        // 关系运算符:==,!=,>,>=,<,<=
        // 关系运算符的结果是boolean类型(布尔类型),true、false

        int j = 10;
        int h = 20;
        int r = 10;

        // ==(等于)
        System.out.println(j == h);
        System.out.println(j == r);

        // !=(不等于)
        System.out.println(j != h);
        System.out.println(j != r);


        System.out.println("逻辑运算符=====================");


        // 逻辑运算符

        // 逻辑运算符:&、|、^、!、&&、||,分别是与、或、异或、非、双与、双或
        // 用于连接关系表达式
        // 逻辑运算符的结果是boolean类型(布尔类型),true、false

        /*
         * &:结果有false则false,只有两个都是true才得true
         * |:结果有true则true,只有两个都是false才得false
         * ^:结果相同则false,不同则true
         * !:true则false,false则true
         *
         * &和&&结果一样
         * |和||结果一样
         *
         * &和&&的区别:
         *   &无论左边是什么,右边都会执行
         *   &&具有短路效果,左边值为false之后,右边就不执行了
         *
         * |和||的区别:
         *   |无论左边是什么,右边都会执行
         *   ||具有短路效果,左边值为true之后,右边就不执行了
         * */

        int k = 3;
        int l = 4;
        int m = 5;

        // &
        System.out.println((k > l) & (k > m));//false & false
        System.out.println((k < l) & (k > m));//true & false
        System.out.println((k > l) & (k < m));//false & true
        System.out.println((k < l) & (k < m));//true & true

        System.out.println("=====================");

        // |
        System.out.println((k > l) | (k > m));//false | false
        System.out.println((k < l) | (k > m));//true | false
        System.out.println((k > l) | (k < m));//false | true
        System.out.println((k < l) | (k < m));//true | true

        System.out.println("=====================");

        // ^
        System.out.println((k > l) ^ (k > m));//false ^ false
        System.out.println((k < l) ^ (k > m));//true ^ false
        System.out.println((k > l) ^ (k < m));//false ^ true
        System.out.println((k < l) ^ (k < m));//true ^ true

        System.out.println("=====================");

        // !
        System.out.println((k > l));
        System.out.println(!(k > l));

        System.out.println("=====================");

        // &&
        System.out.println((k > l) && (k > m));//false && false
        System.out.println((k < l) && (k > m));//true && false
        System.out.println((k > l) && (k < m));//false && true
        System.out.println((k < l) && (k < m));//true && true

        System.out.println("=====================");

        // ||
        System.out.println((k > l) || (k > m));//false || false
        System.out.println((k < l) || (k > m));//true || false
        System.out.println((k > l) || (k < m));//false || true
        System.out.println((k < l) || (k < m));//true || true


        System.out.println("三元运算符=====================");


        // 三元运算符

        /*
         * 格式:  数据类型 变量名 = 关系表达式?表达式1:表达式2;
         *
         * 执行流程:
         *      1.先计算关系表达式的结果(true/false)
         *      2.如果是true,则把表达式1的结果返回,为结果
         *        如果是false,则把表达式2的结果返回,为结果
         * */

        int n = 10;
        int o = 20;

        int p = (n > o) ? n : o;

        System.out.println(p);

        System.out.println("=====================");

        // 比较两个整数是否相同

        int q = 30;
        int s = 50;

        boolean zz = q == s;

        System.out.println(zz);

    }
}
