package data.struct.linearlist;

/**
 * 目标：用循环链表完成约瑟夫问题
 */
public class CircleLinkedListDemo{
    public static void main(String[] args) {
        CircleLinkedList circle = new CircleLinkedList();
        circle.add(20);
        circle.show(circle.first);
        circle.countBoy(5,3,20);
    }
}
class CircleLinkedList {
    //先创建一个first空指针用于指向第一个结点（类似于头结点的作用）
    public Boy first = null;

    //开始创建环形单链表
    //根据num表示创建多少个小孩
    public void add(int num) {
        if (num < 1) {
            return;
        }
        Boy temp = null;
        for (int i = 1; i <= num; i++) {
            Boy BoyNode = new Boy(i);
            if (i == 1) {
                first = BoyNode;
                BoyNode.setNext(BoyNode);//形成环形
                temp = first;
            } else {
                temp.setNext(BoyNode);
                //temp.getNext() = BoyNode 不能这样写  此时tmep.getNext() = null;
                BoyNode.setNext(first);
                temp = BoyNode;
               // temp = temp.getNext();
            }
        }
    }

    //展示环形链表
    public void show(Boy first) {
        if (first.getNext() == null) {
            System.out.println("链表为空！");
        }
        Boy temp = first;
        while (true) {
            System.out.println("小孩编号：" + temp.getNo());
            if (temp.getNext() == first) {
                break;
            }
            temp = temp.getNext();
        }
        //System.out.println("小孩编号：" + temp.getNo());
    }

    /**
     *
     * @param k 表示从第几个小孩开始数
     * @param m 表示数到第几个出队列
     * @param sum 表示一共多少个小孩
     */
    public void countBoy(int k, int m, int sum){
          //这里就不进行数字的校验了
        if(first == null){
            return;
        }
        //因为是环形所以需要设置两个指针一个指向头一个指向尾，两个同时移动，同样的距离
        //当两个指针相遇的时候就是只剩最后一个结点了
        Boy temp = first;
        //将temp移动到最后
        while(true){
            //这里不能写成temp.getNext == tmep;
            if(temp.getNext() == first){
                break;
            }
            temp = temp.getNext();
        }
        //首先到达k个结点
        for(int i = 1; i < k; i++){
            first = first.getNext();
            temp = temp.getNext();
        }
        while(true){
            //此时表示只有一个小孩
            if(first == temp){
                break;
            }
            for(int i = 0; i < m; i++){
                first = first.getNext();
                temp = temp.getNext();
            }
            //语句必须写在前面，因为后面两行代码会改变first和temp
            System.out.println("小孩" + first.getNo() + "出队列");
            first = first.getNext();
            temp.setNext(first);
           // System.out.println("小孩" + first.getNo() + "出队列");
        }
        System.out.println("最后一个小孩" + first.getNo() + "出队列");

    }

}

class Boy {
    private int no;
    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }


}

