package tantedazhan.tangame;

import javax.swing.*;
import java.awt.*;

/**
 * @author czq
 * @version 1.0
 */
public class MyPanel extends JPanel {
    //坦克大战的绘图区域
    Hero hero = null;

    public MyPanel(){
        hero = new Hero(100,100);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);


        //画出坦克
        drawTank(hero.getX(),hero.getY(),g,0,1);


    }

    /**
     *
     * @param x 坦克的x坐标
     * @param y y坐标
     * @param g 画笔
     * @param direct 坦克的方向
     * @param type 坦克的类型
     */
    public void drawTank(int x,int y,Graphics g,int direct,int type){

        switch(type){
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }


        switch(direct){
            case 0://0表示向上
                g.fill3DRect(x,y,10,60,false);//画出坦克左面的轮子
                g.fill3DRect(x+30,y,10,60,false);//画出坦克右面的轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克身体
                g.fillOval(x+10,y+20,20,20);//画出坦克圆形
                g.drawLine(x+20,y+30,x+20,y);//画出坦克炮筒

            default:
                System.out.println("暂时没有处理 ");
        }
    }
}
