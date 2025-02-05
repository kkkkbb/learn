package com.duotai.anli1;

public class Test {
    public static void main(String[] args) {
        Employee e = new jingli("czq",450,1200);
        Employee ee = new yuangong("czqqq",650);
        Test t = new Test();
        t.showEmpAnnal(e);
        t.showEmpAnnal(ee);
        t.testWork(e);
        t.testWork(ee);
    }


    public void showEmpAnnal(Employee e){
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof yuangong){
            ((yuangong) e).work();
        }
        else if(e instanceof jingli){
            ((jingli) e).manage();
        }

    }
}
