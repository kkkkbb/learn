package yichang.yi02;

import java.util.Scanner;

/**
 * @author czq
 * @version 1.0
 */
public class StringBufferExercise02 {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("请输入商品名称:");

        String name = myscanner.next();

        System.out.println("请输入商品价格:");

        StringBuffer price = new StringBuffer(myscanner.next());


            for (int i = price.indexOf(".") - 3; i > 0; i -= 3) {

                    price.insert(i, ",");

            }

        System.out.println("商品名\t价格");
        System.out.println(name + "\t" + price);


    }
}
