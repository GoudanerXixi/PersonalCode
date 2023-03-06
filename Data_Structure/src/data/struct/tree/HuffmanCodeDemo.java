package data.struct.tree;

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 *  根据一个字符串，创建一个哈夫曼树
 *  1.编写结点类
 *  2.根据字符串获取字节数组用hashmap统计每个元素出现的次数,遍历hashmap并创建结点存入list
 *  3.根据list创建哈夫曼树，权重为字符出现的次数
 */
public class HuffmanCodeDemo {
    public static void main(String[] args)  {
        String name = "i like like like java do you like a java";
        System.out.println(getList(name));
        HuffNode root = Huffman(getList(name));//获取哈夫曼树
        preOder(root);
        getcode(root, "", stringBuilder);
        System.out.println(codemap);
    }
    //用于存放哈夫曼编码
    private static Map<Byte, String> codemap = new HashMap<>();
    //用于拼接哈夫曼编码
    private static StringBuilder stringBuilder = new StringBuilder();
    //获取哈夫曼编码的方法

    /**
     *
     * @param node 传入结点
     * @param code 左边结点为0 右边为1
     * @param stringBuilder 拼接code
     * @return
     */
    public static void getcode(HuffNode node, String code, StringBuilder stringBuilder){
          StringBuilder stringBuilder2 = new StringBuilder(stringBuilder);
          stringBuilder2.append(code);
          if(node != null){
              if(node.getData() == null){
                  //向左递归
                  getcode(node.getLeft(), "0", stringBuilder2);
                  //向右递归
                  getcode(node.getRight(), "1", stringBuilder2);
              }else{
                  //data != null 说明到达了叶子结点将其加入到map
                  codemap.put(node.getData(), stringBuilder2.toString());
              }
          }
    }
    public static void preOder(HuffNode root){
        if(root != null){
            root.preOrder();
        }else{
            System.out.println("哈夫曼树为空无法遍历！");
        }
    }
    public static HuffNode Huffman(List<HuffNode> list){
        while (list.size() > 1) {
            //对集合进行排序
            Collections.sort(list);
            //取出两个权值最小的
            HuffNode leftvalue = list.get(0);
            HuffNode rightvalue = list.get(1);
            //创建新树
            HuffNode parent = new HuffNode(null, leftvalue.getWeight() + rightvalue.getWeight());
            parent.setLeft(leftvalue);
            parent.setRight(rightvalue);
            list.add(parent);
            //删除旧树
            list.remove(leftvalue);
            list.remove(rightvalue);
        }
        return list.get(0);
    }

    //将字符串转换为字节数组，将其存入hashmap，通过遍历hashmap对节点赋值并存入集合
    public static List<HuffNode> getList(String name)  {
        byte[] arr = name.getBytes(StandardCharsets.UTF_8);
        Map<Byte,Integer> map = new HashMap<>();
        for (byte key : arr) {
              Integer value = map.get(key);
               if(value == null){
                   map.put(key, 1);
               }else{
                   map.put(key, ++value);
               }
        }
        //将每一个键值对转为为一个Node对象，存到list集合里
       List<HuffNode> nodes = new ArrayList<>();
        for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
            nodes.add(new HuffNode(entry.getKey(), entry.getValue()));
        }
        return nodes;

    }
}

class HuffNode implements Comparable<HuffNode>{
    private Byte data;//存放数据本身
    private int weight;//存放权重表示数据出现的次数
    private HuffNode left;
    private HuffNode right;

    //先序遍历
    public void preOrder(){
        System.out.println(this);
        if(this.left != null){
            this.left.preOrder();
        }
        if(this.right != null){
            this.right.preOrder();
        }
    }
    public HuffNode(Byte data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    public Byte getData() {
        return data;
    }

    public void setData(Byte data) {
        this.data = data;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HuffNode getLeft() {
        return left;
    }

    public void setLeft(HuffNode left) {
        this.left = left;
    }

    public HuffNode getRight() {
        return right;
    }

    public void setRight(HuffNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HuffNode{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(HuffNode o) {
        return this.getWeight() - o.getWeight();
    }
}
