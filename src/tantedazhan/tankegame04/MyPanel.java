package tantedazhan.tankegame04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author czq
 * @version 1.0
 */
//要让子弹一直重绘需要将Mypanel实现线程
public class MyPanel extends JPanel  implements KeyListener,Runnable {
    //坦克大战的绘图区域
    Hero hero = null;

    Vector<direntanke> Dtank = new Vector<>();

    int Dtenknumber = 3;

    public MyPanel(){
        hero = new Hero(300,300);
        hero.speed_(2);

        for (int i = 0; i < Dtenknumber; i++) {
            direntanke direntanke = new direntanke((100 * (i + 1)), 100);
            direntanke.setDirect(2);

            zidan  zidan = new zidan(direntanke.getX()+20,direntanke.getY()+60,2,direntanke.getDirect());
            direntanke.zidans.add(zidan);

            new Thread(zidan).start();

            Dtank.add(direntanke);

        }
    }

    public static void hitTank(zidan zi,direntanke di){
        //判断zidan是否击中tank
        switch(di.getDirect()){
            case 0:
            case 2:
                if(zi.x > di.getX() && zi.x < di.getX()+40 && zi.y > di.getY() && zi.y < di.getY() +60){
                    zi.loop = false;
                    di.islive  =false;
                }
                break;
            case 1:
            case 3:
                if(zi.x > di.getX() && zi.x < di.getX()+60 && zi.y > di.getY() && zi.y < di.getY() +40){
                    zi.loop = false;
                    di.islive  =false;
                }
                break;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);


        //画出坦克
        drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),0);

        if(hero.A != null  && hero.A.loop == true){
            g.draw3DRect(hero.A.x,hero.A.y,2,2,false);
        }


        //敌人的坦克
        for (int i = 0; i < Dtank.size(); i++) {
            direntanke direntanke = Dtank.get(i);
            if (direntanke.islive) {//当敌人坦克是存活的
                drawTank(direntanke.getX(),direntanke.getY(),g,direntanke.getDirect(),1);
                for (int j = 0; j < direntanke.zidans.size(); j++) {

                    zidan zidan1 = direntanke.zidans.get(j);
                    if(zidan1.loop){
                        g.draw3DRect(zidan1.x,zidan1.y,2,2,false);
                    }else{
                        direntanke.zidans.remove(zidan1);
                    }

                }
            }

        }


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
                break;

            case 1://向右
                g.fill3DRect(x,y,60,10,false);//画出坦克上面的轮子
                g.fill3DRect(x,y+30,60,10,false);//画出坦克右面的轮子
                g.fill3DRect(x+10,y+10,40,20,false);//画出坦克身体
                g.fillOval(x+20,y+10,20,20);//画出坦克圆形
                g.drawLine(x+30,y+20,x+60,y+20);//画出坦克炮筒
                break;
            case 2://向下
                g.fill3DRect(x,y,10,60,false);//画出坦克左面的轮子
                g.fill3DRect(x+30,y,10,60,false);//画出坦克右面的轮子
                g.fill3DRect(x+10,y+10,20,40,false);//画出坦克身体
                g.fillOval(x+10,y+20,20,20);//画出坦克圆形
                g.drawLine(x+20,y+30,x+20,y+60);//画出坦克炮筒
                break;
            case 3://向左
                g.fill3DRect(x,y,60,10,false);//画出坦克上面的轮子
                g.fill3DRect(x,y+30,60,10,false);//画出坦克右面的轮子
                g.fill3DRect(x+10,y+10,40,20,false);//画出坦克身体
                g.fillOval(x+20,y+10,20,20);//画出坦克圆形
                g.drawLine(x+30,y+20,x,y+20);//画出坦克炮筒
                break;
            default:
                System.out.println("暂时没有处理 ");
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_S){
           hero.setDirect(2);

            hero.movedown();
            System.out.println("diaoyong");
        }else if(e.getKeyCode() == KeyEvent.VK_W){
            hero.setDirect(0);

            hero.moveup();

        }else if(e.getKeyCode() == KeyEvent.VK_A){
            hero.setDirect(3);
            hero.moveleft();

        }else if(e.getKeyCode() == KeyEvent.VK_D){
            hero.setDirect(1);
            hero.moveright();

        } else if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.Shot();

        }
        //让面板重新绘制
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔100毫秒重绘
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(hero.A != null && hero.A.loop){//判断子弹是否击中敌人坦克
                for (int i = 0; i < Dtank.size(); i++) {
                    direntanke direntanke = Dtank.get(i);
                    if(direntanke.islive){
                    hitTank(hero.A,direntanke);
                    }
                }
            }

            this.repaint();
        }
    }
}
