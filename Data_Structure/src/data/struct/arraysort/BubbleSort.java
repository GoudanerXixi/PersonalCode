package data.struct.arraysort;

import java.text.SimpleDateFormat;
import java.util.Random;


public class BubbleSort {
    //测试出冒泡排序对八万个数据进行排序大概是9~10秒
    public static void main(String[] args) {
//        int[] arr = {1, 5, 9, 4, 9, 7, 3};
//        System.out.println("排序前：");
//        System.out.println(Arrays.toString(arr));
//        bubblesort(arr);
//        System.out.println("排序后：");
//        System.out.println(Arrays.toString(arr));
        //测试对八万个数据进行排序
        int[] arr = new int[80000];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(0, 80000);
        }
        System.out.println("排序前时间：");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
        bubblesort(arr);
        System.out.println("排序后时间：");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
    }
public static int[] bubblesort(int[] arr){
    boolean flag = true;
    for(int i = 0; i < arr.length-1; i++){
        for(int j = 0; j < arr.length - 1 -i; j++){
            if(arr[j] > arr[j + 1]){
                flag = false;
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        //如果falg为真说明已经这一轮没有进行元素的交换，说明已经排序完成
        if(flag){
            break;
        }

    }
    return arr;
}
}
