package com.fengzhuang;

public class fZ {

    public static void main(String[] args) {






    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        setAge(age);
        setName(name);
        setSalary(salary);
        /*
        可将set方法放到构造器中，可以继续控制变量
         */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length()<=6) {
            this.name = name;
        }
        else{
            System.out.println("名字的长度不对应该在2~6之间");
            this.name = " null ";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            if(age >= 1 && age <= 120){
            this.age = age;
        }
            else{
                System.out.println("你设置的年龄应该在1~120");
                this.age = 18;
            }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
