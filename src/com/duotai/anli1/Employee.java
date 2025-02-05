package com.duotai.anli1;

public class Employee {
    private String name;
    private double Score;

    public Employee(String name, double score) {
        this.name = name;
        Score = score;
    }

    public String getAnnual(){
        return "你的年工资为:" + Score * 12;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }
}
