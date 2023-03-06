package data.struct.arraysort;

import java.util.Arrays;
import java.util.Random;

/**
 * 归并排序思想：分而治之，先把数组不断的分组，直到不能再分，再按照顺序一组一组的装到辅助数组里面
 * 一千万个数据大概1.2s
 */
public class MergeSort {  
    public static void main(String[] args) {
        int[] arr = {2,4,3,8,9,1,7};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, 6, temp);
        System.out.println(Arrays.toString(arr));
//        int[] arr = new int[10000000];
//        int[] temp = new int[arr.length];
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(0, 9999999);
//        }
//        long startTime = System.currentTimeMillis();
//        mergeSort(arr, 0, 9999999, temp);
//        long endTime = System.currentTimeMillis() - startTime;
//        System.out.println("排序花费时间(毫秒)：");
//        System.out.println(endTime);
    }
    public static void mergeSort(int[] arr, int left, int right, int[] temp){
        int mid = (left + right) / 2;
        if(left >= right){
            return;
        }
            System.out.println("mergeSort("+left+"," + mid+ ")");
            mergeSort(arr, left, mid, temp);
            System.out.println("mergeSort("+(mid+1)+"," + right+ ")");
            mergeSort(arr, mid + 1, right, temp);
            System.out.println("merge("+left+"," + mid+","+right+ ")");
            merge(arr, left, mid, right, temp);

    }
    public static void merge(int[] arr, int left, int mid, int right, int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;//用于扫描辅助数组

        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[t] = arr[i];
                t++;
                i++;
            }else{
                temp[t] = arr[j];
                t++;
                j++;
            }
        }
        //如果左边有剩余倒入临时数组
        while(i <= mid){
            temp[t] = arr[i];
            t++;
            i++;
        }
        //如果右边还有剩余的则倒入临时数组
        while(j <= right){
            temp[t] = arr[j];
            t++;
            j++;
        }
        //将temp的数组元素拷贝回arr，并不是每次都拷贝所有
        t = 0;
        int tempLeft = left;
        while(tempLeft <= right){
            arr[tempLeft] = temp[t];
            tempLeft++;
            t++;
        }
    }
}
