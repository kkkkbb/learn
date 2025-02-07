package meiju.zuoye5;

/**
 * @author czq
 * @version 1.0
 */
class Test{
    public static void main(String[] args) {
        A a = new A();
        a.b();
    }
}
public class A {

    private String name = "czq";
    public void b(){
        class B{
            private final String name = "jjb";

            public void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }


}
