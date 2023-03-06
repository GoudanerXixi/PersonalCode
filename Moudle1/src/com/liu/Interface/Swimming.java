package com.liu.Interface;

public interface Swimming {
    public void swim();
}
class test03{
    public static void main(String[] args) {
//        Swimming s = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("老师游泳很快~~~");
//            }
//        };
//        go(s);
       Swimming s = ()->{
           System.out.println("学生游泳也不错");
       };
       go(s);

       go(()->{
           System.out.println("西西根本不会游泳");
       });
       go(()-> System.out.println("西西真不会游泳")) ;
    }
    public static void go(Swimming s){
        System.out.println("比赛开始~~~");
        s.swim();
        System.out.println("比赛结束~~~");
    }


}
