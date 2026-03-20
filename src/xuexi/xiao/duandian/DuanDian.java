package xuexi.xiao.duandian;

// 断点

/*
 * 1.可以通过断点调试查程序的执行流程
 * 2.调试程序
 *
 *
 * 断点:一个标记
 *
 *
 * 调试(debug):
 *   代码区域 :看程序的执行流程
 *   调试工具(Debug) 区域:看程序的执行步骤                   (调试区域)
 *   变量(Variables) 区域:看变量的创建、赋值、销毁等……        (可变参数区域)
 *   控制台(Console) 区域:看程序的输入输出结果               (控制台区域)
 *   断点(Breakpoints) 区域:批量处理断点
 *
 * */

public class DuanDian {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 5; i++) {

            sum += i;

        }

        System.out.println("sum:" + sum);

    }
}
