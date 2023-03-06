package com;

import java.util.HashMap;
import java.util.Random;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        String[] s = {"A", "B", "C", "D"};
        StringBuilder s1 = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            s1.append(s[r.nextInt(s.length)]);

        }
        System.out.println(s1);
        Map<Character, Integer> infos = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (infos.containsKey(ch)) {
                infos.put(ch, infos.get(ch) + 1);
            } else {
                infos.put(ch, 1);
            }
        }
        System.out.println(infos);


    }
}
