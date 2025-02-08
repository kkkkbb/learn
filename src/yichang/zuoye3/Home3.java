package yichang.zuoye3;

import java.util.Scanner;

/**
 * @author czq
 * @version 1.0
 */
public class Home3 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        String name = "c z q";

        String[] name1 =   name.split(" ");;

        StringBuffer b = new StringBuffer();

            System.out.println(b.append(name1[2]).append(",").append(name1[0]).append(".").append(name1[1]));

    }
}
