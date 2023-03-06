package data.struct.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 创建一个链式存储的哈夫曼树
 * 1.构造森林全是根
 * 2.选用两小造新树
 * 3.删除两小添新人
 * 4.重复2，3剩单根
 */
public class HuffmanDemo {
    public static void main(String[] args) {
           int[] arr = {13,7,8,3,29,6,1};
           preOder(CreateHuffman(arr));
    }

    public static void preOder(HuNode root) {
        if (root == null) {
            System.out.println("哈夫曼树为空无法遍历！");

        } else {
            root.preOder();
        }
    }

    //创建哈夫曼树
    public static HuNode CreateHuffman(int[] arr) {
        List<HuNode> lists = new ArrayList<>();

            //将数组里的权值创建成一个个结点并且添加到一个集合中去
            for (int value : arr) {
                lists.add(new HuNode(value));
            }
        //剩余最后一个节点的时候哈夫曼树就创建完成了
        while (lists.size() > 1) {
            //对集合里的元素进行排序
            Collections.sort(lists);
            System.out.println("Node=" + lists);
            //取出两个最小的元素
            HuNode leftvalue = lists.get(0);
            HuNode rightvalue = lists.get(1);

            //创建一个新的结点合并这两个小的结点并加入集合
            HuNode parent = new HuNode(leftvalue.getValue() + rightvalue.getValue());
            parent.setLeft(leftvalue);
            parent.setRight(rightvalue);
            lists.add(parent);
            //删除两个小的结点
            lists.remove(leftvalue);
            lists.remove(rightvalue);
//            //再次对集合进行排序
//            Collections.sort(lists);
        }
        return lists.get(0);

    }
}

class HuNode implements Comparable<HuNode> {
    //权值
    private int value;
    private HuNode left;
    private HuNode right;

    //前序遍历
    public void preOder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOder();
        }
        if (this.right != null) {
            this.right.preOder();
        }
    }

    public HuNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public HuNode getLeft() {
        return left;
    }

    public void setLeft(HuNode left) {
        this.left = left;
    }

    public HuNode getRight() {
        return right;
    }

    public void setRight(HuNode right) {
        this.right = right;
    }

    @Override
    public int compareTo(HuNode o) {
        return this.getValue() - o.getValue();
    }

    @Override
    public String toString() {
        return "HuNode[value = " + value + "]";
    }
}
