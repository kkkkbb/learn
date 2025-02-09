package jihe;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author czq
 * @version 1.0
 */
public class A {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("jack");
        arrayList.add(100);
        arrayList.add(true);

        arrayList.remove("jack");

        System.out.println(arrayList);
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


        for(Object a:arrayList){
            System.out.println(a);
        }
    }
}
