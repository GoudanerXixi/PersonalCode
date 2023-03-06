package data.struct.find;


import java.util.LinkedList;


/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        int value = 2;
        System.out.println(binarysearch2(arr, 0, 6, value));

    }
    public static int binarysearch(int[] arr, int left, int right, int value){
        //表示没有找到
        if(left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        int midvalue = arr[mid];
        if(midvalue > value){  //中间值大于要查找的值，向左边查找
           return binarysearch(arr, left, mid - 1, value);
        }else if(midvalue < value){
           return binarysearch(arr, mid + 1, right, value);
        }else {
            return mid;
        }
    }
    //查找该值的所有索引
    public static LinkedList<Integer> binarysearch2(int[] arr, int left, int right, int value){
        //表示没有找到
        if(left > right){
            return new LinkedList<>();
        }
        int mid = (left + right) / 2;
        int midvalue = arr[mid];
        if(midvalue > value){  //中间值大于要查找的值，向左边查找
            return binarysearch2(arr, left, mid - 1, value);
        }else if(midvalue < value){
            return binarysearch2(arr, mid + 1, right, value);
        }else {
            LinkedList<Integer> list = new LinkedList<>();
            //先往左边找
            int temp1 = mid-1;
            while(temp1 > 0 && arr[temp1] == value){
                list.add(temp1);
                temp1--;
            }
            //再把最之前的中间值也加入
            list.add(mid);

            int temp2 = mid + 1;
            while(temp2 < arr.length - 1 && arr[temp2] == value){
                list.add(temp2);
                temp2++;
            }
            list.sort((o1, o2) -> o1 - o2);
            return list;
        }
    }

}
