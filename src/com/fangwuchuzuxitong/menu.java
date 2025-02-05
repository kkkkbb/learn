package com.fangwuchuzuxitong;

import java.util.Scanner;

public class menu {


    public void menu_(){
        Scanner myscanner = new Scanner(System.in);
        fangzi[] f = new fangzi[500];
        int j = 0;
        int i;
//        boolean loop = true;
        do{
            System.out.println("-------------------房屋出租系统-------------------");
            System.out.println("                  1.新增房源");
            System.out.println("                  2.查找房源");
            System.out.println("                  3.删除房屋");
            System.out.println("                  4.修改房屋信息");
            System.out.println("                  5.房屋列表");
            System.out.println("                  6.退    出");

            System.out.println("请输入 1 ~6 ：");
            i = myscanner.nextInt();
            if(i >= 1 && i <= 6){
                switch(i){
                    case 1:
                        new zengjiafz().zengjia(f,j);
                        j++;
                        break;
                    case 2:
                        new chazhaofz().chazhao(f,j);
                        break;
                    case 3:
                        f = new shanchufz().shanchu(f,j);
                        break;
                    case 4:
                        f = new xiugaifz().xiugai(f,j);
                        break;
                    case 5:
                        new fangzilist().chakan(f,j);
                        break;
                    case 6:
                        char ch = myscanner.next().charAt(0);
                        boolean b = true;
                        while (b){
                            System.out.println("请输入你的选择Y/N");
                            if(ch == 'N'){
                                b = false;
                            }
                            else if(ch == 'Y'){
                                System.out.println("你退出了程序~~");
                                return;
                            }
                            else{
                                System.out.println("选择错误，请重新输入:");
                            }

                        }

                }
            }
            else{
                    System.out.println("你输入的数字不在1~6之间请重新输入.");
                }

        }while(true);
    }

}
