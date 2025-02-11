package xiancheng.zuoye1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * @author czq
 * @version 1.0
 */
public class A {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
        KeyINT keyINT = new KeyINT();
        Thread thread1 = new Thread(keyINT);
        thread1.start();

    }
}

class Dog implements Runnable{
    static boolean  loop = true;
    @Override
    public void run() {

        while(loop){

            System.out.println( (Math.random() *100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void setLoop(boolean loop) {
        Dog.loop = loop;
    }
}

class KeyINT implements Runnable {

    Scanner myscanner = new Scanner(System.in);
    @Override
    public void run() {

        while (true) {
            System.out.println("请输入你的指令:");

            char n = myscanner.next().charAt(0);
            if(n == 'Q'){
                Dog.loop = false;
                break;
            }

        }
    }


}
