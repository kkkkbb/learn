package com.duotai.anli1;

public class jingli extends Employee{

    private double bonus;

    public jingli(String name, double score, double bonus) {
        super(name, score);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("你在管理");
    }

    @Override
    public String getAnnual() {
        return super.getAnnual() + "你的奖金为：" + bonus;
    }
}
