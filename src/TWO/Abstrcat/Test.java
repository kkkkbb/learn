package TWO.Abstrcat;

public class Test {

    public static void main(String[] args) {

        camera camera = new camera();
        phone phone = new phone();

        computer computer = new computer();
        computer.work(camera);
        computer.work(phone);


    }

}
