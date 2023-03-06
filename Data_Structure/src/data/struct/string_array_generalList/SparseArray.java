package data.struct.string_array_generalList;

import java.io.*;

/**
 * 完成二维数组与稀疏数组之间的转换
 * row  col  val
 * 0 0 0 1 0           3    5    2  (原始数组有三行五列，两个有效数字)
 * 0 0 2 0 0    ——>    0    3    1  (有效数字 1 在元素组的索引是[0][3])
 * 0 0 0 0 0           1    2    2
 */

public class SparseArray {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[8][8];
        arr[2][3] = 1;
        arr[2][5] = 2;
        arr[3][5] = 1;
        arr[4][6] = 2;
        Print(arr);
        System.out.println("----------------");
        //Print( sparseArray(arr));
        int[][] arr1 = sparseArray(arr);
        Print(restoreArray(arr1));


    }

    //将数组转化为稀疏数组
    public static int[][] sparseArray(int[][] arr) throws IOException {
        //1.根据原始数组的有效数据的个数创建稀疏数组
        int sum = 0;//记录有效数据的个数
        for (int[] row : arr) {
            for (int data : row) {
                if (data != 0) {
                    sum++;

                }
            }
        }
        int[][] sparse = new int[sum + 1][3];//创建稀疏数组
        //2.再次遍历原数组的到有效数组的索引和值存入稀疏数组,先要给稀疏数组的头字段赋值
        sparse[0][0] = arr.length;
        sparse[0][1] = arr[0].length;
        sparse[0][2] = sum;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    sparse[count += 1][0] = i;  //sparse[count++][0] 有什么区别？
                    sparse[count][1] = j;
                    sparse[count][2] = arr[i][j];
                }

            }
        }
        //将数组写入文件
        PrintStream p = new PrintStream(new FileOutputStream("Data_Structure/src/arraydata.txt", true));
        for(int i = 0; i < sparse.length; i++){
            for(int j = 0; j < 3; j++){
                p.print(sparse[i][j] + " ");
            }
            p.println();
        }
        p.println("------------------------");
        return sparse;

    }

    //根据稀疏数组还原数组
    public static int[][] restoreArray(int[][] sparse) {
        //1.根据稀疏数组的第一行字段创建原数组
        int[][] arr = new int[sparse[0][0]][sparse[0][1]];
        //
        for (int i = 1; i < sparse.length; i++) {

            arr[sparse[i][0]][sparse[i][1]] = sparse[i][2];

        }
        return arr;
    }

    public static void Print(int[][] arr) {
        for (int arrs[] : arr) {
            for (int data : arrs) {
                System.out.print(data + " ");
            }
            System.out.println();
        }

    }

}

