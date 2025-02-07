package meiju.zuoye4;

/**
 * @author czq
 * @version 1.0
 */
class Test{
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new jisuan(){
            @Override
            public void js() {
                System.out.println("计算完成");
            }
        });
    }
}
public class Cellphone {

    public void testWork(jisuan j){
        j.js();
    }

}
class jisuan{
    public   void  js(){
        System.out.println("开始运算");
    }
}

