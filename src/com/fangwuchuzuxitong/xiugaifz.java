package com.fangwuchuzuxitong;

import java.util.Scanner;

public class xiugaifz {

    public fangzi[] xiugai(fangzi[] f,int j){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("-------------------修改房屋-------------------");
        System.out.println("请选择待修改房屋编号(-1)退出");

        int i = myscanner.nextInt();
        if( i == -1){
            System.out.println("退出程序.");
            return null;
        }
        else {
            if(i < -1 || i > j || f[i-1] == null){
                System.out.println("房屋不存在.");
                return null;
            }
            System.out.print("姓名" + f[i-1].name  + ":");
            f[i-1].name = myscanner.next();
            System.out.print("电话" + f[i-1].phone+ ":");
            f[i-1].phone = myscanner.next();
            System.out.print("地址" + f[i-1].dizhi+ ":");
            f[i-1].dizhi = myscanner.next();
            System.out.print("月租" + f[i-1].yuezu+ ":");
            double  yuezu  =  myscanner.nextDouble();
            if(yuezu < 0 ){
                System.out.println("-------------------添加失败-------------------");
                System.out.println("月租状态错误");
                return null;
            }
            f[i-1].yuezu = yuezu;
            System.out.print("状态" +f[i-1].zhuangtai+ ":" );
            String zhuangtai = myscanner.next();
            if(zhuangtai.equals("未出租                                                                                                                                                                                                                                                                                                                                                                                                                                                              ") || zhuangtai.equals("已出租")) {
                f[i-1].zhuangtai  = zhuangtai;
            }

            else{
                System.out.println("-------------------添加失败-------------------");
                System.out.println("房屋状态错误");
                return null;
            }

            System.out.println("-------------------修改完成-------------------");
            return f;
        }

    }


}
