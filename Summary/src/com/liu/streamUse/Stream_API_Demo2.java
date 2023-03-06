package com.liu.streamUse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//需要熟悉的三个函数式接口（只有一个抽象方法）
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * filter：过滤流中的数据
 * limit：获取前几个元素
 * skip：跳过前几个元素
 * map：加工方法
 * distinct：去除流中的重复元素（依赖Hashcode和equals）
 * concat(Stream a, Stream b)：合并两个流
 * count返回流中的元素数
 * max min返回流中的最大值、最小值
 */
public class Stream_API_Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰",  "周芷若", "张无忌", "小昭", "赵敏", "张三", "谢逊");
        //filter过滤出姓张的人
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        }).forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
        System.out.println("---------------------");

        //skip跳过前几个元素 limit获取前几个元素
        list.stream().skip(2).filter(s -> s.startsWith("张")).forEach(System.out::println);//张无忌 张三
        System.out.println("---------------------");
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);//张三
        System.out.println("---------------------");
        list.stream().limit(2).forEach(System.out::println);//张三丰、周芷若
        System.out.println("-------------------");

        //map 加工数据
//        list.stream().filter(s -> s.startsWith("张")).map(new Function<String, Object>() {
//            @Override
//            public Object apply(String s) {
//                return "努力的" + s;
//            }
//        }).forEach(System.out::println);
        list.stream().filter(s -> s.startsWith("张")).map(s -> "努力的" + s).forEach(System.out::println);
        System.out.println("----------------");

        //concat合并！两个流  如果两个流泛型的类型不一样，那么新的流用Object接
        Stream<String> stream1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> stream2 = Stream.of("西西", "狗蛋儿", "修勾");
        Stream<String> stream3 = Stream.concat(stream1, stream2);
//        流只能使用一次，被关闭了无法在执行
//        stream3.forEach(System.out::println);
        try {
           //将Stream流转换成集合
            List<String> list3 = stream3.toList();//不可变集合
            //List<String> list3 = stream3.collect(Collectors.toList());
            //Object[] arr = stream3.toArray();  //转换为数组
            System.out.println(list3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
