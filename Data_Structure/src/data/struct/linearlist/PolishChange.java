package data.struct.linearlist;

import java.util.Stack;

/**
 * 目标完成中缀表达式到逆波兰的转换
 * 思路：将符号进栈，当遇到优先级比栈的优先级低的时候出栈，优先级高进栈，‘（ ’进栈  遇到  ‘）’ 出栈
 * 数字遇到直接输出用字符串拼接
 * 防止拼接空指针问题
 * 栈空时符号直接进栈
 * 对括号的特殊处理，括号不参加拼接，当反括号出现把正括号前的元素全部弹出拼接并且弹出正括号
 * 注意continue 和 break
 * 注意当优先级小时弹出来后栈可能为空
 * 注意最后的栈里会留一些符号要最后弹出
 */
public class PolishChange extends ReversePolish{
    public static void main(String[] args) {
        String polish = "1 + ( ( 2 + 3 ) * 4 ) - 5";
        String polish2 = change(polish);
        System.out.println(polish2);
        System.out.println("计算结果为：" + cacl(polish2));
    }

    public static String change(String polish) {
        Stack<String> stack = new Stack<>();
        String[] strs = polish.split(" ");
        StringBuilder builder = new StringBuilder();//用于拼接字符串
        for (String str : strs) {
            //如果为数字
            if (str.matches("\\d+")) {
                builder = builder.append(str + " ");
            } else {
                //空栈和左括号进行特殊处理
                if(stack.empty() || str.equals("(")){
                    stack.push(str);
                }
                //对 ) 进行特殊处理
                if (str.equals(")")) {
                    //没弹到（之前一直出栈
                    while (!stack.peek().equals("(")) {
                        builder = builder.append(stack.pop() + " ");
                    }
                    //最后再把（弹出栈
                    stack.pop();
                    continue;
                }
                //优先级高直接进栈
                if (priority(str) >= priority(stack.peek())) {
                    stack.push(str);
                } else {
                    //优先级低的出栈并拼接
                    while (!stack.empty() && priority(str) < priority(stack.peek())) {
                        builder = builder.append(stack.pop() + " ");
                    }
                    //当优先级都比str高的都出栈了就把str入栈
                    stack.push(str);
                    }
                }
            }
       //把栈里的最后个数出来
        while(!stack.empty()){
            builder = builder.append(stack.pop() + " ");
        }
        String polishs = builder.toString();
        return polishs;
    }

    //设置符号的优先级
    public static int priority(String symbol) {
        if (symbol.equals("+"))
            return 1;
        if (symbol.equals("-"))
            return 1;
        if (symbol.equals("*"))
            return 2;
        if (symbol.equals("/"))
            return 2;
        return -1;
    }
}

