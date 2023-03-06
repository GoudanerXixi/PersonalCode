package com.liu.streamUse;

import java.util.*;
import java.util.stream.Stream;

/**
 * Strream:简化数组、集合操作的api
 * 如何创建集合数组的流对象
 * Stream的常用api
 * Stream的三类方法：1.获取Stream流：创建一条流水线，并把数据放在流水线上准本进行操作
 *                 2.中间方法：流水线上的操作一次操作完成后还可以继续进行其他操作
 *                 3.终结方法：一个Stream只能有一个终结方法，是流水线上的最后一个操作
 * 在Stream中无法直接修改集合数组中的元素！
 * Stream只是操作集合和数组的手段最终的结果还是要返回集合或数组
 */
public class Stream_Demo1 {
    public static void main(String[] args) {
        //1.创建collection集合的Stream流
        Collection<String> list = new ArrayList<>();
        Stream<String> liststream = list.stream();

        //2.创建Map的Stream对象
        //2.1 键流
        Map<String,Integer> map = new HashMap<>();
        Stream<String> keystream = map.keySet().stream();

        //2.2 值流
        Stream<Integer> valuestream = map.values().stream();

        //2.3 键值对流
        Stream<Map.Entry<String, Integer>> maps = map.entrySet().stream();

        //3.数组创建流
        String[] names = {"Lisa", "Rose", "Jennie"};
        Stream namestream = Arrays.stream(names);

        Stream namestream2 = Stream.of(names);

    }
}
