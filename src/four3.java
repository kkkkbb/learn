import java.util.Scanner;
public class four3 {
    public static void main(String[] args){
        Scanner myscanner = new Scanner(System.in);

//        double[] num = new double[5];
//
//        System.out.println("输入5个数据保存到double中:");
//       for(int i = 0; i < num.length ; i ++) {
//
//           num[i] = myscanner.nextDouble();
//
//       }
//        for(int i = 0 ; i < num.length ; i++){
//
//            System.out.print(num[i] + " ");
//        }

//        char[] ch = new char[26];
//
//        for(int i = 0; i < ch.length ; i++){
//            ch[i] = (char)('A' + i);
//        }
//        for(int i = 0; i < ch.length ; i++){
//            System.out.print(ch[i]);
//        }
//

//        int[] n = {4,-1,9,10,23};
//        int max = n[0];
//        int xia = 0;
//
//        for(int j = 0; j <n.length ; j++){
//            if(max < n[j]){
//                max = n[j];
//                xia = j;
//            }
//        }
//
//        System.out.println(max + " " + xia);



//        int[] arr = {11,22,33,44,55,66};
//        int temp = 0;
//        for(int i = 0 ; i < arr.length / 2 ; i++){
//            temp = arr[i];
//            arr[i] = arr[arr.length - i - 1];
//            arr[arr.length - i - 1] = temp;
//        }
//
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }





//        int[] arr = {11,22,33,44,55,66};
//        int[] arr2 = new int[arr.length];
//
//
//        for(int i = 0; i <arr.length ; i++){
//            arr2[i] = arr[arr.length -i -1];
//        }
//
//        arr = arr2;
//
//        for(int i = 0 ; i < arr.length ;i ++){
//            System.out.print(arr[i] + " ");
//        }



//        int[] arr = {1,2,3,4,5};
//
//        char ch = ' ';
//        while(true){
//            System.out.println("你想要在缩减吗? y/n");
//            ch = myscanner.next().charAt(0);
//            if(ch == 'n'){
//                break;
//            }
//            int[] arr2 = new int[arr.length - 1];
//
//            if(arr2.length >= 1) {
//
//                for (int i = 0; i < arr2.length; i++) {
//                    arr2[i] = arr[i];
//                }
//
//                arr = arr2;
//
//                for(int j  =0; j <arr2.length ;j++){
//                    System.out.println(arr[j]);
//                }
//
//            }
//            else{
//                System.out.println("剩下最后一个元素,不能在缩减了");
//            }
//        }


    /*
    冒泡排序
     */

//        int[] arr = {24,69,80,57,13};
//        int temp = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            for(int j = i ; j  < arr.length  ; j++){
//
//                if(arr[i] > arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }
//
//        for(int j : arr){
//            System.out.print(j + " ");
//        }
//
//        for(int i = 0; i < arr.length - 1;i++){
//            for(int j = 0 ; j < arr.length - i - 1  ; j++){
//                if(arr[j] > arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }



//        int[][] arr = new int[3][];
//
//        for(int i = 0; i < arr.length ; i++){
//            arr[i] = new int[i+1];
//
//            for(int j = 0; j <arr[i].length ; j++){
//                arr[i][j] = i + 1;
//            }
//        }
//
//        for(int i = 0; i < arr.length ; i++){
//            for(int j = 0; j <arr[i].length ; j++){
//               System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }




//        int[][] arr = {{4,6},{1,4,5,7},{-2}};
//        int num = 0;
//
//        for(int i = 0; i < arr.length ; i++){
//            for(int j = 0; j <arr[i].length ; j++){
//                num += arr[i][j];
//            }
//        }
//        System.out.println(num);

        /*
        杨辉三角
         */


//        int[][] arr = new int[10][];
//
//
//        for(int i = 0;i < arr.length;i++){
//            arr[i] = new int [i+1];
//            for(int j = 0; j < arr[i].length ; j++){
//                if(j == 0 || j == arr[i].length - 1){
//                    arr[i][j] = 1 ;
//                }
//                if( i >= 2 && j > 0 && j < arr[i].length -1){
//                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
//                }
//            }
//        }
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        int[] arr = {10,12,45,90};

        int[] arr2 = new int[5];

        System.out.println("请输入插入的数字:");

        int num = myscanner.nextInt();

        for(int i = 0; i < arr.length ;i++){
            arr2[i] = arr[i];
        }
        arr2[4] = num;
        for(int i = 0; i < arr2.length - 1;i++){
            for(int j = 0 ; j < arr2.length - i - 1  ; j++){
                if(arr2[j] > arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
        arr = arr2;
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
