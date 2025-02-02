import java.util.Scanner;
public class four {

    public static void main (String[] args) {

        Scanner myscanner = new Scanner(System.in);
//        System.out.println("请输入a~g字符：");
//        char ch = myscanner.next().charAt(0);
//
//        switch(ch){
//            case 'a':
//                System.out.println("星期一");
//                break;
//            case 'b':
//                System.out.println("星期二");
//                break;
//            case 'c':
//                System.out.println("星期三");
//                break;
//            case 'd':
//                System.out.println("星期四");
//                break;
//            case 'e':
//                System.out.println("星期五");
//                break;
//            case 'f':
//                System.out.println("星期六");
//                break;
//            case 'g':
//                System.out.println("星期日");
//                break;
//            default:
//                System.out.println("输入错误!");
//                break;
//        }

//        System.out.println("请输入a~e：");
//
//        char ch = myscanner.next().charAt(0);
//
//        switch(ch){
//            case 'a':
//                System.out.println("A");
//                break;
//            case 'b':
//                System.out.println("B");
//                break;
//            case 'c':
//                System.out.println("C");
//                break;
//            case 'd':
//                System.out.println("D");
//                break;
//            case 'e':
//                System.out.println("E");
//                break;
//            default:
//                System.out.println("other");
//        }


//        System.out.println("请输入学生成绩:");
//        int n = myscanner.nextInt();
//        int m = n / 60;
//        if(n <= 100 && n >= 0){
//
//            switch(m){
//                case 1:
//                    System.out.println("合格");
//                    break;
//                case 0:
//                    System.out.println("不合格");
//                    break;
//            }
//        }

//        System.out.println("指定一个月份:");
//
//        int n1= myscanner.nextInt();
//
//        switch(n1){
//            case 1:
//
//            case 2:
//                System.out.println("冬季");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("春季");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("夏季");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("秋季");
//                break;
//            case 12:
//                System.out.println("冬季");
//                break;
//        }

    /*
    for循环
    for(i = 1; i < 100 ;i++)
     */
//        int num = 0;
//        int he = 0;
//        for(int i = 1 ; i <= 100 ; i++){
//            if(i % 9 == 0){
//                num += 1;
//                he += i;
//                System.out.println(i + "  个数:" + num + "总和:" + he);
//            }
//        }
//

//        for(int i = 0, j = 5; j >= 0; i++ ,j--){
//            System.out.println(i + " + " + j + " = " +(i + j) );
//        }

//        int i = 1;
//        while(i <= 100){
//
//            if(i % 3 == 0){
//                System.out.println(i);
//
//            }
//            i++;
//        }
//        int j = 40;
//        while(j <= 200){
//            if(j % 2 == 0){
//                System.out.println(j);
//            }
//            j++;
//        }

//        int i = 0;
//        do{
//
//            System.out.println("czq");
//            i++;
//        }while(i < 10);

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//
//        } while (i <= 100);




//        int i = 1;
//        int count = 0;
//        do {
//            count += i;
//            i++;
//
//        } while (i <= 100);
//        System.out.println(count);



//        int i = 1;
//        int num = 0;
//        do{
//            if(i % 5==0 && i % 3 != 0){
//                num++;
//            }
//            i++;
//        }while(i <= 200);
//        System.out.println(num);


//    char ch = ' ';
//    do{
//        System.out.println("你换钱吗！！！y/n");
//        ch = myscanner.next().charAt(0);
//        if(ch == 'n')
//        System.out.println("不还钱打死你呀呀呀呀呀呀呀");
//    }while(ch != 'y');

//    int p = 0;
//    int score = 0;
//    double num = 0;
//    double zong = 0;
//    for(int i = 0; i < 3 ; i++){
//        for(int j = 0 ;j < 5 ; j++){
//            System.out.println("请输入" +(i+1)  + "班同学" + (j+1) + "的成绩:");
//            score = myscanner.nextInt();
//            if(score > 60 && score <=100){
//                p++;
//            }
//            if(score <= 100 && score >=0)
//                num += score;
//            else{
//                System.out.println("成绩输入错误");
//            }
//        }
//        System.out.println((i+1) + "班级的平均分为:" + (num / 5.0));
//        zong += num;
//        num =0;
//    }
//    System.out.println("三个班级的平均分为:" + (zong / 15.0));
//    System.out.println("三个班级及格人数为:" + p);




//    for(int i = 1; i <10 ; i++){
//        for(int j = 1 ; j <= i ; j++) {
//            System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//        }
//        System.out.println();
//    }


//        int num = 0;
//        System.out.println("请输入层数:");
//        num = myscanner.nextInt();
//        for(int i = 0 ; i < num ; i++ ){
//            for(int p = 0 ; p <= num-i; p++){
//                System.out.print(" ");
//            }
//            for(int j = 0 ; j < (1 + (i * 2)) ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        空心金字塔
         */
//        int num = 0;
//        System.out.println("请输入层数:");
//        num = myscanner.nextInt();
//        for(int i = 1 ; i <= num ; i++ ){
//            for(int p = 1 ; p <= num-i; p++){
//                System.out.print(" ");
//            }
//
//                for(int j = 1 ; j <=  (i * 2) -1  ; j++){
//                   if(j == 1 || j == (i * 2)-1)
//                        System.out.print("*");
//                   else
//                        System.out.print(" ");
//                }
//
//            System.out.println();
//        }
//



        //空心菱形
        int num2 = 0;
        System.out.println("请输入层数(只能奇数层):");
        num2 = myscanner.nextInt();
        int num = (num2 +1) /2;
        for(int i = 1 ; i <= num ; i++ ){
                for(int p = 1 ; p <= num-i; p++){
                    System.out.print(" ");
                }

                for(int j = 1 ; j <=  (i * 2) -1  ; j++){
                    if(j == 1 || j == (i * 2)-1 )
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            System.out.println();
                if(i == num){
                        for(int a = num - 1 ; a >= 1 ; a-- ){
                            for(int p = num-a ; p >= 1 ; p--){
                                System.out.print(" ");
                            }

                            for(int j = (a * 2) -1  ; j >= 1   ; j--){
                                if(j == 1 || j == (a * 2)-1 )
                                    System.out.print("*");
                                else
                                    System.out.print(" ");
                            }
                            System.out.println();
                    }
                }

            }
        }
}

