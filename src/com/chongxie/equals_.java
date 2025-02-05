package com.chongxie;

public class equals_ {
    public static void main(String[] args) {
        Person person = new Person("czq",17,'男');
        Person person2 = new Person("czq",17,'男');
        equals_ equals = new equals_();
        boolean b = equals.bijiao(person,person2);
        System.out.println(b);
    }

    public boolean bijiao(Person n1,Person n2){
        return (n1.getName() == n2.getName()) && (n1.getAge() == n2.getAge()) && (n1.getGender() == n2.getGender());
    }
}
