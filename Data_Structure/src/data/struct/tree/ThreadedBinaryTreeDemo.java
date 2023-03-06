package data.struct.tree;

/**
 * 线索化二叉树：
 * n个结点有2n个指针域,n-1个指针域用于存储结点，有n+1个空指针域，将空指针域用于存储
 * 该结点的直接前驱（左指针）和直接后继（右指针），这样就叫做二叉树的线索化
 */
public class ThreadedBinaryTreeDemo {
    public static void main(String[] args) {
        Node root1 = new Node(1, "元歌");
        Node node2 = new Node(2, "西施");
        Node node3 = new Node(3, "孙尚香");
        Node node4 = new Node(4, "刘备");
        Node node5 = new Node(5, "貂蝉");
        Node node6 = new Node(6, "吕布");
        root1.leftChild = node2;
        root1.rightChild = node3;
        node2.leftChild = node4;
        node2.rightChild = node5;
        node3.leftChild = node6;
        ThreadedBinaryTree t = new ThreadedBinaryTree();
        t.root = root1;
        t.threadedNodes();
        System.out.println("结点5的左孩子：" + node5.leftChild);//2
        System.out.println("结点5的右孩子：" + node5.rightChild);//1
        System.out.println("结点4的右孩子：" + node4.rightChild);//2
        System.out.println("结点6的右孩子：" + node6.rightChild);//3

    }


}

//按照中序遍历线索化二叉树
class ThreadedBinaryTree {
    //总是保留前一个结点
    public Node pre = null;

    public Node root;

    public void threadedNodes() {
        this.threadedNodes(root);
    }

    //编写成员方法线索化二叉树
    //node就是当前需要线索化的结点
    public void threadedNodes(Node node) {
        if (node == null) {
            return;
        }
        //1.线索左子树
        threadedNodes(node.leftChild);
        //2.线索化当前结点
        //2.1处理当前结点的前驱节点
        if (node.leftChild == null) {
            //左指针指向前一个结点
            node.leftChild = pre;
            //修改标志为指向前驱节点
            node.lchildType = 1;
        }
        //2.2处理当前结点的后继节点
        if (pre!=null && node.rightChild == null) {
            //让前驱结点的右指针指向当前结点
            pre.rightChild = node;
            //修改前驱结点的右指针类型
            pre.rchildType = 1;
        }
        //每处理一个节点后，让当前结点是下一个结点的前驱结点
        pre = node;
        //3.线索化右子树
        threadedNodes(node.rightChild);
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}

class Node {
    public int no;
    public String name;
    public Node leftChild;   //左孩子
    public Node rightChild;  //右孩子
    //默认为0表示当前结点左指针指向左孩子，1表示指向直接前驱
    public int lchildType;
    //默认为0表示当前结点右指针指向右孩子，1表示指向直接后继
    public int rchildType;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;

    }

    //二叉树的前序遍历
    public void preOder() {
        System.out.println(this);
        if (this.leftChild != null) {
            this.leftChild.preOder();
        }
        if (this.rightChild != null) {
            this.rightChild.preOder();
        }
    }

    //二叉树的中序遍历
    public void infixOder() {
        if (this.leftChild != null) {
            this.leftChild.infixOder();
        }
        System.out.println(this);
        if (this.rightChild != null) {
            this.rightChild.infixOder();
        }

    }

    //二叉树的后序遍历
    public void postOder() {
        if (this.leftChild != null) {
            this.leftChild.postOder();
        }
        if (this.rightChild != null) {
            this.rightChild.postOder();
        }
        System.out.println(this);

    }


    @Override
    public String toString() {
        return "HeroNode[" + "编号：" + no + "姓名：" + name + "]";
    }
}

