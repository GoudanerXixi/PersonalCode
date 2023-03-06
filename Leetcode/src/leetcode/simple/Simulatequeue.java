package leetcode.simple;

import java.util.Stack;

/**
 * 用两个栈模拟队列
 * 思路没清楚就开始写代码，虽说最后还是摸索出来了，但是效率低
 * 应该先想清楚有几种情况，而且代码比较冗余，没有别人的精炼，但是稍微便于理解
 * 我的栈写的是两个静态的变量，别人是先声明然后在构造器里实例化
 */
public class Simulatequeue {
    public static void main(String[] args) {
        CQueue c = new CQueue();
        int a1 = c.deleteHead1();//-1
        c.appendTail(5);
        c.appendTail(2);
        int a2 = c.deleteHead1();//5
        int a3 = c.deleteHead1();//2
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2 ;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void appendTail(int value) {
        //创建栈负责加入元素
        stack1.push(value);

    }

    public int deleteHead1() {
        //stack2不为空则弹栈
        while(!stack2.empty()){
            return stack2.pop();
        }
        //stack2为空而且stack1也为空
        if(stack1.empty()){
            return -1;
        }
        //stack2为空，stack1不为空
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    //对比别人和自己的代码我的代码很冗余，没有别人的精炼
    public int deleteHead2() {
//        //先接受压栈再弹栈
//        while(!stack1.empty()){
//            stack2.push(stack1.pop());
//        }
        //上面的代码多余了，表示每次删除都会去stack1里面装元素，而不是先将原理装好的
        //弹栈完再装，这样的操作会打乱顺序
        if(!stack2.empty()){
            int delvalue = stack2.pop();
            return delvalue;
        }else{
            if(stack1.empty()){
                return -1;
            }else{
                while(!stack1.empty()){
                    stack2.push(stack1.pop());
                }
                int delvalue = stack2.pop();
                return delvalue;
            }
        }

    }

}

