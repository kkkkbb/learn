package jihe.zuoye5;

import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author czq
 * @version 1.0
 */
public class D {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("1",new Emp("czq",2300,"1"));
        hashMap.put("2",new Emp("wzq",27800,"1"));
        hashMap.put("3",new Emp("cgzq",200,"1"));
        hashMap.put("4",new Emp("cwadzq",300,"1"));

        Set set = hashMap.keySet();
        for(Object s:set){
            Emp e = (Emp)(hashMap.get(s));
            if(e.getSal() > 18000){
                System.out.println(hashMap.get(s));
            }
        }

        Collection c = hashMap.values();
        for(Object o:c){
//            Emp e = (Emp)(hashMap.get(o));
//            if(e.getSal() > 18000){
//                System.out.println(hashMap.get(o));
//            }
            System.out.println(o);
        }


        TreeSet treeSet = new TreeSet();
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println(treeSet);
    }
}
    class Emp{
    private String name;
    private double sal;

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", sal=" + sal +
                    ", id='" + id + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        private String id;

    public Emp(String name, double sal, String id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }
}
