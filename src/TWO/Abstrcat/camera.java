package TWO.Abstrcat;

public class camera implements Usb{

    public void start() {
        System.out.println("相机开始了工作..");
    }

    @Override
    public void stop() {
        System.out.println("相机停止了工作..");
    }


}



