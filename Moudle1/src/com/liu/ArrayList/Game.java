package com.liu.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 对象 集合 重写比较器 静态代码块 静态成员变量
 */

public class Game {
    //1.定义一个静态集合存储每一个牌对象
    public static List<Card> allCard = new ArrayList<>();

    //2.定义一个静态代码块，初始化牌的数据
    static {
        //2.1定义点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //2.2定义花色
        String[] colors = {"♠", "♥", "♣", "♦"};
        //2.3给每一张牌加个索引，以便后期对玩家的牌进行排序
        int index = 0;
        //2.4组合花色和点色封装给对象装到集合里
        for (String size : sizes) {
            for (String color : colors) {
                Card c = new Card(size, color, index);
                allCard.add(c);
                index++;
            }

        }
        //2.5将大小王存入集合
        Card c1 = new Card("", "🃏", ++index);
        Card c2 = new Card("", "🐒", ++index);
        Collections.addAll(allCard, c1, c2);
        System.out.println("新牌：" + allCard);
    }

    public static void main(String[] args) {
        //3.洗牌
        Collections.shuffle(allCard);
        System.out.println(("洗牌：" + allCard));

        //4.定义三个集合来装每一个人的牌
        List<Card> xixi = new ArrayList<>();
        List<Card> goudaner = new ArrayList<>();
        List<Card> aiqing = new ArrayList<>();

        //5.发牌
        for (int i = 0; i < allCard.size() - 3; i++) {
            Card c = allCard.get(i);
            if (i % 3 == 0) {
                xixi.add(c);
            } else if (i % 3 == 1) {
                goudaner.add(c);
            } else if (i % 3 == 2) {
                aiqing.add(c);
            }

        }

        //6.再定义一个集合存储剩下的三张牌，集合之间操作方便
        List<Card> lsatThreeCard = allCard.subList(allCard.size() - 3, allCard.size());

        sort(xixi);
        sort(goudaner);
        sort(aiqing);
        sort(lsatThreeCard);

        System.out.println("西西:" + xixi);
        System.out.println("狗蛋儿" + goudaner);
        System.out.println("爱情" + aiqing);
        System.out.println("底牌：" + lsatThreeCard);

    }

    //7.对玩家手里的牌进行排序
    public static List<Card> sort(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o1.getIndex() - o2.getIndex());

        return cards;
    }


}
class Card{

        private String size;
        private String color;
        private int index;

        public Card() {
        }

        public String getSize() {
            return size;
        }

        public Card(String size, String color, int index) {
            this.size = size;
            this.color = color;
            this.index = index;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }



        @Override
        public String toString() {
            return size+color;
        }
    }




