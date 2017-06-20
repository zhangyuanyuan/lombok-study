package com.kg.lombokstudy.clearup;

import lombok.Cleanup;

import java.io.*;

/**
 * clearup 注解使用，保证资源最后关闭
 *
 *
 * JKD7里面就已经提供 try with resource
 * Created by quanquan on 2017/6/20.
 */
public class ClearUpExample {

    public static void main(String[] args) throws IOException {
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);

        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }
}
