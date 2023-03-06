package com.liu.test;

public class Movice {
    private String name;
    private double score;
    private String doctor;



    public Movice(String name, double score, String doctor) {
        this.name = name;
        this.score = score;
        this.doctor = doctor;
    }


    public Movice() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }


}
