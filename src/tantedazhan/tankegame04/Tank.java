package tantedazhan.tankegame04;

import java.util.Vector;

/**
 * @author czq
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;

    private int direct;//坦克方向0 1 2 3

    private int speed = 1;//速度

    Vector<zidan> zidans = new Vector<>();

    boolean islive = true;
     zidan A = null;

    public void  Shot() {
        switch(direct){
            case 0://0表示向上
                A = new zidan(x+20,y,3,direct);

                break;

            case 1://向右
                A = new zidan(x+60,y+20,3,direct);

                break;
            case 2://向下
                A = new zidan(x+20,y+60,3,direct);

                break;
            case 3://向左
                A = new zidan(x,y+20,3,direct);

                break;
            default:
                System.out.println("暂时没有处理 ");
        }
        //启动shot

        new Thread(A).start();
    }

    public void speed_(int speed){
        this.speed  = speed;
    }
    public void moveup(){
        y -= speed;
    }
    public void moveleft(){
        x -= speed;
    }
    public void movedown(){
        y += speed;
    }
    public void moveright(){
        x += speed;
    }
    public Tank(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
