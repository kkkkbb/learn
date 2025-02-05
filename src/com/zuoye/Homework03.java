package com.zuoye;

public class Homework03 {

    String name ;

    public Homework03(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        Salary = salary;
    }

    int age;
    String post;
    double Salary;

    public void introduce(){
        System.out.println("姓名: " + name + " 年龄 ： " + age + " 职称 :" + post + " 薪水 : " + Salary);
    }


}
class jiaoshou extends Homework03{


    public jiaoshou(String name, int age, String post, double salary) {
        super(name, age, post, salary);

    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
class fujiaoshou extends Homework03{


    public fujiaoshou(String name, int age, String post, double salary) {
        super(name, age, post, salary);

    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
class jiangshi extends Homework03{


    public jiangshi(String name, int age, String post, double salary) {
        super(name, age, post, salary);

    }

    @Override
    public void introduce() {
        super.introduce();
    }
}