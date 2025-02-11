package xiancheng;

/**
 * @author czq
 * @version 1.0
 */
public class B {
    public static void main(String[] args) {

        Hi hi = new Hi();
        Hello_ hello = new Hello_();
        Thread thread = new Thread(hi);
        thread.start();
        Thread thread1 = new Thread(hello);
        thread1.start();

    }
}
class Hello_ implements Runnable{

    int count = 0;

    @Override
    public void run() {
        while(true){
            System.out.println("hello world" + ++count + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(count == 5){
                break;
            }
        }

    }
}
class Hi implements Runnable{

    int count = 0;

    @Override
    public void run() {
        while(true){
            System.out.println("hello HI" + ++count+ Thread.currentThread().getName() );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(count == 5){
                break;
            }
        }

    }
}