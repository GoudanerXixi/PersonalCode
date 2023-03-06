package data.struct.tree;

/**
 * 目标：完成二叉树的前中后序遍历
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        HeroNode root = new HeroNode(1, "宋江");
        HeroNode heroNode2 = new HeroNode(2, "吴用");
        HeroNode heroNode3 = new HeroNode(3, "卢俊义");
        HeroNode heroNode4 = new HeroNode(4, "林冲");
        root.leftChild = heroNode2;
        root.rightChild = heroNode3;
        heroNode3.rightChild = heroNode4;
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.SetRoot(root);
        //前序遍历
        binaryTree.preOder();//1 2 3 4
        System.out.println("--------------");
        //中序遍历
        binaryTree.infixOder();//2 1 3 4
        System.out.println("---------------");
        //后序遍历
        binaryTree.postOder();//2 4 3 1
    }
}

class HeroNode {
    public int no;
    public String name;
    public HeroNode leftChild;   //左孩子
    public HeroNode rightChild;  //右孩子

    public HeroNode(int no, String name) {
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

class BinaryTree {
    private HeroNode root;

    public HeroNode GetRoot() {
        return root;
    }

    public void SetRoot(HeroNode root) {
        this.root = root;
    }

    //前序遍历
    public void preOder() {
        if (this.root != null) {
            this.root.preOder();
        } else {
            System.out.println("二叉树为空无法遍历！");
        }
    }

    //中序遍历
    public void infixOder() {
        if (this.root != null) {
            this.root.infixOder();
        } else {
            System.out.println("二叉树为空无法遍历！");
        }
    }

    //后序遍历
    public void postOder() {
        if (this.root != null) {
            this.root.postOder();
        } else {
            System.out.println("二叉树为空无法遍历！");
        }
    }


}
