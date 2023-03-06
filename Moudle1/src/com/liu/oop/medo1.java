package com.liu.oop;

import java.util.ArrayList;

/**
 * 关于集合的遍历细节
 */
public class medo1 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(21);
        scores.add(54);
        scores.add(84);
        scores.add(64);
        scores.add(18);
        scores.add(90);
        //[21,54,84,64,18,90]
        //i=0  [54,84,64,18,90]   i=3[54,84,64,90]
//        for (int i = 0; i < scores.size(); i++) {
//             if(scores.get(i)<60)
//             {
//                 scores.remove(i);
//             }
//        }
//            System.out.println(scores);
//        System.out.println("--------------------------------------");
//        //因为集合的大小会随着元素的增减而收缩，从而会因为开始索引的位置
//        //1.每次操作完增减索引的值
//        for (int i = 0; i < scores.size(); i++) {
//            if(scores.get(i)<60)
//            {
//                scores.remove(i);
//                i--;
//            }
//        }
//        System.out.println(scores);
//        System.out.println("--------------------------------------");

        //2.从最后一个元素开始遍历
        //[21,54,84,64,18,90]
        //i=4  [21,54,84,64,90]   //i=1  [21,84,64,90]     //i=0  [84,64,90]
        for (int i = scores.size()-1; i >= 0; i--) {
            if(scores.get(i)<60)
            {
                scores.remove(i);

            }
        }
        System.out.println(scores);
        System.out.println("--------------------------------------");

    }

}
