package data.struct.arraysort;

import java.util.Arrays;

public class SelectSort extends BubbleSort{
    /**
     * 综合分析selectsort1 和 selectsort2 为什么算法差距这么大，因为2基本上运用的可以说就是冒泡排序
     * 虽然思想是选择排序，因为它每一轮找到比自己小的数据都会进行交换数据，因为会交换很多轮数据，但是对于
     * 算法1，它只是记录下一轮中最小的数据和他的角标，一轮完成才进行一次数据的交换，最多也就进行外层循环
     * 的交换次数，而且当假象的最小值就是最小值的时候无需进行数据交换
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 4, 9, 7, 3};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        selectsort1(arr);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));
        //测试对八万个数据进行排序
//        int[] arr = new int[80000];
//        Random r = new Random();
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = r.nextInt(0, 80000);
//        }
//        System.out.println("排序前时间：");
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
//        selectsort1(arr);
//        System.out.println("排序后时间：");
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
    }
    //八万个数据2s
    public static int[] selectsort1(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = arr[i];//假象前面i个为最小值
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];  //一轮走下来找到的是最小值和它的下标
                    minIndex = j;
                }
            }
            //当假设的最小值就是我自己无需进行交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];  //假象的最小值和真正的最小值交换位置
                arr[i] = min;
            }
        }
        return arr;
    }
    //八万个数据10s可能这个方法就是冒泡，虽有有点选择排序的思想
    public static int[] selectsort2(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1 + i; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
