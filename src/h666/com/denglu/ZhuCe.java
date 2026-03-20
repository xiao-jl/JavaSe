package h666.com.denglu;

import java.util.Scanner;
import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;

public class ZhuCe {

    // 文件路径常量
    private static final String ACCOUNT_FILE = "D:\\Develop\\JavaSe\\src\\h666\\com\\denglu\\ZhangHaoShuJu.txt";
    private static final String REGISTER_LOG_FILE = "D:\\Develop\\JavaSe\\src\\h666\\com\\denglu\\ZhuCe_log.txt";

    public void zhuCe(String[] a, String[] b) {

        boolean tui1 = false;
        Scanner sc = new Scanner(System.in);
        String zhangH = ""; // 在循环外声明变量

        // 从文件加载现有账户数据
        loadAccountsFromFile(a, b);

        while (true) {
            System.out.print("请输入要注册的账户名：");
            zhangH = sc.nextLine();

            boolean exists = false;

            for (int j = 0; j < a.length; j++) {
                if (a[j] != null && a[j].equals(zhangH)) {
                    System.out.println("\n账户名已被注册，请重新输入！\n");
                    exists = true;

                    // 记录重复注册尝试
                    logRegister(zhangH, false, "账户名已被注册");
                    break;
                }
            }

            if (!exists) {
                break;
            }
        }

        String miM;
        while (true) {
            System.out.print("请输入密码：");
            miM = sc.nextLine();
            System.out.print("请再次输入密码：");
            String miM2 = sc.nextLine();

            if (miM.equals(miM2)) {
                if (miM.trim().isEmpty()) {
                    System.out.println("密码不能为空！");
                    logRegister(zhangH, false, "密码为空");
                } else {
                    System.out.println("注册成功！");
                    break;
                }
            } else {
                System.out.println("密码不一致，请重新输入！");
                logRegister(zhangH, false, "密码不一致");
            }
        }

        //保存新账户到数组
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            a[index] = zhangH; //修正：使用循环中输入的账户名
            b[index] = miM;

            //保存到文件
            boolean saveSuccess = saveAccountToFile(a[index], b[index]);
            if (saveSuccess) {
                //记录成功的注册
                logRegister(zhangH, true, "注册成功");
            } else {
                logRegister(zhangH, false, "文件保存失败");
            }
        } else {
            System.out.println("账户数组已满，无法注册新用户！");
            logRegister(zhangH, false, "账户数组已满");
        }
    }

    //从文件加载账户数据到数组
    private void loadAccountsFromFile(String[] a, String[] b) {
        try {
            if (Files.exists(Paths.get(ACCOUNT_FILE))) {

                //读取文件所有行
                java.util.List<String> lines = Files.readAllLines(Paths.get(ACCOUNT_FILE));

                int index = 0;

                for (String line : lines) {
                    if (line.trim().isEmpty()) continue;

                    // 假设文件格式：用户名:密码
                    String[] parts = line.split(":");
                    if (parts.length == 2 && index < a.length) {
                        a[index] = parts[0];
                        b[index] = parts[1];
                        index++;
                    }
                }

                //记录加载日志
                logSystem("加载账户数据", "成功加载 " + index + " 个账户");
            }
        } catch (IOException e) {
            System.out.println("读取账户文件失败: " + e.getMessage());
            logSystem("加载账户数据", "失败: " + e.getMessage());
        }
    }


    //保存新账户到文件

    private boolean saveAccountToFile(String username, String password) {
        try {
            // 如果文件不存在会自动创建
            Files.write(Paths.get(ACCOUNT_FILE),
                    (username + ":" + password + System.lineSeparator()).getBytes(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("账户已保存到文件");
            return true;
        } catch (IOException e) {
            System.out.println("保存账户到文件失败: " + e.getMessage());
            return false;
        }
    }

    //记录注册日志
    private void logRegister(String username, boolean success, String message) {
        try {
            String timestamp = LocalDateTime.now().toString();
            String status = success ? "成功" : "失败";
            String logEntry = String.format("[%s] 操作: 注册, 用户: %s, 状态: %s, 详情: %s%s",
                    timestamp, username, status, message, System.lineSeparator());

            Files.write(Paths.get(REGISTER_LOG_FILE),
                    logEntry.getBytes(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("记录注册日志失败: " + e.getMessage());
        }
    }

    //记录系统操作日志
    private void logSystem(String operation, String message) {
        try {
            String timestamp = LocalDateTime.now().toString();
            String logEntry = String.format("[%s] 操作: %s, 详情: %s%s",
                    timestamp, operation, message, System.lineSeparator());

            Files.write(Paths.get(REGISTER_LOG_FILE),
                    logEntry.getBytes(),
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("记录系统日志失败: " + e.getMessage());
        }
    }

}