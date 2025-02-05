package com.fangwuchuzuxitong;

import java.util.Scanner;

public class zengjiafz{

    public void  zengjia(fangzi[] f,int j){

        Scanner myscanner = new Scanner(System.in);

        System.out.println("-------------------添加房屋-------------------");
        System.out.print("姓名:");
        String name = myscanner.next();
        System.out.print("电话:");
        String phone = myscanner.next();
        System.out.print("地址:");
        String dizhi = myscanner.next();
        System.out.print("月租:");
        double yuezu = myscanner.nextDouble();
        if(yuezu < 0){
            System.out.println("-------------------添加失败-------------------");
            System.out.println("月租状态错误");
            return ;
        }
        System.out.print("状态:(已出租/未出租)");
        String zhuangtai  = myscanner.next();
        if(zhuangtai.equals("未出租") || zhuangtai.equals("已出租")) {
            System.out.println("-------------------添加成功-------------------");
            if(f[j] == null){
                f[j] = new fangzi(j+1,name,phone,dizhi,yuezu,zhuangtai);
            }
            else{
            f[j].name = name;
            f[j].id = j+1;
            f[j].dizhi = dizhi;
            f[j].yuezu = yuezu;
            f[j].zhuangtai = zhuangtai;}
        }

        else{
            System.out.println("-------------------添加失败-------------------");
            System.out.println("房屋状态错误");
            return ;
        }

    }

}
