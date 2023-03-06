package data.struct.algorithm;

/**
 * 分治思想：将一个规模较大的问题分成若干个相同类型易于解决的子问题，最后在整理子问题的解，分而治之
 * 求汉诺塔问题
 * 最简单的子问题就是只有一根柱子的时候，直接从起始柱到目标柱就好了
 * 其他数目的柱子我们只需将它分为三步
 * 1.将n-1根盘子从起始柱移动到中转柱
 * 2.将最底下的盘子移动到目标柱
 * 3.将n-1个盘子从中转柱移动到目标柱
 */
public class Hanoi {
    public static void main(String[] args) {
          hanoi(3,'A', 'B', 'C');

    }

    /**
     *
     * @param num 汉诺塔的个数
     * @param a   起始柱
     * @param b   中转柱
     * @param c   目标柱
     */
    public static void hanoi(int num, char a, char b, char c ){
        if(num == 1){
            System.out.println("将第1个盘子从：" + a + "——>" + c);
        }else{
            //将起始柱（a）n-1个盘子通过目标柱（c）移动动中转柱（b）
            hanoi(num-1, a, c, b);
            //把起始柱（a）最下边的盘子移动到目标柱（c）
            System.out.println( "将第" + num + "个盘子从：" + a + "——>" + c);
            //将中转柱（b）的盘子通过起始柱（a）全部移动到目标柱（c）
            hanoi(num-1, b, a, c);
        }
    }
}
