public class six {
    public static void main(String[] args){

        EightQueens t = new EightQueens();
//        t.tower(5,'A','B','C');

        int a = 0;
        int[] arr = new int[8];
        int[][] map = new int[8][8];
        for(int i = 0 ; i < map.length ; i++){
            for(int j = 0; j < map[i].length ; j++){
               map[i][j] = 0;

            }
        }

//        for(int i = 0; i <map.length ; i++){
//            for(int j = 0; j <map[i].length; j++){
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println();
//        }
        t.solve(map,0,arr,a);

    }
}
class Tower{
    public void tower(int num , char from,char  fuzhu,char to){

        if(num == 1){
            System.out.println("将圆盘1从" + from + " 移动到" + to);
        }

        else{

            tower(num - 1 ,from , to, fuzhu);//将n-1个圆盘借助目标柱子移动到辅助柱子上

            System.out.println("将圆盘" + num + "从" +  from +"移动到" + to);//将圆盘n移动到目标柱子上

            tower(num - 1,fuzhu,from ,to);//将n-1个圆盘借助起始柱子移动到目标柱子上

        }

    }
/*
自己写的八皇后，运行错误
 */

//    public boolean eight(int[][] map, int i , int j, int[] arr , int a){
//
//
//            while(true) {
//                if(a == 8){
//                    for(int c = 0 ; c <arr.length ; c ++){
//                        System.out.print(arr[c] + " ");
//                    }
//                    return true;
//                }
//                if (map[i][j] == 0) {
//                    for (int b = 1; b < map.length; b++) {
//                        map[i][b] = 1;
//                        map[b][j] = 1;
//
//                        if(i + b < 8&& j + b < 8)map[i + b][j + b] = 1;
//                        if(i - b >=0 && j - b >=0)map[i - b][j - b] = 1;
//                        if(i - b >= 0&& j + b < 8)map[i - b][j + b] = 1;
//                        if(i + b < 8&& j -b >=0)map[i + b][j - b] = 1;
//                    }
//                    arr[a] = j;
//                    if(eight(map,  i+1 , 0, arr,a+ 1)){
//                        return true;
//                    };
//                }
//                else{
//                    j += 1;
//                    if(j >= 8){
//                        return false;
//                    }
//                }
//            }
//        }


    /*
    ai修改后的八皇后
     */


}
class EightQueens {
    public static void main(String[] args) {
        int[][] map = new int[8][8];
        int[] arr = new int[8];
        new EightQueens().solve(map, 0, arr, 0);
    }

    public boolean solve(int[][] map, int row, int[] arr, int a) {
        if (a == 8) {
            printSolution(arr);
            return true;
        }
        for (int col = 0; col < 8; col++) {
            if (isSafe(map, row, col)) {
                int[][] originalMap = deepCopy(map);
                markAttackArea(map, row, col);
                arr[a] = col;
                if (solve(map, row + 1, arr, a + 1)) {
                    return true;
                }
                restoreMap(map, originalMap);
            }
        }
        return false;
    }

    private boolean isSafe(int[][] map, int row, int col) {
        // 检查列冲突
        for (int i = 0; i < row; i++) {
            if (map[i][col] == 1) return false;
        }
        // 检查对角线
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (map[i][j] == 1) return false;
        }
        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (map[i][j] == 1) return false;
        }
        return true;
    }

    private void markAttackArea(int[][] map, int row, int col) {
        map[row][col] = 1;
    }

    private int[][] deepCopy(int[][] original) {
        int[][] copy = new int[8][8];
        for (int i = 0; i < 8; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, 8);
        }
        return copy;
    }

    private void restoreMap(int[][] map, int[][] original) {
        for (int i = 0; i < 8; i++) {
            System.arraycopy(original[i], 0, map[i], 0, 8);
        }
    }

    private static void printSolution(int[] arr) {
        for (int col : arr) {
            System.out.print(col + " ");
        }
        System.out.println();
    }
}