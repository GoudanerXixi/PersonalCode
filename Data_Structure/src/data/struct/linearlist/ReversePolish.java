package data.struct.linearlist;


import java.util.Stack;

/**
 * 目标：用栈完成逆波兰表达式 （3+4）*5-6   逆波兰：3 4+5*6-
 */
public class ReversePolish {
    public static void main(String[] args) {
         //(3+4) * 5 - 6   3 4 + 5 * 6 -          29
        String s = "30 4 + 5 * 6 -";
        System.out.println("计算结果为：" + cacl(s));
    }


    //按照逆波兰的规则进栈和出栈
    public static int cacl(String polish){
        String[] str = polish.split(" ");
        Stack<String> stack = new Stack<>();
        for (String s : str) {
            if(s.matches("\\d+")){
                stack.push(s);
            }else{
                int sum = 0;
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                if(s.equals("+")){
                    sum = a + b;
                }else if(s.equals("-")){
                    sum = b - a;
                }else if(s.equals("*")){
                    sum = a * b;
                }else if (s.equals("/")){
                    sum = b / a;
                }
                stack.push(String.valueOf(sum));
            }
        }
            return Integer.parseInt(stack.pop());
    }
}
