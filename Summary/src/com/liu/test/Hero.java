package com.liu.test;

public class Hero {
    private String name;
    private int id;
    private String aliss;
    Hero next;

    public Hero(String name, int id, String aliss){
        this.name = name;
        this.id = id;
        this.aliss = aliss;
    }
    public Hero(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAliss() {
        return aliss;
    }

    public void setAliss(String aliss) {
        this.aliss = aliss;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", aliss='" + aliss + '\'' +
                '}';
    }
}
