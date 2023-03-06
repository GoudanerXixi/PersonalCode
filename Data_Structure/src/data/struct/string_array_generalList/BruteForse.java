package data.struct.string_array_generalList;

import java.util.Arrays;

/**
 * 暴力匹配字符串，匹配成功返回模式串在主串中第一次出现的位置
 */
public class BruteForse {
    public static void main(String[] args) {
        String a = "ahgdcgf";
        String b = "gdc";
//        String[] S = toArray(a);
//        String[] T = toArray(b);
//        System.out.println(Arrays.toString(S));
//        System.out.println(Arrays.toString(T));
        int index = BF(a, b);
        System.out.println(index);//

    }
    //暴力匹配
    public static int BF(String S, String T){
        String[] S1 = toArray(S);
        String[] T1 = toArray(T);
        int i = 1;
        int j = 1;
        while(i < S.length() + 1 && j < T.length() + 1){
            if(S1[i].equals(T1[j])){
                ++i;
                ++j;
            }else{
                i = i - j + 2;
                j = 1;
            }
        }
        if(j > T.length()){
            return i - j + 1;
        }else {
            return -1;
        }
    }
    //将字符串存存储到数组中
    public static String[] toArray(String name){
        if(name == null){
            return new String[0];
        }else{
            String[] arr = new String[name.length() + 1];
            arr[0] = String.valueOf(name.length());
            for(int i = 1; i < name.length() + 1; i++){
                arr[i] = String.valueOf(name.charAt(i-1));
            }
            return arr;
        }
    }
}
