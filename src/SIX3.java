//import java.util.Scanner;

import java.util.Scanner;

public class SIX3 {
    public static void main(String[] args){

//        Circle2 c = new Circle2();
//
//        PassObject p = new PassObject();
//        p.printAreas(c,5);

        Tom t = new Tom();
        t.caiquan();

    }
}

//class  Person3{
//    int age;
//    String name;
//    public Person3(int age,String name){
//        this.name = name;
//        this.age = age;
//    }
//    public boolean compareTo(Person3 p){
//        if(p.age == this.age && p.name.equals(this.name)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//
//}

class Tool{
    public double Max(double[] d){
        double max = d[0];
        for(int i = 0; i < d.length ; i++){
            if(max < d[i]){
                max = d[i];
            }
        }
        return max;
    }
}

class A02{

    public int find(String[] s,String s2){
        int index = -1;

        for(int i =0; i< s.length ; i++){
            if(s2.equals(s[i])){
                index = i;
            }

        }
        return index;
    }

}

class Book {
    String name;
    double price;

    public Book(String name ,double price){
        this.name =name;
        this.price = price;
    }
    public void updatePrice(Book b){
        if(b.price > 150){
            b.price = 150;
        }
        else if(b.price > 100){
            b.price = 100;
        }

    }
}

class A3{

    public int[] copyArr(int[] arr){

        int [] arr2 = new int[arr.length];

        for(int i = 0;i <arr.length ;i++){
            arr2[i] = arr[i];
        }
        return arr2;
    }



}

class Circle{
    double banjing;

    public Circle(double banjing){
        this.banjing = banjing;
    }

    public void Circlezhouchang (){
        System.out.println("周长为：" + ((banjing)*2)*Math.PI);
    }



    public void Circlemianji (){
        System.out.println("面积为:" + (banjing)*(banjing)*Math.PI);
    }
}


class Cale{
    double cnum1;
    double bcnum2;

    public Cale(double num1,double num2){
        this.cnum1 = num1;
        this.bcnum2 = num2;
    }

    public double  he(){
        return cnum1 + bcnum2;
    }
    public double cha(){
        return cnum1 - bcnum2;
    }
    public double ji(){
        return cnum1 * bcnum2;
    }
    public Double shang(){
        if(bcnum2 == 0){
            System.out.println("被除数为0，不能相除");
            return null;
        }
        return cnum1 / bcnum2;

    }


}


class Dog{
    int age;
    String name;
    String color;


    public Dog(int age,String name,String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void show(){
        System.out.println("小狗的名字 " + this.name + " 年龄 " + this.age + " 颜色 " + this.color);
    }

}


/*

8.
10
9
10


 */


class Music{
    String name;
    String times;





}


/*
10.

101
100

101
101



 */



//class Method{
//
//
//    public int method(int num,int num2){
//        return num > num2? num : num2;
//    }
//
//
//
//}


class Employee{
    String name ;
    char sex;

    int age ;
    String zhiwei;
    String xinshui;

    public Employee(String name ,char sex,int age,String zhiwei, String xinshui){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.zhiwei = zhiwei;
        this.xinshui = xinshui;
    }
    public Employee(String name ,char sex,String xinshui){
        this.name = name;
        this.sex = sex;
        this.xinshui = xinshui;
    }
    public Employee(String name ,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}

class Circle2{
    double radius;


    public double findArea(){
        return radius * radius * 3.14;
    }

}

class PassObject{

    public void printAreas(Circle2 c, int times){
        for(int i = 1; i <= times ; i++){
            c.radius = i;
            System.out.println("输出半径为" + i + "的圆面积：" + c.findArea());

        }
    }

}


class Tom{


    Scanner myscanner = new Scanner(System.in);

    public void caiquan(){
        int n2 = 0;
        int n3 = 0;
        while(true){
            int n = (int)(Math.random() * 3 );

            System.out.println("请你输入一个数字在0~2之间 ： 0表示石头、1表示剪刀、2表示布");

            int num = myscanner.nextInt();

            if(n == 0 && num == 1){
                System.out.println("你输了输了" + (++n2) + "次");
            }
            else if(n == 1 && num == 2){
                System.out.println("你输了输了" + (++n2) + "次");
            }
            else if(n == 2 && num == 0){
                System.out.println("你输了输了" + (++n2) + "次");
            }
            else if(num == 0 && n == 1){
                System.out.println("你赢了赢了" + (++n3) + "次");
            }
            else if(num == 1 && n == 2){
                System.out.println("你赢了赢了" + (++n3) + "次");
            }
            else if(num == 2 && n == 0){
                System.out.println("你赢了赢了" + (++n3) + "次");
            }
            else if(num == n){
                System.out.println("平局");
            }
            System.out.println("你想继续猜拳吗? y/n");
            char ch = myscanner.next().charAt(0);
            if(ch == 'n'){
                break;
            }
        }
    }

}



























