package data.struct.arraysort;

import java.util.Random;

/**
 * 选择排序：
 * 思想：在无序的数组里从第一个开始看成一个有序表，从第二个位置开始找插入的位置，
 * 往前找最后一次大于自己的数否则自己比要插入的索引的前一个就大，那么不用动
 */
public class InsertSort extends SelectSort{
    public static void main(String[] args) {
//        int[] arr = {2,8,4,6,7,5,52,1,35,84,64,7,25};
//        insertSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = new int[80000];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(0, 500000);
        }
        long startTime = System.currentTimeMillis();
        insertSort(arr);
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("排序花费时间(毫秒)：");
        System.out.println(endTime);

    }
    public static int[] insertSort(int[] arr){
        //从第一个位置开始往前找插入的位置
        for(int i = 1; i < arr.length; i++){
            int insertVal = arr[i];
            int insertIndex = i - 1;
            //退出循环要插入的位置就是insertIndex后面的一个位置
            while(insertIndex >= 0 && insertVal < arr[insertIndex] ){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = insertVal;
        }
        return arr;
    }
}

