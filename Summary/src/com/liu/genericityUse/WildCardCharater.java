package com.liu.genericityUse;

import java.util.ArrayList;

/**
 * ?通配符，使用泛型的时候使用
 * 泛型的上限：？extends Car 必须是Car或者其子类
 * 泛型的下限：？ super Car 必须是Car或者其父类
 */
public class WildCardCharater {
    public static void main(String[] args) {
        ArrayList<BWM> lists = new ArrayList<>();
        lists.add(new BWM());
        lists.add(new BWM());
        lists.add(new BWM());
        go(lists);

        ArrayList<BenChi> lists2 = new ArrayList<>();
        lists2.add(new BenChi());
        lists2.add(new BenChi());
        lists2.add(new BenChi());
        go(lists2);

    }
    public static void go(ArrayList<? extends Car> cars){

    }
}
class Car{

}
class BWM extends Car{

}
class BenChi extends Car{

}
