package xiancheng.zuoye1;

/**
 * @author czq
 * @version 1.0
 */
public class B {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Thread thread = new Thread(employee);
        Thread thread2 = new Thread(employee);
        thread.start();
        thread2.start();


    }
}

class Employee implements Runnable{

    static int sal =  10000;
    @Override
    public void run() {
        synchronized (this) {
            while(true){
                if(sal == 0){
                    System.out.println("余额为零");
                    break;
                }
                sal -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出钱 :" + 1000 + "还剩:" + sal);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }
}
