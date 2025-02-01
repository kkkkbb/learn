
import java.util.Scanner;
public class three {
    public static void main(String[] args){
        System.out.println(10 / 4);
        System.out.println(10.0 / 4);

        double d = 10 / 4;
        System.out.println(d);


        /*
        取模公式: a % b = a - a / b * b
         */
        int i = 1;
        i = i++;
        System.out.println(i);


        System.out.println(59 / 7 + "个星期" + 59 % 7 + "天");

        System.out.println("温度为:" + 5.0 / 9 * (234.5 - 100));

        /*
        a&b a&&b A|b a||b !a A^b
         */

        int a = 4;
        int b = 6;
        if(a < 1 & ++b < 50){
            System.out.println("ddddddd");
        }
        System.out.println(b);

        /*
        复合运算会进行类型转换
         */

        /*
        条件表达式？表达式1：表达式2如果为真返回1 如果为假返回2
         */

        int n1 = 55;
        int n2 = 33;
        int n3 = 120;

        System.out.println("三个数之中最大的为：" + (n1 > (n2 > n3 ? n2: n3) ? n1 :(n2 > n3 ? n2: n3)));

        System.out.println(-1 >> 2);
        System.out.println(-10.4 % 3);

        String s = "18";
        double ds = Double.parseDouble(s);

        char c1 = '陈';
        String s2 = c1 + "";

//        Scanner myscanner = new Scanner(System.in);
//        System.out.println("请输入你的年龄:");
//        int age = myscanner.nextInt();
//
//        if(age > 18 ){
//            System.out.println("你应该进监狱");
//        }
//        else{
//            System.out.println("你的年龄不大，不用进监狱");
//        }
        Scanner myscanner = new Scanner(System.in);
//        System.out.println("请输入两个浮点数");
//        double d1 = myscanner.nextDouble();
//        double d2 = myscanner.nextDouble();
//
//        if(d1 > 10 && d2  < 20){
//            System.out.println("两数之和为:" + (d1 + d2));
//        }
//        System.out.println("请输入m1的值");
//        int m1 = myscanner.nextInt();
//        System.out.println("请输入m2的值");
//        int m2 = myscanner.nextInt();
//        if( (m1 + m2) % 5  ==0 && (m1 + m2) % 3 ==0){
//            System.out.println("能被5和3整除");
//        }
//        else{
//            System.out.println("不能被5和3整除");
//        }

//        System.out.println("输入一个年份:");
//        int m3 = myscanner.nextInt();
//
//        if((m3 % 4 == 0 && m3 % 100 != 0) || m3 % 400 ==0){
//            System.out.println("是闰年>>");
//        }
        System.out.println("请输入性别:");
        String s3 = myscanner.nextLine();
        System.out.println("请输入成绩:");
        double d5 = myscanner.nextDouble();

        if(d5 > 8.0){
            if(s3.equals( "男")){
                System.out.println("进入男子组");
            }
            else if(s3.equals( "女")){
                System.out.println("进入女子组");
            }
            else{
                System.out.println("输入错误性别");
            }
        }
        else{
            System.out.println("淘汰");
        }
    }
}
