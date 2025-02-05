package com.zuoye.di4ti;

public class yuangong {

    String name;

    double sarlay;

    int time;

    public yuangong(String name, double sarlay, int time) {
        this.name = name;
        this.sarlay = sarlay;
        this.time = time;
    }

    public void dayingongzi(){
        System.out.println("姓名： " + name + " 工资 :"  + sarlay*time );
    }



}


class bumenjingli extends yuangong{


    double jibie = 1.2;

    public bumenjingli(String name, double sarlay, int time) {
        super(name, sarlay, time);

    }

    @Override
    public void dayingongzi() {
        System.out.println("姓名： " + name + " 工资 :"  + (1000 + sarlay*time*1.2) );
    }
}

class putongyuangong extends yuangong{
    double jibie = 1.0;

    public putongyuangong(String name, double sarlay, int time) {
        super(name, sarlay, time);
    }

    @Override
    public void dayingongzi() {
        System.out.println("姓名： " + name + " 工资 :"  + sarlay*time*1.0 );
    }
}

















































