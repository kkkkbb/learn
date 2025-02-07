package meiju.zuoye7;

/**
 * @author czq
 * @version 1.0
 */
class Test{
    public static void main(String[] args) {
        Car car = new Car(43);
        car.getAir();
    }
}
public class Car {
    public double temperature;

    public Car(double temperature) {
        this.temperature = temperature;

    }

    class Air{
        public void flow(){
            if(Car.this.temperature > 40){
                System.out.println("吹冷风");
            }
            else if(Car.this.temperature < 0){
                System.out.println("吹暖风");
            }
            else{
                System.out.println("关闭空调");
            }
        }



    }


    public void getAir(){
        Air a = new Air();
        a.flow();
    }


}
