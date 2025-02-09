package jihe.zuoye3;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author czq
 * @version 1.0
 */
public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("czq",18));
        hashSet.add(new Employee("wang",5));
        hashSet.add(new Employee("wang",5));

        for(Object o:hashSet){
            System.out.println(o);
        }

    }
}
class Employee{
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }



    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}