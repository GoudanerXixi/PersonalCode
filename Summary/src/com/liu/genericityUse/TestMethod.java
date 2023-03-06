package com.liu.genericityUse;

public class TestMethod {
    /**
     * 目标：给一个任意类型的数组都能返回他的内容也就是实现Arrays.toString()的功能
     * 方法可以接收一切实际类型的参数，方法更具有通用性
     */
    public static void main(String[] args) {

        String[] arr1 = {"小红", "小美", "小兰"};
        Integer[] arr2 = {1,5,8,6};
        Double[] arr3 = null;
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }
    public static <T> void printArray(T[] t){
          if(t != null){
              StringBuilder s = new StringBuilder("[");
              for(int i = 0; i < t.length; i++){
                 s.append(t[i] == t[t.length-1] ? t[i] : t[i] + ", ");
              }
              s.append("]");
              String s1 = s.toString();
              System.out.println(s1);
          }else {
              System.out.println(t);
          }
    }
}


