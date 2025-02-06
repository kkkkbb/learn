package meiju;

/**
 * @author czq
 * @version 1.0
 */
public class Season {//自定义枚举类

    private String name;
    private String desc;

    public final static Season chuntian = new Season("春天","温暖");
    public final static Season xiatian = new Season("夏天","温暖");
    public final static Season qiutian = new Season("秋天","温暖");
    public final static Season dongtian = new Season("东天","温暖");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }



    public String getDesc() {
        return desc;
    }


//    public String toString() {
//        System.out.println("" +
//                "" +
//                "" +
//                "" +
//                "");
//    }
}


