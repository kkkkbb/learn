public class six2 {
    public static void main(String[] args){



    MyCalculator my = new MyCalculator();

    System.out.println( my.ret("czq",18,79,45));;


    Person2 p = new Person2(18,"czq");
    System.out.println(p.age + p.name);
    }
}

class MyCalculator {

    public int calculate(int n1,int n2){

        return n1 + n2;
    }

    public double calculate(int n1,double n2){
        return n1 + n2;
    }

    public double calculate(double n1,int n2){
        return n1 + n2;
    }
    public int calculate(int n1,int n2, int n3){
        return n1 +n2 +n3;
    }

    public int calculate(int... num){
        int res = 0;
        for(int i = 0 ; i <num.length ; i++){
            res += num[i];
        }
        return res;
    }

    public String ret(String s,int... num){
        int res = 0;
        for(int i = 0; i <num.length ;i++){
            res += num[i];
        }
        return "姓名" + s + "总分为：" + res;
    }

}

class Person2{

    int age;
    String name;

    public Person2(int age1,String name1){
        System.out.println("构造器被调用");
        age = age1;
        name = name1;
    }





}