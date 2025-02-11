package tantedazhan.tankegame03;

import javax.swing.*;

/**
 * @author czq
 * @version 1.0
 */
public class main_ extends JFrame {

    MyPanel myPanel = null;
    public static void main(String[] args) {

        new main_();


    }


    public main_(){
        myPanel = new MyPanel();
        Thread thread = new Thread(myPanel);
        thread.start();

        this.add(myPanel);

        this.setSize(1000,750);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
