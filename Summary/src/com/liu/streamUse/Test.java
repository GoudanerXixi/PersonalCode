package com.liu.streamUse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test {
    public static double allMoney;
    public static void main(String[] args) {
        //开发一部的四个员工
        List<Exploit> list1 = new ArrayList<>();
        list1.add(new Exploit("小张","男", 6000.0, 1000.0, "迟到早退2次" ));
        list1.add(new Exploit("老王","男", 4000.0, 100.0, "上班谈恋爱" ));
        list1.add(new Exploit("红红","女", 2000.0, 500.0, "上班摸鱼" ));
        list1.add(new Exploit("猪小明","男", 1000.0, 0.0, "顶撞老板" ));

        //开发二部五个员工
        List<Exploit> list2 = new ArrayList<>();
        list2.add(new Exploit("妹爷","男", 5000.0, 0.0, "调戏老板秘书" ));
        list2.add(new Exploit("毛台","男", 4000.0, 100.0, "上班谈恋爱" ));
        list2.add(new Exploit("球球","女", 7000.0, 1000.0, null));
        list2.add(new Exploit("米线儿","女", 3500.0, 1000.0, "上班吃东西" ));
        list2.add(new Exploit("猪小明","男", 5500.0, 1000.0, "顶撞老板" ));

       //挑选出两个部门工资最高的
        Topperformer t1  = list1.stream().max(new Comparator<Exploit>() {
            @Override
            public int compare(Exploit o1, Exploit o2) {
                return Double.compare(o1.getMoney() + o1.getBonus(), o2.getMoney() + o2.getBonus());
            }
        }).map(s -> new Topperformer(s.getName(), s.getMoney() + s.getBonus())).get();
        System.out.println(t1);

        Topperformer t2 = list2.stream().max((o1, o2) -> Double.compare(o1.getMoney() + o1.getBonus(), o2.getMoney() + o2.getBonus())).
                map(s -> new Topperformer(s.getName(), (s.getMoney() + s.getBonus()))).get();
        System.out.println(t2);

        //计算两个部门工资的平均值，去掉最高和最低
        Stream stream1 = list1.stream().sorted(new Comparator<Exploit>() {
            @Override
            public int compare(Exploit o1, Exploit o2) {
                return  Double.compare(o1.getMoney() + o1.getBonus(), o2.getMoney() + o2.getBonus());
            }
        }).skip(1).limit(list1.size() - 2);

        Stream<Exploit> stream2 = list2.stream().sorted((o1, o2) -> Double.compare(o1.getMoney() + o1.getBonus(),
                o2.getMoney() + o2.getBonus())).skip(1).limit(list2.size() - 2);

        Stream<Exploit> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(new Consumer<Exploit>() {
            @Override
            public void accept(Exploit e) {
                allMoney += (e.getMoney() + e.getBonus());
            }
        });
        System.out.println("平均工资：" + allMoney/5);


    }
  }
