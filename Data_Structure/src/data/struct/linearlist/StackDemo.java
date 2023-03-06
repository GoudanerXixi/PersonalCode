package data.struct.linearlist;

/**
 *目标：用单链表模拟栈的实现
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack1 = new Stack(1);
        Stack stack2 = new Stack(2);
        Stack stack3 = new Stack(3);
        Stack stack4 = new Stack(4);
        Stack stack5 = new Stack(5);
        StackLinkedList s = new StackLinkedList();
        s.push(stack1);
        s.push(stack2);
        s.push(stack3);
        s.push(stack4);
        s.push(stack5);
        s.show();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.show();


    }
}
class Stack{
    //数据域
    public int value;
    //指针域
    public Stack next;

    public Stack(int value){
        this.value = value;
    }
}
class StackLinkedList{
    Stack head = new Stack(-1);

    //压栈
    public void push(Stack stack){
        Stack temp = head;
        while(true){
         if(temp.next == null){
             break;
         }
         temp = temp.next;
      }
        temp.next = stack;
    }
    //出栈
    public void pop(){
        if(head.next == null){
            System.out.println("栈已为空！");
            return;
        }
        Stack temp = head;
        while(true){
            if(temp.next.next == null){
                break;
            }
            temp = temp.next;

        }
        System.out.println(temp.next.value);
        temp.next = null;
    }
    //展示栈
    public void show(){
        if(head.next == null){
            System.out.println("栈为空！");
            return;
        }
        int[] arr = new int[getleng()];
        int i = 0;
        Stack temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
            arr[i] = temp.value;
            i++;
        }
        for(int j = getleng() - 1; j >= 0; j--){
            System.out.println(arr[j]);
        }
    }
    //获取栈的长度
    public int getleng(){
        if(head.next == null){
            return 0;
        }
        Stack temp = head;
        int length = 0;
        while(true){
            if(temp.next == null){
                break;
            }
            length++;
            temp = temp.next;
        }
        return length;
    }
}
