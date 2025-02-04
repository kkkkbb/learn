package com.jicheng;

public class ExtendsExercise03 {
    public static void main(String[] args) {

        Pc pc = new Pc();
        NotePad notePad = new NotePad();
        pc.brand = "苹果";
        notePad.color = "白色";
        pc.CPU = "英特尔";
        pc.yingpan = "闪迪";
        pc.neicun = "西数";
        notePad.CPU = "ytr";
        notePad.neicun = "xs";
        notePad.yingpan = "sd";

        pc.getDetails();
        System.out.println("pc的品牌 : " + pc.brand);
        notePad.getDetails();
        System.out.println("note的颜色 : " + notePad.color);
    }
}


class Computer{
    String CPU;
    String neicun;
    String yingpan;

    public void getDetails(){
        System.out.println("CPU: " + CPU + " 内存: " + neicun + " 硬盘:" + yingpan);
    }
}

class Pc extends Computer{
    String brand;
}

class NotePad extends Computer{
    String color;
}

