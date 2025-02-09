package jihe.zuoye7;

import java.util.*;

/**
 * @author czq
 * @version 1.0
 */
public class A {
    public static void main(String[] args) {

        HashMap m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);

        System.out.println(m);
        m.put("jack",2600);
        System.out.println(m);
        Set s = m.keySet();
//        for (int i = 0; i <s.size(); i++) {
//            (String)s;
//            System.out.println(s);
//        }

        Set enter = m.entrySet();
        Iterator iterator = enter.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry)iterator.next();
            System.out.println(next.getKey() + " " + next.getKey());
        }
    }
}
