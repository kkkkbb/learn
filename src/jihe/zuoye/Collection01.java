package jihe.zuoye;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author czq
 * @version 1.0
 */
public class Collection01 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("小黄",5));
        arrayList.add(new Dog("小花",6));
        arrayList.add(new Dog("大黄",4));
        arrayList.add(2,3);
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        for(Object o:arrayList){
            System.out.println(o);
        }
    }

}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}