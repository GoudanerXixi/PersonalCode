package com.liu.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "西西");
        map.put(2, "狗蛋儿");
        map.put(3, "东东");
        map.put(4, "西西");
        System.out.println(map.get(1));
        String s = map.remove(4);
        System.out.println(s);
        System.out.println(map);
        //HashMap的遍历
        //Interator,通过keySet将map中所有的键返回到一个Set集合
        Set keySet = map.keySet();
        //2.用set集合得到Iterator对象
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }

        //通过entrySet遍历
        Set enteySet = map.entrySet();//将map里的元素按照键值对的形式存入set集合
        Iterator iterator1 = enteySet.iterator();
        while(iterator1.hasNext()){
            Map.Entry entry = (Map.Entry)(iterator1.next());
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("----------------------");
        //lambda
        map.forEach((key, value) -> System.out.println(key + "=" + value));

    }
}
