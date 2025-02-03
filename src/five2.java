
import java.util.Scanner;
public class five2 {

    public static void main(String[] args){


        Cat cat = new Cat();
        cat.age = 18;
        cat.color = "白色";
        cat.name = "小白";


        Cat cat2 = new Cat();
        cat2.age = 19;
        cat2.color = "花色";
        cat2.name = "小花";
        person p =new person();
        p.Speak();
        p.cal01(5);
        p.gunsum(5,89);
        /*
        当程序执行到方法是，就会开辟一个独立的空间，站空间，当方法执行完毕，就会执行return语句就会返回，
        返回到调用方法的地方，返回后继续执行方法后面的代码
        当main执行完毕后，等个程序退出
         */
    }

}

class Cat{
    /*
    成员变量
     */
    String name;
    int age;
    String color;



}

class person{
    int age;
    String name;


    public void Speak(){
        System.out.println("我是一个好人");
    }

    public void cal01(int n ){
        int num = 0;

        for(int i = 1 ; i <= n ; i ++){

            num += i;
        }
        System.out.println(num);
    }
    public void gunsum(int n ,int j ){
        System.out.println(n + j);
    }
}



























