package yichang.yi02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author czq
 * @version 1.0
 */
public class C {


    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            System.out.println((int)(2 + Math.random() * 6));
        }
        Integer[] i = {1,0,45,-78,89};

        Arrays.sort(i,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Integer n1  = (Integer) o1;
                Integer n2  = (Integer) o2;
                return n1-n2;
            }
        });
        System.out.println(Arrays.toString(i));
    }
}
