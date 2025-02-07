package meiju.zuoye3;

/**
 * @author czq
 * @version 1.0
 */
class Test{
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog  = new Dog();
        dog.shout();
    }
}

abstract public class Animal {

   public  abstract void shout();


}
class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗会汪汪叫");
    }
}

