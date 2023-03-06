package data.struct.arraysort;

import java.util.Arrays;

/**
 * 希尔排序思想：不断的分组，使组距越来越小，比较元素大小进行交换，先让数组大致有序，然后再分组分到一个一组的时候完全有序
 */
public class ShellSort extends QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 20,3, 1, 8, 10, 5,17};
        shellSrot3(arr);
        System.out.println(Arrays.toString(arr));
//        int[] arr = new int[10000000];
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(0, 1000000);
//        }
//        long start = System.currentTimeMillis();
//        shellSort4(arr);
//        long end = System.currentTimeMillis();
//        System.out.println(arr.length + "个数据排序花费：" + (end - start) + "ms");
////        System.out.println(Arrays.toString(arr));
    }

    public static int[] shellSrot1(int[] arr) {
        int count = 0;
        int temp;
        int gap = arr.length;//分组的组距
        while (gap > 1) {
            gap = gap / 2;
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap)
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    } else {
                        break;
                    }
            }
//            System.out.println("第" + (++count) + "轮shell排序：");
//            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    //交换式
    public static int[] shellSrot2(int[] arr) {
        int temp;
        int count = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    } else {
                        break;
                    }
                }
            }
//            System.out.println("第" + (++count) + "轮shell排序：");
//            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static int[] shellSrot3(int[] arr) {
        int temp;
        int gap = 1;
        for (int i = gap; i < arr.length; i++) {
            for (int j = i - gap; j >= 0; j -= gap)
                if (arr[j] > arr[j + gap]) {
                    temp = arr[j];
                    arr[j] = arr[j + gap];
                    arr[j + gap] = temp;
                } else {
                    break;
                }
        }

        return arr;
    }

    //位移式
    public static int[] shellSort4(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[i];
                while (j - gap >= 0 && arr[j - gap] > arr[j]) {
                    arr[j] = arr[j - gap];
                    j -= gap;

                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}

