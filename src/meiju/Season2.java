package meiju;

/**
 * @author czq
 * @version 1.0
 */

 class A{
    public static void main(String[] args) {

        Season2 s = Season2.chuntian;
        System.out.println(s.name());

        Season2[] value = Season2.values();

        for(Season2 i : value){
            System.out.println(i);
        }

    }
}


enum  Season2 {
    chuntian("春天","温暖"),xiatian("夏天","炎热");

    private String name;
    private String desc;

//    public final static Season chuntian = new Season("春天","温暖");
//    public final static Season xiatian = new Season("夏天","温暖");
//    public final static Season qiutian = new Season("秋天","温暖");
//    public final static Season dongtian = new Season("东天","温暖");


    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
