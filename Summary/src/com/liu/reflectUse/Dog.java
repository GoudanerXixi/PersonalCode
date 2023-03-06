package com.liu.reflectUse;

public class Dog {
    private String dogName;
    private double price;
    private String color;
    private int age;

    public Dog(String dogName, double price, String color, int age) {
        this.dogName = dogName;
        this.price = price;
        this.color = color;
        this.age = age;
    }

    public Dog() {
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
