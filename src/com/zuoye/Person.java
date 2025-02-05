package com.zuoye;

public class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person[] maopao(Person [] p){
        Person p1 = new Person("czq",18,"dada");
        for(int i = 0; i < p.length -1; i++){
            for(int j = 0; j < p.length - i - 1 ; j++){
                if(p[j].age > p[j+1].age){
                    p1.age = p[j+1].age;
                    p[j+1].age = p[j].age;
                    p[j].age = p1.age;
                }
            }
        }
        return p;
    }
}
