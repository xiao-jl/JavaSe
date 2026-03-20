package h666.com.denglu;

import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class DengLu {

    // 文件路径常量
    private static final String ACCOUNT_FILE = "D:\\Develop\\JavaSe\\src\\h666\\com\\denglu\\ZhangHaoShuJu.txt";

    public void dengLu(String[] a, String[] b) {

        // 从文件加载账户数据
        loadAccountsFromFile(a, b);

        Scanner sc = new Scanner(System.in);

        boolean zhangYN = false;
        boolean miYN = false;
        boolean yN = false;
        String yongHu = "";

        for (int i = 0; i <= 2; ) {
            while (true) {
                System.out.print("请输入账户名：");
                yongHu = sc.nextLine();

                // 检查账户是否存在
                for (int j = 0; j < a.length; j++) {
                    if (a[j] != null && a[j].equals(yongHu)) {
                        zhangYN = true;
                        break;
                    }
                }

                if (zhangYN){
                    break;
                }

                if (yongHu.equals("")) {
                    System.out.println("\n账户名不能为空！\n");
                } else if (!zhangYN) {
                    System.out.println("\n账号未注册！登录失败\n");
                    break;
                }
            }

            // 如果账户名验证失败，重新开始
            if (!zhangYN) {
                continue;
            }

            System.out.print("\n请输入密码：");
            String miMa = sc.nextLine();

            if (miMa.equals("")) {
                System.out.println("密码不能为空！\n");
                continue;
            }

            System.out.print("\n");

            // 验证密码
            for (int j = 0; j < a.length; j++) {
                if (a[j] != null && a[j].equals(yongHu) && b[j] != null && b[j].equals(miMa)) {
                    miYN = true;
                    break;
                }
            }

            yN = zhangYN && miYN;

            if (yN) {
                System.out.println("登录成功！");

                // 记录登录日志
                logLogin(yongHu, true, "登录成功");
                zhangYN = false;
                miYN = false;
                break;
            } else if (zhangYN && !miYN && (2 - i != 0)) {
                System.out.println("密码错误！登录失败，你还有" + (2 - i) + "次机会\n");

                // 记录登录失败日志
                logLogin(yongHu, false, "密码错误");
                zhangYN = false;
                miYN = false;
                i++;
            } else if ((2 - i) == 0) {
                System.out.println("您已被限制访问！请联系管理员！");

                // 记录登录失败日志
                logLogin(yongHu, false, "尝试次数过多被锁定");
                break;
            }
        }
    }

    //日志
    private void loadAccountsFromFile(String[] a, String[] b) {
        try {
            if (Files.exists(Paths.get(ACCOUNT_FILE))) {

                //读取文件所有行
                java.util.List<String> lines = Files.readAllLines(Paths.get(ACCOUNT_FILE));

                int index = 0;

                for (String line : lines) {
                    if (line.trim().isEmpty()) continue;

                    //文件格式：用户名:密码
                    String[] parts = line.split(":");
                    if (parts.length == 2 && index < a.length) {
                        a[index] = parts[0];
                        b[index] = parts[1];
                        index++;
                    }
                }

            } else {
                System.out.println("账户文件不存在，请先注册账户");
            }
        } catch (IOException e) {
            System.out.println("读取账户文件失败: " + e.getMessage());
        }
    }

    //日志类
    private void logLogin(String username, boolean success, String message) {
        try {
            String logFile = "D:\\Develop\\JavaSe\\src\\h666\\com\\denglu\\DengLu_log.txt";
            String timestamp = java.time.LocalDateTime.now().toString();
            String logEntry = String.format("[%s] 用户: %s, 状态: %s, 详情: %s%s",
                    timestamp, username, success ? "成功" : "失败", message, System.lineSeparator());

            Files.write(Paths.get(logFile),
                    logEntry.getBytes(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);

        } catch (IOException e) {
            System.out.println("记录登录日志失败: " + e.getMessage());
        }

    }

}