package com.fangwuchuzuxitong;

import java.util.Scanner;

public class shanchufz {

    public fangzi[] shanchu(fangzi[] f , int j){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("-------------------删除房屋-------------------");
        System.out.println("请选择待删除房屋编号( - 1退出)：");
        int i = myscanner.nextInt();
        if( i == -1 ){
            System.out.println("退出程序.");
            return null;
        }
        else {
            if(i < -1 || i > j || f[i-1] == null){
                System.out.println("房屋不存在.");
                return null;
            }
            f[i-1] = null;
            System.out.println("-------------------删除完成-------------------");
            return f;
        }


    }


}
