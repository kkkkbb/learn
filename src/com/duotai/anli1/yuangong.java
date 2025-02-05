package com.duotai.anli1;

public class yuangong extends Employee{

    public void work(){
        System.out.println("你在工作");
    }

    public yuangong(String name, double score) {
        super(name, score);
    }

    @Override
    public String getAnnual() {
        return super.getAnnual() ;
    }
}
