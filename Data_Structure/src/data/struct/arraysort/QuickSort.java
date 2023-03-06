package data.struct.arraysort;

import java.util.Arrays;
import java.util.Random;

/**
 * 快速排序思想：从最左边选一个值作为基准，保存其值，然后设置指针指向两端，最右边的指针先开始向左扫描，当扫描到比基准
 * 小的数字，停止扫描，把值赋值给最左边的指针，然后左边的指针开始向右边扫描，当扫描到比基准大的数然后停止扫描，把值赋给右边的指针，
 * 然后右边的指针再开始扫描，依次在while中进行，直到左边的指针和右边的指针相等的时候，退出整个扫描，把最开始存的基准赋值给中间的
 * 这个位置就完成了一次快排，形成的就是基准的左边是小于等于基准的，右边都是大于等于基准的，然后对左右进行递归，所有的数便都有序了
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 20, 10, 2, 8};
        quickSort(arr, 0, 7);
        System.out.println(Arrays.toString(arr));
//        int[] arr = new int[10000000];
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(0, 9999999);
//        }
//        long startTime = System.currentTimeMillis();
//        quickSort(arr, 0, 9999999);
//        long endTime = System.currentTimeMillis() - startTime;
//        System.out.println("排序花费时间(毫秒)：");
//        System.out.println(endTime);
    }

    public static int getMid(int[] arr, int left, int right) {
        //选取最左边的值
        int pivot = arr[left];
        while (left < right) {
            while (left < right) {
                //右边的指针开始向左扫描
                if (arr[right] < pivot) {
                    break;
                }
                right--;
            }
            //该循环退出的时候找到的是小于基准的数字
            //将找到的数字赋值给最左边
            arr[left] = arr[right];
            //左指针向后移动一个位置，因为当前值是从右边找到的小于基准的值，所以不用再扫描肯定是小于基准的
            if (right > left) {
                left++;
            }
            //左边的指针开始向右边扫描
            while (left < right) {
                if (arr[left] > pivot) {
                    break;
                }
                left++;
            }
            //退出循环找到的是大于基准的数字
            //把该值赋值给右边的指针
            arr[right] = arr[left];
            //右边的指针向左移动一位同理
            if (left < right) {
                right--;
            }
        }
        //最外层循环退出的时候就是指针相等的时候，再把基准赋值过来就完成了一次快排
        arr[left] = pivot;
        //返回中间的数
        return left;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pos = getMid(arr, left, right);
            quickSort(arr, left, pos - 1);
            quickSort(arr, pos + 1, right);
        }
    }
}
