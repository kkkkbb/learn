package yichang.yi01;

/**
 * @author czq
 * @version 1.0
 */
public class A {
    public static void main(String[] args) {
        int num1 = 1;

        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("出现异常的信息" + e.getMessage());
        }
        System.out.println("asdasdsadasd");
    }
}
