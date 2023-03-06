package com.liu.string;

public class StringApi {
    public static void main(String[] args) {
        //1.public int length()，获取字符串长度
        String name1 = "西西喜欢狗蛋儿";
        System.out.println(name1.length());

        //2.public char charAt(),获取某个索引位置处的字符
        System.out.println(name1.charAt(0));//西
        System.out.println(name1.charAt(1));//西
        System.out.println(name1.charAt(2));//喜
        for (int i = 0; i < name1.length(); i++) {
            System.out.print(name1.charAt(i));//西西喜欢狗蛋儿
        }
        System.out.println();


        //3.public char[] toCharArray(),把字符串转换成字符数组
        char[] ch = name1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char a = ch[i];
            System.out.print(a);//西西喜欢狗蛋儿
        }
        System.out.println();

        //4.public String substring(int beginIndex, int endIndex)， 截取字符串长度包前不包后
        // subsring(int beginIndex)开始截取到最后
        String name2 = "西西和狗蛋儿会一直在一起";
        String st = name2.substring(0, 6);
        System.out.println(st);//西西和狗蛋儿
        String st1 = name2.substring(6);
        System.out.println(st1);//会一直在一起


        //5.public String replace(CharSequence target, CharSequence replacement),将指定字符替换成指定内容
        String name3 = "西西爱狗蛋儿，西西爱狗蛋儿，西西爱狗蛋儿";
        System.out.println(name3);
        String st2 = name3.replace("爱", "喜欢");
        System.out.println(st2);

        //6.public boolean contains(CharSequence s),判断字符，返回真假
        String name4 = "狗蛋儿也喜欢西西";
        boolean b = name4.contains("狗蛋儿");
        System.out.println(b);//true
        b = name4.contains("也喜欢");
        System.out.println(b);//true
        b = name4.contains("喜西西");
        System.out.println(b);//false

        //7.public boolean startsWiths(String prefix)，判断首个字符，返回真假
        boolean c = name4.startsWith("狗蛋儿");
        System.out.println(c);//true
        c = name4.startsWith("狗蛋儿也喜欢");
        System.out.println(c);//true
        c = name4.startsWith("狗蛋儿喜");
        System.out.println(c);//false


        //8.public String[] split(String s):按照某个字符，把字符串分割成字符串数组返回
        String name5 = "贾乃绿,王宝强,陈羽凡";
        String[] str = name5.split(",");
        for (int i = 0; i < str.length; i++) {

            System.out.println("选择了:" + str[i]);

        }

        //字符串内容的比较不适合"=="，"=="适合基本数据类型，引用数据类型用equall
        String ss1 = "xixi";
        String ss2 = "xi";
        String ss3 = ss2 + "xi";
        String ss4 = ss2 +"XI";
        System.out.println(ss1 == ss3);//false,比较的是地址
        System.out.println(ss1.equals(ss3));//true  只关心内容是否一样
        System.out.println(ss1.equalsIgnoreCase(ss4));//true  忽略大小写


    }
}
