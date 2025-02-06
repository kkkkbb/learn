package meiju.zuoye1;

/**
 * @author czq
 * @version 1.0
 */


class A{
    public static void main(String[] args) {

        Week[]  week = Week.values();
        System.out.println("所有星期的信息如下");
        for(Week w : week){
            System.out.println(w);
        }


    }
}
enum Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三")
    ,THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期七");

    private String day;

    Week(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return
                 day + '\n'
                ;
    }
}
