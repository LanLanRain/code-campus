package com.rainsoul.subject.infra.basic.utils;

import com.alibaba.druid.filter.config.ConfigTools;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * 用于数据库加密和解密操作。它使用了阿里巴巴的Druid连接池中的ConfigTools类来生成密钥对，并使用这些密钥对进行数据的加密和解密。
 *
 * @author RainSoul
 * @create 2024-07-28
 */
public class DruidEncryptUtil {
    private static String publicKey;
    private static String privateKey;

    static {
        String[] keyPair = null;
        try {
            // 使用ConfigTools生成密钥对，512位长
            keyPair = ConfigTools.genKeyPair(512);
        } catch (NoSuchAlgorithmException e) {
            // 如果没有找到合适的算法，抛出运行时异常
            throw new RuntimeException(e);
        } catch (NoSuchProviderException e) {
            // 如果没有找到合适的提供者，抛出运行时异常
            throw new RuntimeException(e);
        }
        // 将生成的密钥对分别赋值给公钥和私钥
        privateKey = keyPair[0];
        publicKey = keyPair[1];
        // 打印公钥和私钥，通常在实际应用中不应该打印密钥
        System.out.println("publicKey = " + publicKey);
        System.out.println("privateKey = " + privateKey);
    }

    /**
     * 使用私钥对明文进行加密。
     *
     * @param plainText 需要加密的明文字符串
     * @return 加密后的密文字符串
     * @throws Exception 可能抛出的异常，如加密失败
     */
    public static String encrypt(String plainText) throws Exception {
        // 使用私钥进行加密操作
        String encrypt = ConfigTools.encrypt(privateKey, plainText);
        return encrypt;
    }

    /**
     * 使用公钥对密文进行解密。
     *
     * @param encryptedText 需要解密的密文字符串
     * @return 解密后的明文字符串
     * @throws Exception 可能抛出的异常，如解密失败
     */
    public static String decrypt(String encryptedText) throws Exception {
        // 使用公钥进行解密操作
        String decrypt = ConfigTools.decrypt(publicKey, encryptedText);
        return decrypt;
    }

    public static void main(String[] args) throws Exception {
        String encrypt = encrypt("1120Rain");
        // 打印加密结果
        System.out.println("encrypt = " + encrypt);
    }
}
