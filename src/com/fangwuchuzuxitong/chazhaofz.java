package com.fangwuchuzuxitong;

import java.util.Scanner;

public class chazhaofz {

    public void chazhao(fangzi[] f , int j){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("-------------------添加房屋-------------------");
        System.out.println("请输入你要查找的id：");
        int i = myscanner.nextInt();
        if(i < 0 || f[i-1] == null){
            System.out.println("房屋不存在，查找失败!");
            return ;
        }
        else if(i > j){
            System.out.println("-------------------没有该房屋-------------------");
        }
        System.out.println(f[i-1].id + "\t" + f[i-1].name + "\t" + f[i-1].phone + "\t" + f[i-1].dizhi + "\t" + f[i-1].yuezu
         + "\t" + f[i-1].zhuangtai);




    }


}
