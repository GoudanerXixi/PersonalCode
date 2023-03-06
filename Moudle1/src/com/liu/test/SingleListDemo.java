package com.liu.test;

/**
 * 目标：完成单链表的创建和增删改查 展示 反转等功能
 */
public class SingleListDemo {
    public static void main(String[] args) {
        StudentNode studentNode1 = new StudentNode(1,"史小韵", '女');
        StudentNode studentNode3 = new StudentNode(3,"圣湮伊莱娜", '女');
        StudentNode studentNode2 = new StudentNode(2,"伊瑟拉", '女');
        StudentNode studentNode4 = new StudentNode(4,"蹦云踏影", '女');
        SingleList singleList = new SingleList();
//        singleList.add(studentNode1);
//        singleList.add(studentNode3);
//        singleList.add(studentNode2);
//        singleList.add(studentNode4);
//        singleList.show(singleList.getHead());
        System.out.println("-----------------");
        singleList.sortAdd(studentNode1);
        singleList.sortAdd(studentNode3);
        singleList.sortAdd(studentNode2);
        singleList.sortAdd(studentNode4);
        singleList.show(singleList.getHead());
        System.out.println("链表长度为：");
        System.out.println(singleList.getLength(singleList.getHead()));
        singleList.delete(1);
        System.out.println("删除后链表长度为：");
        System.out.println(singleList.getLength(singleList.getHead()));

        System.out.println("查找的学号是：" + singleList.find(4));
        StudentNode studentNode5 = new StudentNode(4,"蹦妹", '♀');
        singleList.updata(4, studentNode5);
        System.out.println("修改后的数据为：");
        singleList.show(singleList.getHead());
        System.out.println("链表反转后的结果为：");
        singleList.reverse(singleList.getHead());
        singleList.show(singleList.getHead());
        System.out.println(singleList.getHead().next.next.next.next);


    }
}
class StudentNode{
    //数据域
    public String name;
    public char gender;
    public int idcard;

    //指针域
    public StudentNode next;

    public StudentNode(int idcard, String name, char gender){
        this.idcard = idcard;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentNode{" +
                "idcard=" + idcard +", " +
                "name=" + name + ", " +
                "gender=" + gender +
                "}";
    }
}
class SingleList{
    //设置头结点
    private StudentNode head = new StudentNode(0, "", ' ');

    public StudentNode getHead() {
        return head;
    }


    //添加结点
    public void add(StudentNode node){
        //创建扫描指针
        StudentNode temp = head;
        //找到尾结点添加
        while(true){
            //条件成立即找到最后一个结点
            if(temp.next == null){
                break;
            }
            temp = temp.next;

        }
        temp.next = node;
    }
    //添加结点并且根据学号自动排序
    public void sortAdd(StudentNode node){
        StudentNode temp = head;
        StudentNode cur = null;
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.idcard == node.idcard){
                System.out.println("对不起学号已经存在无法添加！");
                return;
            }
            if(temp.next.idcard > node.idcard){
                cur = temp.next;
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.next = cur;
    }
    //根据学号删除结点
    public void delete(int idcard){
        StudentNode temp = head;
        if(head.next == null){
            return;
        }
        if(idcard<1 || idcard>getLength(head)){
            System.out.println("输入的学号有问题~");
            return;
        }
        while(true){
            //找到要删除结点的前一个结点
            if(temp.next.idcard == idcard ){
                break;
            }
            temp = temp.next;
        }
        System.out.println(temp.next + "已删除成功！");
        temp.next = temp.next.next;
    }
    //获取链表长度
    public int getLength(StudentNode head){
        StudentNode temp = head.next;
        if(head.next == null){
            return 0;
        }
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    //根据学号查找学生结点
    public StudentNode find(int idcard){
        StudentNode temp = head.next;
        if(head.next == null){
            System.out.println("链表为空无法查找！");
            return null;
        }
        while(true){
            if(temp == null){
                System.out.println("对不起链表里没有该学生！");
                return null;
            }
            if(temp.idcard == idcard){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
    //根据修改结点信息
    public void updata(int idcard, StudentNode newNode){
        if(head.next == null){
            System.out.println("链表为空！");
            return;
        }
        StudentNode temp = head.next;
        while(true){
            if(temp == null){
                System.out.println("查无此人！");
                return;
            }
            if(temp.idcard == idcard){
                break;
            }
            temp = temp.next;
        }
        temp.name = newNode.name;
        temp.gender = newNode.gender;

    }

    //反转链表
    public void reverse(StudentNode head){
        if(head.next == null || head.next.next == null){
            return;
        }
        StudentNode newhead = new StudentNode(0, "", ' ');
        StudentNode temp = head.next;//扫描指针
        StudentNode cur = null;//用来暂存值
        while(true){
            if(temp == null){
                break;
            }
            cur = temp.next;
            temp.next = newhead.next;
            //让新的头结点指向不断指向第一个元素
            newhead.next = temp;
            temp = cur;

        }
        head.next = newhead.next;
    }
    //展示链表
    public void show(StudentNode head){
        if(head.next == null){
            System.out.println("链表为空！");
            return;
        }
        StudentNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;

        }

    }
}
