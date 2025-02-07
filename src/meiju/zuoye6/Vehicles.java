package meiju.zuoye6;

/**
 * @author czq
 * @version 1.0
 */
public interface Vehicles {
    void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("你骑上了马");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("你坐上了船");
    }
}
