package data.struct.tree;

/**
 * 顺序存储二叉树：
 * 1.只考虑完全二叉树
 * 2.第n个元素的左子节点为2n+1,右子节点为2n+2,父节点为（n-1）/2
 */
public class SequenceTree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrBinaryTree a = new ArrBinaryTree(arr);
        a.preOrder();//1245367
        System.out.println();
        a.infixOrder();//4251637
        System.out.println();
        a.postOrder();//4526731
    }
}

class ArrBinaryTree {
    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void preOrder() {
        this.preOrder(0);
    }

    public void infixOrder() {
        this.infixOrder(0);
    }

    public void postOrder() {
        this.postOrder(0);
    }

    //前序遍历二叉树
    public void preOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空无法遍历！");
            return;
        }
        System.out.print(arr[index] + " ");
        //向左递归
        if ((index * 2 + 1) < arr.length) {
            preOrder(index * 2 + 1);
        }
        //向右递归
        if ((index * 2 + 2) < arr.length) {
            preOrder(index * 2 + 2);
        }
    }

    //中序遍历二叉树
    public void infixOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空无法遍历！");
            return;
        }
        //向左递归
        if ((index * 2 + 1) < arr.length) {
            infixOrder(index * 2 + 1);
        }
        System.out.print(arr[index] + " ");
        //向右递归
        if ((index * 2 + 2) < arr.length) {
            infixOrder(index * 2 + 2);
        }
    }

    //前序遍历二叉树
    public void postOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("数组为空无法遍历！");
            return;
        }
        //向左递归
        if ((index * 2 + 1) < arr.length) {
            postOrder(index * 2 + 1);
        }
        //向右递归
        if ((index * 2 + 2) < arr.length) {
            postOrder(index * 2 + 2);
        }
        System.out.print(arr[index] + " ");
    }
}
