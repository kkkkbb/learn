package TWO.Abstrcat;

public abstract class Employee {

    String name ;
    public String id;
    public double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();

}


class Manager extends Employee{
    public double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


    @Override
    public void work() {
        System.out.println("在工作");
    }
}
