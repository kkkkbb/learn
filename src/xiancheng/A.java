package xiancheng;

/**
 * @author czq
 * @version 1.0
 */
public class A {
    public static void main(String[] args) {
        /*
        创建Cat对象 可以当做线程使用
         */
//        Cat cat = new Cat();
//        cat.start();

        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Cat extends Thread{
    int time = 79;
    @Override
    public void run() {

        while (true) {
            System.out.println("我是一只小猫咪" + (++time) + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);;
            }
        if(time == 80){
            break;
        }
        }

    }
}
class Dog implements Runnable{
    int time = 79;

    @Override
    public void run() {
        while (true) {
            System.out.println("我是一只小狗狗" + (++time) + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);;
            }
            if(time == 80){
                break;
            }
        }

    }
}