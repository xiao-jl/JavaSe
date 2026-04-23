package h666.com.jiamijiemi.haxizhi;

//MD5

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static void MD5(String MD5_zhi) {

        String md5Hex;

        System.out.println("原文: " + MD5_zhi);

        try {
            // 1. 获取 MD5 算法实例
            MessageDigest md = MessageDigest.getInstance("MD5");

            // 2. 计算哈希字节数组
            byte[] messageDigest = md.digest(MD5_zhi.getBytes(StandardCharsets.UTF_8));

            // 3. 将字节数组转换为 16 进制字符串
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                // 将每个字节转为 2 位 16 进制
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0'); // 补零
                }
                hexString.append(hex);
            }
            md5Hex = hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("找不到 MD5 算法", e);
        }

        System.out.println("MD5 哈希值: " + md5Hex);

    }
}

