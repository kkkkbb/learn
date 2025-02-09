package jihe.zuoye2;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author czq
 * @version 1.0
 */
public class B {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 10; i++) {
            arrayList.add("hello");
        }

        arrayList.add(1,"韩顺平教育");
        System.out.print(arrayList + " ");
        System.out.println();
        System.out.print(arrayList.get(4));
        System.out.println();
        arrayList.remove(5);
        System.out.print(arrayList + " ");
        System.out.println();
        arrayList.set(6,"czq");
        System.out.print(arrayList + " ");
        System.out.println();

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

            System.out.print(next + " ");
        }


    }

}
