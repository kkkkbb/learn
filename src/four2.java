import java.util.Scanner;
public class four2 {
    public static void main(String[] args){
//        int sum = 0;
//        abc1: for(int i = 1; i <=100; i++) {
//                sum  += i;
//                if(sum > 20){
//                    System.out.println(i);
//                    break;
//                }
//
//        }

//        Scanner myscanner = new Scanner(System.in);
//
//        String st = "";
//        String mima = "";
//        for(int i = 3;i >= 0 ; i--){
//            System.out.println("请输入您的账号");
//            st = myscanner.nextLine();
//            System.out.println("请输入您的密码");
//            mima = myscanner.nextLine();
//            if(st.equals("丁真") && mima.equals("666")) {
//                System.out.println("登陆成功!!");
//                break;
//            }
//            else{
//                System.out.println("账号不存在，还有" + i + "次机会.");
//            }
//        }

//        double my = 100000;
//        int num = 0;
//        while(true){
//            if(my > 50000){
//                my = my - my * 0.05;
//                num++;
//            }
//            else if(my <= 50000 && my >= 1000){
//                my = my -1000;
//                num++;
//            }
//            else{
//                System.out.println("你已经没有钱了.不能在过马路");
//                break;
//            }
//        }
//        System.out.println("一共可以经过" + num + "次马路");//62


//        Scanner myscanner = new Scanner(System.in);
//
//        int i = 0;
//        do{
//            System.out.println("请输入一个整数，判断特属于那个范围:");
//            i = myscanner.nextInt();
//            if(i > 0){
//                System.out.println("该整数>0");
//            }
//            else if(i < 0){
//                System.out.println("该整数<0");
//            }
//            else{
//                System.out.println("该整数=0");
//            }
//            break;
//        }while(true);


        Scanner myscanner = new Scanner(System.in);


//        int year = 1;
//        while(year > 0){
//            System.out.println("请输入一个年份，判断他是否为闰年!");
//            year = myscanner.nextInt();
//            if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0){
//                System.out.println("该年份为闰年");
//            }
//            else {
//                System.out.println("该年份不为闰年");
//            }
//            break;
//        }

//        int num = 0;
//
//        while(true){
//            System.out.println("请输入一个3位数字:");
//            num = myscanner.nextInt();
//            int n1 = num / 100;//百位
//            int n2 = (num / 10) % 10;//十位
//            int n3 = num % 10;//个位
//            if(num > 99 && num <= 999){
//                if(num == (n1 * n1 * n1) + (n2 * n2 * n2) + (n3 * n3 *n3)){
//                    System.out.println("该数是水仙花数");
//                }
//                else{
//                    System.out.println("该数不是水仙花数");
//                }
//            }
//            else{
//                System.out.println("输入的不是三位数字.");
//            }
//            break;
//        }


        /*
        什么也不输出
         */


//        int num = 0;
//        for(int i = 1;i <= 100 ;i++){
//            if( i % 5 != 0){
//                System.out.print(i + " ");
//                num++;
//            }
//            if(num % 5 == 0){
//                System.out.println();
//            }
//        }


//        char ch = 64;
////        System.out.println(ch);
//        for(int i = 1 ; i <= 26 ; i++){
//
//            System.out.print((char)(ch + i) + " ");
//
//            System.out.print((char)(ch + 32 + i) + "\n");
//
//        }


//        double num = 0;
//        for(int i = 1 ; i <= 100 ; i ++){
//            if(i % 2 != 0){
//                num += 1.0/i;
//            }

//            else
//                num -= 1.0/i;//0.688172179310195
//        }
//        System.out.println(num);




//        int num = 0;
//        int zong = 0;
//        for(int i = 1 ; i <= 100 ; i++){
//            num  += i;
//            zong += num;
//        }
//        System.out.println(zong);
    }
}
