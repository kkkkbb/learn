package jihe.zuoye4;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;


/**
 * @author czq
 * @version 1.0
 */
public class C {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("czq",4545,new MyDate(7878,456,464)));
        hashSet.add(new Employee("www",4545,new MyDate(7878,456,464)));
        hashSet.add(new Employee("ca",4545,new MyDate(7878,456,464)));
        hashSet.add(new Employee("czq",4545,new MyDate(7878,456,464)));

        for(Object o:hashSet){
            System.out.println(o);
        }
    }
}

class Employee{
    private String name;
    private int sal;

    private MyDate birday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birday=" + birday +
                '}';
    }

    public Employee(String name, int sal, MyDate birday) {
        this.name = name;
        this.sal = sal;
        this.birday = birday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return sal == employee.sal && Objects.equals(name, employee.name) && Objects.equals(birday, employee.birday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
class MyDate{
    private int year;
    private int sal;
    private int day;

    public MyDate(int year, int sal, int day) {
        this.year = year;
        this.sal = sal;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && sal == myDate.sal && day == myDate.day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", sal=" + sal +
                ", day=" + day +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, sal, day);
    }
}