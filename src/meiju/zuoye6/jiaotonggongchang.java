package meiju.zuoye6;

/**
 * @author czq
 * @version 1.0
 */
public class jiaotonggongchang {

    public static  Horse getHorse(){

        return  new Horse();
    }
    public static Boat getBoat(){

        return new Boat();
    }
}

class Person{
    private String name;
    private Vehicles Vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        Vehicles = vehicles;
    }
}
class Test{
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Boat());
//        Person person2 = new Person("唐僧",);

    }
}