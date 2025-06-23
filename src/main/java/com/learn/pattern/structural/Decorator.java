package com.learn.pattern.structural;

import java.io.*;

/**
 * @author: jphao
 * @date: 2025/6/22 22:25
 * @description:
 */
public class Decorator {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("test.txt"));
        byte[] buffer = new byte[1024];
        int read = 0;
        while ((read = inputStream.read(buffer)) > -1) {
            System.out.println(new String(buffer, 0, read));
        }
    }
}
