package data.struct.linearlist;

/**
 * 目标：模拟完成循环队列，完善进队出队获取队列长度
 * 队列留一个空位置，尾指针指向下一个元素
 */
public class QueueCircle {
    public static void main(String[] args) {
        Que queue = new Que(5);
        queue.queueInt(2);
        queue.queueInt(5);
        queue.queueInt(7);
        queue.queueInt(9);
        queue.queueOut();
        queue.queueInt(12);
        queue.queueOut();
        queue.queueInt(15);
        queue.showHead();
        queue.show();
        System.out.println("队列长度为：" + queue.Getlength());
    }

}

class Que {
    private int front;//头指针
    private int rear;//尾指针
    private int MAXSIZE;//队列的最大长度
    private int[] arr;

    public Que(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
        arr = new int[MAXSIZE];
        front = 0;
        rear = 0;
    }

    //队列空
    public boolean IsNull() {
        if (front == rear) {
            return true;
        }
        return false;
    }

    //队列满留了一个空位置
    public boolean IsFull() {
        if ((rear + 1) % MAXSIZE == front) {
            return true;
        }
        return false;
    }

    //获取队列长度
    public int Getlength() {
        return (rear - front + MAXSIZE) % MAXSIZE;
    }

    //添加元素
    public void queueInt(int ele) {
        if (IsFull()) {
            System.out.println("对不起队列已经满了！");
            return;
        }
        //判断当尾指针在最后一个位置
        if (rear == MAXSIZE - 1) {
            if (front == 0) {
                System.out.println("对不起队列已满！");
                return;
            } else {
                arr[rear] = ele;
                rear = 0;
            }
            return;
        }
        //都不是特殊的情况直接添加
        arr[rear] = ele;
        rear++;
    }

    public void queueOut() {
        if (IsNull()) {
            System.out.println("对不起队列为空！");
            return;
        }
        //对末尾位置特殊处理
        if (front == MAXSIZE - 1) {
            front = 0;
            return;
        }
        front++;
    }

    //展示队列
    public void show() {
        if (IsNull()) {
            System.out.println("对不起队列为空！");
            return;
        }
        //当尾指针大于头指针
        if (rear > front) {
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }
        //当尾指针小于头指针
        for (int i = front; i <= MAXSIZE - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public void showHead() {
        if (IsNull()) {
            System.out.println("对不起队列为空！");
            return;
        }
        System.out.println(arr[front]);
    }
}
