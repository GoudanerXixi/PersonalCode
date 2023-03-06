package com.liu.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 目标：熟悉正则表达式的基本符号
 * 熟悉表达式在String方法里的一些作用
 * 用正则表达式爬取一些信息
 */
public class RegExp {
    public static void main(String[] args) {
        //  /d数字  /w英文数字下划线  .任何字符  ?一次或根本不 *零次或多次  +一次或多次 Xn{} X正好出现n次
        System.out.println(checkPhone("12456559125"));
        System.out.println(checkPhone("13456559125"));
        System.out.println(checkPhone("1456559125"));
        System.out.println("-----------------");
        System.out.println(keywordCheck("0245"));
        System.out.println(keywordCheck("0Z45"));
        System.out.println(keywordCheck("0_45"));
        System.out.println(keywordCheck("vevQ"));
        System.out.println(keywordCheck("____"));
        System.out.println("-------------------");
        System.out.println(emailCheck("486548949@446846"));
        System.out.println(emailCheck("dwgw44336@.vwe.com"));
        System.out.println(emailCheck("48451855@qq.com"));
        System.out.println(emailCheck("48464894894@163.com"));
        System.out.println(emailCheck("454864654894@pci.com.cn"));

        //正则表达式在String方法里的一些应用
        String name = "西西454654f狗蛋儿44sd永远在一起";
        String[] names = name.split("\\w+");
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
        String name2 = name.replaceAll("\\w+","  ");
        System.out.println(name2);

        //根据正则表达式爬取一些有用的信息
        String data = "来这儿胡覅我hi发你覅发读出无法撒啊，电话：13456559125，错部分金额覅欧文iowev" +
                "你的邮箱是：48451855@qq.com，请你尽快和我没们联系，这是我们的邮箱：454864654894@pci.com.cn";

       String regex = "(1[3-9]\\d{9})|(\\d{1,20}@[\\w&&" +
               "[^_]]{1,5}\\.[a-z]{1,3}(.[a-z]{1,3})?)";
        //把爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //得到内容匹配器对象
        Matcher matcher = pattern.matcher(data);

        //开始查找
        while(matcher.find()){
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
        Integer.parseInt("12");//字符串转换成整数

        String.valueOf(12);//整数转化成字符串


    }
    //校验电话号码
    public static boolean checkPhone(String phone){
        return phone != null && phone.matches("1[3-9]\\d{9}");
    }
    //校验四位验证码数字或者字母
    public static boolean keywordCheck(String keyword){
        return keyword != null && keyword.matches("[\\w&&[^_]]{4}");
    }
    //校验邮箱
    //48451855@qq.com
    //48464894894@163.com
    //454864654894@pci.com.cn
    public static boolean emailCheck(String email){
        return email != null && email.matches("\\d{1,20}@[\\w&&[^_]]{1,5}\\.[a-z]{1,3}(.[a-z]{1,3})?");
    }
}
