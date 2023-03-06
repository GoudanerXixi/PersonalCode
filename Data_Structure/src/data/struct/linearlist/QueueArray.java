package data.struct.linearlist;

import java.util.Scanner;

/**
 * 用数组模拟队列（一次性队列）
 */
public class QueueArray {
    public static void main(String[] args) {
        boolean flag = true;
        queue queue = new queue(3);
        Scanner sc = new Scanner(System.in);
        String order = "";
        while (flag){
            System.out.println("请选择：");
            System.out.println("a：添加数据到队列");
            System.out.println("g:从队列取出数据");
            System.out.println("s:显示队列");
            System.out.println("h：查看队列头的数据");
            System.out.println("e：退出");
            order = sc.next();
            switch (order){
                case "a":
                    System.out.println("请输入数据：");
                    int data = sc.nextInt();
                    queue.add(data);
                    break;
                case "g":
                    try {
                        System.out.println("取出的数据是：" + queue.getdata());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                case "s":
                    queue.showQueue();
                    break;
                case "h":
                    try {
                        queue.heatShow();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case "e":
                    flag = false;
                    System.out.println("程序退出~");
                    break;
                default:
                    System.out.println("请输入正确的指令！");
                    break;
            }
        }

    }
}
class queue{
    private int front;//头指针  取出元素
    private int rear;//尾指针  插入元素
    private int MaxSize;//队列的最大容量
    private int[] arr;
    public queue(int MaxSize){
        this.MaxSize = MaxSize;
        arr = new int[MaxSize];
        front = -1;
        rear = -1;
    }
    //判断队列是否为空
    public boolean isNull(){
        return front == rear;
    }

    //判断队列是否为满
    public boolean isFull(){
        return rear == MaxSize - 1;
    }

    //添加数据
    public void add(int data){
        if(isFull()){
            System.out.println("队列已满，无法添加~");
            return;
        }
        rear++;
        arr[rear] = data;
    }
    //取出数据
    public int  getdata(){
        if(isNull()){
            throw new RuntimeException("队列为空无法取出~");
        }
        front++;
        return arr[front];

    }
    //显示队列的所有数据
    public void showQueue(){
        if(isNull()){
            System.out.println("队列为空没有数据~");
            return;
        }
        for (int i = front + 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //展示队列头部
    public void heatShow(){
        if(isNull()){
            throw new RuntimeException("队列为空，没有元素~");
        }
        System.out.println(arr[++front]);
    }


}
