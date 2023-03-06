package leetcode.simple;

/**
 * 反转单链表
 */
public class ReverseList {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head){
        //新建一个头结点来存储反转的单链表
        ListNode newhead= new ListNode(0);
        ListNode cur = head;//扫描指针，从第一个开始
        ListNode temp = null;//用于存储当前结点的下一个结点
        while(cur != null){
            temp = cur.next;         //这个是往后指的next
            cur.next = newhead.next;//在新节点指向当前结点之前，让当前结点指向新节点的第一个结点，后面的总是指向前面的这样
                                    //就形成了链表，这个next是往前指
            newhead.next = cur;
            //指针后移
            cur = temp;

        }
        return newhead.next; 
    }

}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int x){
        val = x;
    }
}
