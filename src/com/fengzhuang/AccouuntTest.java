package com.fengzhuang;

public class AccouuntTest {
    public static void main(String[] args) {

        Account a = new Account("czq",566,"121212");
        a.info();
    }
}


class Account{
    public String name;
    private double my;
    private String mima;
    public String getName() {

        return name;
    }

    public Account(String name, double my, String mima) {
        setName(name);
        setMy(my);
        setMima(mima);
    }

    public void setName(String name) {
        if(name.length() == 2 || name.length() == 3 || name.length() == 4){
        this.name = name;
        }
        else{
            System.out.println("你输入的名字必须为 2 3  4 位字符");
            this.name = " null";
        }
    }

    public double getMy() {
        return my;
    }

    public void setMy(double my) {
        if(my > 20){
        this.my = my;}
        else{
            System.out.println("你输入的余额必须大于20");
            this.my = 21;
        }
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        if(mima.length() == 6){
        this.mima = mima;}
        else{
            System.out.println("你输入的密码必须是6位");
            this.mima = "000000";
        }
    }

    public void info(){
        System.out.println("名字:" + name + " 钱： " + my + " 密码: " + mima );
    }


}

