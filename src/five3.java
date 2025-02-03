public class five3 {
    public static void main(String[] args){

        AA a = new AA();
        boolean b = a.Pd(-9);
        System.out.println(b);

        a.zifu(3,4);
//        Person p = new Person();
//        p.age = 18;
//        p.name = "czq";
//
//        Person s = a.copyPerson(p);
//        System.out.println(p.age + p.name);
//        System.out.println(s.age + s.name);

//        a.fB(5);
        System.out.println(a.fB(7));
        System.out.println(a.taozi(1));
    }
}

class Person{
    int age;
    String name;
}

class AA{

    public boolean Pd(double num){
        if(num % 2 == 0 ){
            return true;
        }
        else{
            return false;
        }
        //return num % 2 == 0 ? false : true;
    }

    public void zifu(int num1,int num2){
        for(int i = 0; i < num1 ; i++){
            for(int j = 0; j < num2 ;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }


//    public int[][] two(int[][] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
//        return
//    }


    public Person copyPerson(Person p){
        Person s = new Person();

        s.name = p.name;
        s.age = p.age;

        return s;
    }

    public int fB(int num){
        if(num ==1 || num == 2) {
            return 1;
        }
        else{
            return fB(num - 1) + fB(num - 2);
        }
    }



    public int taozi(int num){
        if(num == 10){
            return 1;
        }
        else if(num >= 1 && num <= 9) {
            return (taozi(num + 1) + 1) * 2;
        }
        else {
            return -1;
        }
    }
}