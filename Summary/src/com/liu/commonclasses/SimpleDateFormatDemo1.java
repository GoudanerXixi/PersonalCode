package com.liu.commonclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作用：可以对Date对象或时间毫秒值格式化成我们喜欢的时间形式
 * 也可以把字符串的时间形式解析成日期对象
 */
public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //构造器public SimpleDateFormat()  构造一个SimpleDateFormat，使用默认格式
        //public SimpleDateFormat(String pattern)  构造一个SimpleDateFormat，使用指定的格式
        //1.public final String format(Date date) 将日期格式化成日期/时间字符串
        //2.public final String format(Object time) 将时间毫秒值格式化成日期/时间字符串
        Date d1 = new Date();
        long time = d1.getTime();
        System.out.println(d1);
        System.out.println(time);
        SimpleDateFormat s1 = new SimpleDateFormat();
        String str1 = s1.format(d1);
        String str2 = s1.format(time);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("---------------------");

        //格式化日期对象成指定的形式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        Date d2 = new Date();
        long time2 = d2.getTime();
        String str3 = sdf.format(d2);
        String str4 = sdf.format(time2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("-------------------");

        //将字符串解析成日期对象
        String str5 = "2022年04月10日 13:14:21";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //形式必须与被解析的时间的形式完全一样，否则报错
        Date d3 = sdf1.parse(str5);//系统会确认你没写错，Alt+回车 就好
        System.out.println(d3);
    }
}
