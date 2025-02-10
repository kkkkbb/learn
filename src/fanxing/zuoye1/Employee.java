package fanxing.zuoye1;

import java.util.*;

/**
 * @author czq
 * @version 1.0
 */

class A{
    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("czq",4545,new MyDate(18,19,18)));
        employees.add(new Employee("czq",4545,new MyDate(18,18,18)));
        employees.add(new Employee("asdasdasdasdasdsa",4545,new MyDate(18,16,18)));

//        Iterator iterator = employees.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    return 0;
                }
                if (!(o1.getName().equals(o2.getName()))) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o1.getBrithday().compareTo(o2.getBrithday());
                }
            }
        });
        System.out.println(employees);

    }
}
public class Employee {

private String name;
private double sal;
private MyDate brithday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", brithday=" + brithday +
                '}';
    }

    public Employee(String name, double sal, MyDate brithday) {
        this.name = name;
        this.sal = sal;
        this.brithday = brithday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBrithday() {
        return brithday;
    }

    public void setBrithday(MyDate brithday) {
        this.brithday = brithday;
    }
}
class MyDate implements Comparable<MyDate>{
    private  int month;
    private  int year;
    private  int day;

    @Override
    public int compareTo(MyDate o) {
        if (!(getYear() == o.getYear())) {
            return getYear() - o.getYear();
        } else {
            if (!(getMonth() == o.getMonth())) {
                return getMonth() - o.getMonth();
            } else {
                return getDay() - o.getDay();
            }
        }
    }

    public MyDate(int month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", year=" + year +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

