package yichang.zuoye;

import java.util.Scanner;

/**
 * @author czq
 * @version 1.0
 */
public interface Homework {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        String name = null;
        String mima = null;
        String youxiang = null;
        try {
            System.out.println("请输入用户名:");
            name = myscanner.next();
            if (name.length() == 2 || name.length() == 3 || name.length() == 4) {

            } else {
                System.out.println("名字长度为2~4");
                 throw new RuntimeException();

            }
            System.out.println("请输入密码:");
            mima = myscanner.next();
            Integer.parseInt(mima);
            if (mima.length() == 6) {

            } else {
                throw new RuntimeException();
            }
            System.out.println("请输入邮箱:");
            youxiang = myscanner.next();
            if (youxiang.indexOf("@") != -1 && youxiang.indexOf(".") != -1 && youxiang.indexOf("@") < youxiang.indexOf(".")) {

            } else {
                throw new RuntimeException();
            }
            System.out.println("注册成功!" + "名字 ：" + name + " 密码: " + mima + " 邮箱: " + youxiang);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }


    }


}
