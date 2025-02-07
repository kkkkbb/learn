package yichang.yi02;

import java.util.Scanner;

/**
 * @author czq
 * @version 1.0
 */
public class B {

    public static void main(String[] args) {


        Scanner myscanner = new Scanner(System.in);

        String shu;
        boolean loop = true;
        while(loop){
            System.out.println("亲输入一个整数：");

            shu = myscanner.next();

            try {
                int num = Integer.parseInt(shu);
                loop = false;

            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }


        }

    }
}
