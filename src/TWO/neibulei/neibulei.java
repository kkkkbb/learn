package TWO.neibulei;

public class neibulei {

    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

    }

}

interface Bell{

    void ring();
}

class Cellphone{

    public void alarmclock(Bell B){
        B.ring();
    }


}