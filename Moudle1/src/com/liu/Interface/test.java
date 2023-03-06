package com.liu.Interface;

public class test {
    public static void main(String[] args) {
        Computer c = new Computer("外星人");
        c.start();

        USB u1 = new Keyboard("科技键盘");
        c.install(u1);

        USB u2 = new Mouse("罗技鼠标");
        c.install(u2);

//        USB u3 = new USB() {
//            @Override
//            public void insert() {
//
//            }
//
//            @Override
//            public void pull() {
//
//            }
//        };

    }
}
