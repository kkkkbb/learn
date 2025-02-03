public class five {
    public static void main(String[] args) {

//        int[] arr = new int[10];
//        for(int i = 0; i < 10; i ++){
//            int sui = (int)(Math.random() * 100 + 1 );
//
//            arr[i] = sui;
//
//        }
//        double num = 0;
//        int n= arr[0];
//        int index = -1;
//        int index2 = -1;
//        for(int i = arr.length - 1 ; i >= 0  ; i--){
//            System.out.print(arr[i] + " ");
//            num += arr[i];
//
//
//            if(n < arr[i]) {
//                int temp = arr[i];
//                arr[i] = n;
//                n = temp;
//                index = i;
//            }
//            if(arr[i] == 8){
//                index2 = 1;
//                System.out.println("里面有八");
//            }
//
//        }
//        if(index2 == -1){
//            System.out.println("里面没有8：");}
//        System.out.println("平均值为: " + (num / 10));
//    }





        int[] arr = {1,5,4,8,9,7,6,2,3};
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length - 1 - i ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
