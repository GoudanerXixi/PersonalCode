package data.struct.algorithm;

/**
 * 非递归实现二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 10, 15, 26};
        int index = binarySearch(arr, 26);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                //往左边查找
                right = mid - 1;

            } else if (arr[mid] < target) {
                //往右边查找
                left = mid + 1;
            }
        }
        return -1;
    }
}
