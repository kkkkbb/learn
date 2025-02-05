package com.zuoye;

public class Test {
    public static void main(String[] args) {
        Person[] p = new Person[3];
        Person p1 = new Person("czq",19,"dada");
        Person p2 = new Person("czq",78,"dada");
        Person p3 = new Person("czq",49,"dada");
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        Person[] P = p1.maopao(p);
        for(int i = 0; i <P.length ;i++){
            System.out.println(P[i].age);
        }


        jiaoshou jiaoshou = new jiaoshou("czq",18, "jiangshi",1.1);
        jiaoshou.introduce();



    }
}
