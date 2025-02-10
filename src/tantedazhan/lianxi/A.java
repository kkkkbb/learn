package tantedazhan.lianxi;

import javax.swing.*;
import java.awt.*;

/**
 * @author czq
 * @version 1.0
 */
public class A extends JFrame{

    Mypanel mypanel = null;
    public static void main(String[] args) {

        new A();

    }

    public A(){
        mypanel = new Mypanel();

        this.add(mypanel);

        this.setSize(400,300);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class Mypanel extends JPanel{


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("方法被调用");
//        g.drawOval(10,10,100,100);

//        Image image = Toolkit.getDefaultToolkit().getImage(Mypanel.class.getResource("/mmp.png"));
//        g.drawImage(image,100,100,1288,637,this);
        g.setColor(Color.BLACK);//左轮子
        g.drawRect(50,50,20,120);
        g.setColor(Color.BLUE);
        g.fillRect(50,50,20,120);
        g.setColor(Color.BLUE);//身体
        g.fillRect(70,70,40,80);
        g.setColor(Color.BLACK);
        g.drawRect(70,70,40,80);
        g.setColor(Color.BLACK);//右轮子
        g.drawRect(110,50,20,120);
        g.setColor(Color.BLUE);
        g.fillRect(110,50,20,120);
        g.setColor(Color.yellow);//身体的盖子
        g.fillOval(70,90,40,40);
        g.setColor(Color.BLACK);
        g.drawOval(70,90,40,40);
        g.setColor(Color.yellow);//枪管子
        g.fillRect(90,49,2,40);
        g.setColor(Color.BLACK);
        g.drawRect(90,49,2,40);
    }


}
