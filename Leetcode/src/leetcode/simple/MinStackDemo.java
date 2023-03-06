package leetcode.simple;

/**
 * 模拟栈，有pop push top（查看栈顶元素） min 输出最小元素
 * 难点：存下一个最小值后，当这个最小值的元素被弹出，无法更新最小的元素
 * 解决方案：让一个结点存储当前结点及后面结点的最小值，当最小的被弹出后
 * head.next.min仍然是当前栈里最小的元素
 *
 */
public class MinStackDemo {
    public static void main(String[] args) {

    }
}
class MinStack{
    public Node head;
    /** initialize your data structure here. */
    public MinStack() {
        head = new Node();
    }

    public void push(int x) {

        if(head.next == null){
            head.next = new Node(x);
            head.next.min = x;
            return;
        }
        Node temp = head.next;
        Node node = new Node(x);
        head.next = node;
        node.next = temp;
        if(x <= head.next.next.min){
            head.next.min = x;
        }else{
            head.next.min = head.next.next.min;
        }
    }

    public void pop() {
        if(head.next == null){
            return;
        }
        if(head.next.next == null){
            head.next = null;
            return;
        }
        head.next = head.next.next;

    }

    public int top() {
        return head.next.data;
    }

    public int min() {
        return head.next.min;
    }
}
class Node{
    public int data;
    public Node next;
    public int min;//用于存当前结点及后面结点的最小值
    public Node(int data){
        this.data = data;
    }
    public Node(){

    }
}