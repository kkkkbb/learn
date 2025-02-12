package tantedazhan.tankegame04;

import java.awt.*;

/**
 * @author czq
 * @version 1.0
 */
public class zidan implements Runnable {

     int x;
     int y;

    private int speed = 0;

    private int direct = 2;

    boolean loop = true;//子弹时候还存活

    public zidan(int x, int y, int speed,int direct) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direct = direct;
    }



    public void zidan_(Graphics g){
        g.setColor(Color.red);
        switch(direct){
            case 0://0表示向上

                g.drawOval(x+20,y,2,2);//画出坦克子弹
                break;

            case 1://向右

                g.drawOval(x+60,y+20,2,2);//画出坦克子弹
                break;
            case 2://向下

                g.drawOval(x+20,y+60,2,2);//画出坦克子弹
                break;
            case 3://向左

                g.drawOval(x,y+20,2,2);//画出坦克子弹
                break;
            default:
                System.out.println("暂时没有处理 ");
        }
    }
    @Override
    public void run() {
            while(true){
                //子弹休眠
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                }
                //根据方向改变坐标
                switch(direct){
                    case 0://0表示向上

                       y -= speed;
                        break;

                    case 1://向右

                       x += speed;
                        break;
                    case 2://向下

                        y += speed;
                        break;
                    case 3://向左

                        x -= speed;
                        break;
                    default:
                        System.out.println("暂时没有处理 ");
                }

                System.out.println("子弹x：" +x + "子弹y: " + y);
                //子弹销毁
                //挡子弹碰到敌人的坦克时也应该退出
                if(!(x >= 0&& x <= 1000 && y >= 0 && y <= 750 && loop)){
                    loop = false;
                    System.out.println("子弹线程退出");
                    break;
                }
            }
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public zidan(int x, int y) {
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
