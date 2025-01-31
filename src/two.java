public class two {
    public static void main(String[] args){
        float num1 = 1.1f;
        /*
        浮点数默认为double型
         */
        System.out.println(num1);
        /*
        浮点数陷阱
         */
        float num2 = 2.7f;
        double num3 = 8.1 / 3.0;
        System.out.println(num2 + " " + num3);
        /*
        正确的做法应该是计算两个数的差值的绝对值，在某个精度范围内判断
         */
        if(Math.abs(num2 - num3) < 0.0001) {
            System.out.println("相同");
        }
        /*
        演示char的使用 只有用单引号才表示字符
         */
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '陈';
        char c4 = 97;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println((int)c4);
        /*
        ASCLL
        UNICODE
        UTF-8
         */


        boolean isPass = false;
        if(isPass == true){
            System.out.println("恭喜发财");
        }
        else{
            System.out.println("对不起");
        }
        /*
        精度小的类型会自动转换为精度大的数据类型
        强转符号只对最近的操作数///`\
                 */
        int n1 = (int)1.88;
        System.out.println(n1);
        /*
        0
        1
        1
        0
         */


        /*
        基本数据类型转字符串

         */

        int q1 = 100;
        float q2 = 1.2f;
        double q3 = 1.5;
        boolean t = true;


        String s1 = q1 + "";
        String s2 = q2 + "";
        String s3 = q3 + "";
        String s4 = t + "";


        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);


        int e1 = Integer.parseInt(s1);//字符串类型转成int

        System.out.println(s1.charAt(0));//得到s1的第一个字符

        char a1 = '\n';
        char a2 = '\t';
        char a3 = '\r';
        char a4 = '\\';
        char a5 = 1;
        char a6 = 2;
        char a7 = 3;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);//
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);

    System.out.println("姓名\t年龄\t成绩\t性别\t爱好" + "\n" + "xx\txx\txx\txx\txx");
    }
}
