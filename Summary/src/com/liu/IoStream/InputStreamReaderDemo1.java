package com.liu.IoStream;

import java.io.*;

/**
 * 字符输入转换流 InputStreamReader
 */
public class InputStreamReaderDemo1 {
    public static void main(String[] args) throws Exception {
        //1.public InputStreamReader(inputStream is, String charset) 可以把原始的字节流按照指定编码转换成字符输入流，避免乱码
        //默认还是会已UTF-8输出
        InputStream in = new FileInputStream("D:/information/转换流GBK.txt");
        //InputStreamReader ins = new InputStreamReader(in);
        InputStreamReader ins = new InputStreamReader(in , "UTF-8");//字符转换流包字节输入流

        BufferedReader br = new BufferedReader(ins);//缓冲流包字符转换流
        String line;
        while((line = br.readLine()) != null)
        {
            System.out.println(line);
        }

    }
}
