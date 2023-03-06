package data.struct.linearlist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 模拟顺序表完成数据查找、插入、删除、顺序表合并的功能
 */
public class SquenceList {
    public static void main(String[] args) {
        //char a = '你';
        Squence list1 = new Squence(5);//创建顺序表
        Squence list2 = new Squence(5);//创建顺序表
        Squence list3 = new Squence(10);//创建顺序表
        Scanner sc = new Scanner(System.in);
        String order ;
        while (true) {
            Squence list = null;
            while (true) {
                System.out.println("请输入你要操作的顺序表(1：list1, 2：list2)：");
                int order1 = sc.nextInt();
                if(order1 == 1){
                    list = list1;
                    break;
                }
                else if(order1 == 2){
                    list = list2;
                    break;
                }
                else{
                    System.out.println("输入有误请重新输入！");
                }
            }
            System.out.println("请输入操作：");
            System.out.println("i (insert)：在该顺序表指定位置插入元素");
            System.out.println("f (found)：在该顺序表根据内容查找元素");
            System.out.println("d (delete)： 在该顺序表指定位置删除元素并返回");
            System.out.println("s (show)：展示当前顺序表元素");
            System.out.println("m (merge)：合并两个顺序表");
            System.out.println("e (exit)：退出程序");
            order = sc.next();
            switch (order) {
                case "i":
                    System.out.println("请在该顺序表输入你要插入的位置和元素：");
                    int i = sc.nextInt();
                    int e = sc.nextInt();
                    list.insert(list, i, e);
                    break;
                case "f":
                    System.out.println("请输入你要查找的内容：");
                    int data = sc.nextInt();
                    System.out.println("该元素在顺序表里的索引为：" + list.found(list,data));
                    break;
                case "d":
                    System.out.println("请输入你要删除元素的索引：");
                    int d = sc.nextInt();
                    System.out.println("删除的元素为：" + list.delete(list,d));
                    break;
                case "s":
                    System.out.println("当前顺序表元素为：");
                    list.show(list);
                    System.out.println();
                    break;
                case "m":
                    System.out.println("开始合并list1和list2到list3...");//合并有问题！
                    Squence.merge(list1, list2, list3);
                    System.out.println("合并后为：");
                    list3.show(list3);
                    break;
                case "e":
                    System.out.println("程序退出~");
                    return;
                default:
                    System.out.println("输入有误请重新输入！");
                    break;
            }
        }

    }
}

class Squence {
    private int MAXSIZE;//顺序表的最大长度

    private int Last; //指向顺序表的最后一个元素

    private int[] RankedList;

    private static final int ERROR = -1;

    public Squence(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
        Last = -1;
        RankedList = new int[MAXSIZE];
    }


    //插入数据,在i前插入e
    public void insert(Squence arr, int i, int e) {
        //判断插入位置是否合法
        if (i < 0 || i > arr.Last + 1) {
            System.out.println("插入位置不合法");
            return;
        }
        //判断顺序表是否为满
        if (arr.Last == MAXSIZE - 1) {
            System.out.println("顺序表已满无法插入!");
            return;
        }
        for (int k = arr.Last; k >= i; k--) {
            arr.RankedList[k + 1] = arr.RankedList[k];//i后面的全部后移一位
        }
        arr.RankedList[i] = e;//将元素插入
        arr.Last++;
    }

    //根据内容查找
    public int found(Squence arr, int e) {
        //从第一个开始查找
        int index = 0;
        while (index <= arr.Last && arr.RankedList[index] != e) {
            index++;
        }
        if (index <= arr.Last) {
            return index;
        } else {
            System.out.println("没有该元素");
            return ERROR;//没有该元素
        }
    }

    //删除元素并返回该元素
    public int delete(Squence arr, int i) {
        //判断删除的位置是否合法
        if (i < 0 || i > arr.Last) {
            System.out.println("删除位置不合法!");
            return ERROR;
        }

        //记录一下删除的数字
        int data = arr.RankedList[i];
        for (int k = i; k < Last; k++) {
            arr.RankedList[k] = arr.RankedList[k + 1];//后面的元素全部向前移动一位
        }
        arr.Last--;
        return data;

    }

    //合并两个顺序表
    public static int[] merge(Squence arr1, Squence arr2, Squence arr3) {
        if(arr3.RankedList.length < arr1.RankedList.length + arr2.RankedList.length){
            System.out.println("对不起顺序表空间不够，无法合并~");
            return arr3.RankedList;
        }
        Arrays.sort(arr1.RankedList);
        Arrays.sort(arr2.RankedList);
        int i = 0, j = 0, k = 0;
        //把两个顺序表里较小的元素倒入arr3，个数是短的一个顺序表的个数
        while (i <= arr1.Last && j <= arr2.Last) {
            if (arr1.RankedList[i] <= arr2.RankedList[j]) {
                arr3.RankedList[k] = arr1.RankedList[i];
                i++;
                k++;
            } else {
                arr3.RankedList[k] = arr2.RankedList[j];
                j++;
                k++;
            }
        }
        //把剩余没倒完的元素倒入
        //说明arr1还有剩余的元素，经过上一轮循环倒完的顺序表的指针已经是Last+1了
        while (i <= arr1.Last) {
            arr3.RankedList[k] = arr1.RankedList[i];
            i++;
            k++;
        }
        //不然就是arr2还有剩余的元素，同理
        while (j <= arr2.Last) {
            arr3.RankedList[k] = arr2.RankedList[j];
            j++;
            k++;
        }
        arr3.Last = arr1.Last + arr2.Last;
        return arr3.RankedList;

    }
        //展示当前数组内容
        public void show (Squence arr){
            if (arr.RankedList != null && arr.Last >= 0) {
                System.out.print("[");
                for (int i = 0; i <= arr.Last; i++) {
                    System.out.print(arr.RankedList[i] == arr.RankedList[arr.Last] ?
                            (arr.RankedList[arr.Last] + "]") : (arr.RankedList[i] + ", "));
                }
            } else {
                System.out.println("数组为空！");
            }
        }

    }

