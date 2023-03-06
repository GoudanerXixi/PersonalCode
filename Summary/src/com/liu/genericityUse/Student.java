package com.liu.genericityUse;

/**
 * 泛型接口：让实现类选择当前功能需要操作的数据类型
 * 泛型接口可以约束实现类，实现类可以在实现接口的时候传入自己操作的数据类型这样重写的方法都是针对于该类型的操作
 */
public class Student implements Data<Student>{
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void updata(Student student) {

    }
}
