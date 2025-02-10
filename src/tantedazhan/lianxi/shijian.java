package tantedazhan.lianxi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author czq
 * @version 1.0
 */


/*
java的事件控制
 */
public class shijian extends JFrame {
    Mypan mypan = null;
    public static void main(String[] args) {
        new shijian();
    }
    public shijian(){
        mypan = new Mypan();
        this.add(mypan);
        this.setSize(500,500);
        this.addKeyListener(mypan);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class Mypan extends JPanel implements KeyListener {


    //为了让小球可以移动，把左上角的坐标设置为变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.fillRect(0,0,500,500);
        g.setColor(Color.BLACK);
        g.fillOval(x,y,20,20);
    }

    /*
    有字符输出时，该方法会触发
     */
    @Override
    public void keyTyped(KeyEvent e) {


    }

    /*
    当某个键按下时，该方法会触发
     */
    @Override
    public void keyPressed(KeyEvent e) {

//        System.out.println((char)e.getKeyCode() + "被按下..");


        if(e.getKeyCode() == KeyEvent.VK_S){
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_W){
            y--;
        }else if(e.getKeyCode() == KeyEvent.VK_A){
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            x++;
        }
        //让面板重新绘制
        this.repaint();

    }

/*
当某个键被松开时，该方法会被触发
 */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}