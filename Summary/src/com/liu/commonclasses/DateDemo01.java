package com.liu.commonclasses;

import javax.xml.crypto.Data;
import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        //1.创建一个日期对象代表了：当前系统的此刻日期时间对象
        Date d1 = new Date();//public Date()
        System.out.println(d1);

        long time = d1.getTime();//时间毫秒值
        System.out.println(time);

        Date d2 = new Date(time);//public Data(long time)把时间毫秒值转换成Data日期对象
        System.out.println(d2);

        //publlic void setTime(long time)设置日期对象的时间为当前时间毫秒值对应的时间
       long time2 = System.currentTimeMillis()+(60 * 60 + 121) * 1000;
        Date d3 = new Date();
        d3.setTime(time2);
        System.out.println(d3);


    }
}
