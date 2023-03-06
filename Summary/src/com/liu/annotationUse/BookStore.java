package com.liu.annotationUse;

@Book(value = "三国演义", price = 99.9, authors = {"罗贯中", "luoguanzhong"}  )
public class BookStore{
    @Book(value = "谁动了我的奶酪", authors = {"张三, 李四"})
    public void speak(){

    }
}
