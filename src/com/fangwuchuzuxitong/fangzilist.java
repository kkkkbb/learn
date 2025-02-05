package com.fangwuchuzuxitong;

public class fangzilist {

    public void chakan(fangzi[] f,int j ){

        System.out.println("-------------------房屋列表-------------------");
        System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租/已出租）\t");


            for (int i = 0; i < j; i++) {
                if(f[i] == null){
//                    f[i] = new fangzi(i+1,null,null,null,0,null);
//                    System.out.println("\n" + f[i].id + "\t" + f[i].name + "\t" + f[i].phone + "\t" + f[i].dizhi
//                            + "\t" + f[i].yuezu + "\t" + f[i].zhuangtai);
                    System.out.println("\n" + (i+1));
                }
                else {
                    System.out.println("\n" + f[i].id + "\t" + f[i].name + "\t" + f[i].phone + "\t" + f[i].dizhi
                            + "\t" + f[i].yuezu + "\t" + f[i].zhuangtai);
                }

            }

        System.out.println("-------------------房屋列表完成-------------------");



    }



}
