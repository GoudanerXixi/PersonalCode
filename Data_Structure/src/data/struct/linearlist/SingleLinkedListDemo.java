package data.struct.linearlist;

/**
 * 实现单链表,完成增删改查功能
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //创建结点
        HeroNode hero1 = new HeroNode(1,"宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3,"吴用", "智多星");
        HeroNode hero4 = new HeroNode(4,"林冲", "豹子头");
        //创建单链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //将结点加入单链表
//        singleLinkedList.add(hero1);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);
//        singleLinkedList.add(hero4);

        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.addByOrder(hero4);
        System.out.println("删除或修改前：");
        singleLinkedList.showList();
        System.out.println("删除或修改后：");
//        singleLinkedList.delete(2);
//        singleLinkedList.delete(1);
//        singleLinkedList.delete(4);
//        singleLinkedList.delete(3);
        singleLinkedList.updata(new HeroNode(2,"小卢", "小麒麟"));
        singleLinkedList.updata(new HeroNode(4,"软蛋冲", "白嫖党"));
        singleLinkedList.showList();
        System.out.println("单链表的长度为：" + singleLinkedList.lengthList(singleLinkedList.head));
        System.out.println("倒数第k个结点为：" + singleLinkedList.inverseNode(singleLinkedList.head, 1));
        System.out.println("链表反转后的结果：");
        singleLinkedList.reverseList(singleLinkedList.head);
        singleLinkedList.showList();
    }
}
class SingleLinkedList{
    //1.创建头结点，此时指针域为空head.null = null;
    public HeroNode head = new HeroNode(0, "", "");

    //添加结点
    public void add(HeroNode heroNode){
        //创建头指针进行扫描
        HeroNode temp = head;

        //遍历链表找到最后一个结点，即最后一个结点为null
        while(true){
            if(temp.next == null){
                break;
            }
            //否则遍历下一个结点
            temp = temp.next;
        }
        //当退出循环就是找到了最后一个结点，让后把最后一个结点的指针域指向加进来的结点
        temp.next = heroNode;
    }
    //根据英雄编号来决定插入顺序
    public void addByOrder(HeroNode heroNode){
        //创建头指针
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            //找到最后一个结点
            if(temp.next == null){
                break;
            }
            //此时结点刚好该插入temp后面
            if(temp.next.number > heroNode.number){
                break;
            }else if(temp.next.number == heroNode.number){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.println("对不起编号" + heroNode.number + "已经存在,无法加入");
        }else{
            //在temp后加入结点
            //该结点的指针指向下一个结点,先让该节点指向下一个，再让temp指向该结点，如果颠倒数据会被覆盖
            heroNode.next = temp.next;
            //temp的指针指向该结点
            temp.next = heroNode;
        }
    }
    //根据编号删除结点
    public void delete(int number){
        //头指针，辅助指针
        HeroNode temp = head;

        boolean flag = false;
        //遍历链表找到要删除的前一个结点
        while(true){
            //链表找完,这里其实temp只扫描到倒数第二个节点
            //因为只需要找要删除的上一个结点就好
            //即temp.next = temp.next.next(null)
            if(temp.next == null){
                break;
            }
            //说明找到了要删除的上一个结点
            else if(temp.next.number == number){
                flag = true;
                break;
            }
            //指针后移
            temp = temp.next;
        }
        //flag为true找到要删除的前一个结点
        if(flag){
            //跳过删除的结点，通过jvm垃圾回收机制回收对象
            temp.next = temp.next.next;
        }else{
            System.out.println("对不起,没有找到要删除的结点");
        }
    }
    //查找单链表的倒数第k个结点
    public HeroNode inverseNode(HeroNode head, int k){
        HeroNode temp = head;
        if(temp.next == null){
            return null;
        }
        //获取链表长度
        int length = lengthList(head);
        if(k<1 || k>length){
            System.out.println("请输入正确的结点序号~");
            return null;
        }
        for(int i = 1; i <= length - k; i++){
            temp = temp.next;
        }
        return temp.next;
    }
    //根据number修改结点数据
    public void updata(HeroNode newHero){
        HeroNode temp = head;
        boolean falg = false;
        while(true){
            if(temp == null){
                return;
            }
            if(temp.number == newHero.number){
                falg = true;
                break;
            }
            temp = temp.next;
        }
        if(falg){
            temp.name = newHero.name;
            temp.nickname = newHero.nickname;
        }else{
            System.out.println("没有找到编号为" + temp.number + "的结点，不能修改~");
        }
    }
    //显示链表的长度
    public int lengthList(HeroNode head){
        //指针从第一个元素开始扫描
        HeroNode temp = head.next;
        int count = 0;
           if(head.next == null){
               return 0;
           }
        while(true){
            if(temp == null){
                break;
            }
            count++;
            temp = temp.next;
        }
        return count;
    }
    //反转链表
    public  void reverseList(HeroNode head){
        //思路：利用头插法把原链表一个一个取出来放在新链表上
        //链表为空或者链表只有一个直接返回
        if(head.next == null || head.next.next == null){
                  return;
        }
        HeroNode cur = head.next; //扫描指针  从第一个开始扫描
        //新的头节点
        HeroNode reverseHead = new HeroNode(0,"", "");
        HeroNode temp = null;
        while(cur != null){
            temp = cur.next;//保存当前节点的下一个节点
            cur.next = reverseHead.next;//将cur的下一个结点指向新的链表的最前端
            reverseHead.next = cur;//将cur链接到新的链表上
            cur = temp;//指针后移

        }
        head.next = reverseHead.next;

    }
    //展示链表
    public void showList(){
        //判断链表是否为空
        if(head.next == null){
            return;
        }
       //同样需要一个头指针
        HeroNode temp = head.next;
        while (true){
            //判断是否遍历到最后一个元素
            if(temp == null){
                return;
            }
            System.out.println(temp);
            //输出完一个指针后移一位
            temp = temp.next;
        }
    }
}

class HeroNode{
    //结点的数据域
    public String name;

    public int number;

    public String nickname;

    //指针域
    HeroNode next;

    public HeroNode(int number, String name, String nickname){
        this.number = number;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" + "number：" + number + ", " + "name：" + name + ", " + "nickname：" + nickname + "}";
    }
}
