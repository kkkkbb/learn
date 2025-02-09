package jihe.zuoye6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @author czq
 * @version 1.0
 */
public class A {
    public static void main(String[] args) {
        xinwen x1 = new xinwen("新冠确诊病例超千万，数百万印度教信徒赶赴恒河“圣浴” 引民众担忧");
//        x1.setNeirong("新冠确诊病例超千万，数百万印度教信徒赶赴恒河“圣浴” 引民众担忧");
        xinwen x2 = new xinwen("男子突然想起2个月前钓的鱼还在网兜里，捞起来一看赶紧放生");
//        x2.setNeirong("男子突然想起2个月前钓的鱼还在网兜里，捞起来一看赶紧放生");


        ArrayList arrayList = new ArrayList();
        arrayList.add(x1);
        arrayList.add(x2);

        for (int i = arrayList.size()-1; i >= 0 ; i--) {
            xinwen x = (xinwen)(arrayList.get(i));

            if(x.getName().length() > 15){

                    x.setName(x.getName().substring(0,15) + "...");

            }
            arrayList.add(i,x);
            System.out.println(arrayList.get(i));
        }


    }
}
class xinwen{
    private String name;
    private String neirong;

    @Override
    public String toString() {
        return "xinwen{" +
                "name='" + name + '\'' +
                '}';
    }

    public xinwen(String name) {
        this.name = name;
//        this.neirong = neirong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }
}