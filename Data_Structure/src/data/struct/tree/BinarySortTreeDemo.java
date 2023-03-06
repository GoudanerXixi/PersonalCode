package data.struct.tree;

/**
 * 完成二叉排序树的创建
 */
public class BinarySortTreeDemo {
    public static void main(String[] args) {
        BinarySortTree b = new BinarySortTree();
        b.add(new Node2(1));
        b.add(new Node2(2));
        b.add(new Node2(3));
        b.add(new Node2(4));
        b.add(new Node2(5));
        b.add(new Node2(6));
        b.infixOrder();

    }

}
class BinarySortTree{
    private Node2 root;
    //添加结点
    public void add(Node2 node){
        Node2 temp = root;//指向root的指针
        if(root == null){
            root = node;
        }else{
               root.add(node);
        }


    }
    //中序遍历
    public void infixOrder(){
        if(root != null){
            root.infixOrder();
        }else{
            System.out.println("树为空无法遍历！");
        }
    }
}
class Node2{
    private int data;
    private Node2 left;
    private Node2 right;
    public Node2(int data){
        this.data = data;
    }
    //添加结点
    public void add(Node2 node){
        if(node == null){
            return;
        }
        //判断结点传入的值与当前子树的根节点的关系
        if(node.getData() < this.getData()){
            if(this.left == null){
                this.left = node;
            }else{
                this.left.add(node);
            }
        }else{
            if(this.right == null){
                this.right = node;
            }else{
                this.right.add(node);
            }
        }
    }
    //中序遍历
    public void infixOrder(){
        if(this.left != null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right != null){
            this.right.infixOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node2 getLeft() {
        return left;
    }

    public void setLeft(Node2 left) {
        this.left = left;
    }

    public Node2 getRight() {
        return right;
    }

    public void setRight(Node2 right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node2[ data = " + data + " ]";

    }
}
