package data.struct.linearlist;

/**
 * 目标：完成双向链表的创建，并完成增删改查功能
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        HerosNode herosNode1= new HerosNode(1, "宋江");
        HerosNode herosNode2= new HerosNode(2, "林冲");
        HerosNode herosNode3= new HerosNode(3, "鲁智深");
        HerosNode herosNode4= new HerosNode(4, "武松");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(herosNode1);
        doubleLinkedList.add(herosNode2);
        doubleLinkedList.add(herosNode3);
        doubleLinkedList.add(herosNode4);
        doubleLinkedList.show();
        doubleLinkedList.delete(4);
        System.out.println("删除后的双向链表为：");
        doubleLinkedList.show();
    }
}

class DoubleLinkedList{
    private HerosNode head = new HerosNode(0, "");

//    public HerosNode getHead() {
//        return head;
//    }
    //双向链表的添加
    public void add(HerosNode Node){
        HerosNode temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = Node;
        Node.pre = temp;
    }
    //根据编号完成双向链表的删除
    public void delete(int idcard){
        if(head.next == null){
            System.out.println("链表为空！");
            return;
        }
        if(idcard < 0 || idcard > getLength() ){
            System.out.println("请输入正确的编号！");
            return;
        }
        HerosNode temp = head.next;
        boolean flag = true;
        while(true){
            if(temp == null){
               flag = false;
                break;
            }
            if(temp.idcard == idcard){
                break;
            }
            temp = temp.next;
        }
        if(flag){
           //当删除的最后一个结点时候特殊处理，避免空指针异常！
            if(temp.next == null){
                temp.pre.next = null;
            }else {
                temp.pre.next = temp.next;
                temp.next.pre = temp.pre;
            }
        }else{
            System.out.println("没有找到删除的结点！");
        }
    }
    //获取双向链表的长度
    public int getLength(){
        if(head.next == null){
            return 0;
        }
        HerosNode temp = head.next;
        int count = 0;
        while(true){
            if(temp == null){
                break;
            }
            temp = temp.next;
            count++;
        }
        return count;
    }
    //展示双向链表
    public void show(){
        if(head.next == null){
            System.out.println("链表为空！");
        }
        HerosNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
class HerosNode {
    public int idcard;
    public String name;

    public HerosNode next;
    public HerosNode pre;

    public HerosNode(int idcard, String name) {
        this.idcard = idcard;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HerosNode{" +
                "idcard=" + idcard +
                ", name='" + name + '\'' +
                '}';
    }
}
