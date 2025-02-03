public class five4 {
    public static void main(String[] args){


    int[][] map = new int[8][7];


    for(int i = 0 ; i < map.length ; i++){
        for(int j = 0; j < map[i].length ; j++){
            if(i == 0 || i == map.length - 1){
                map[i][j] = 1;
            }
            else{
                if(j == 0 || j == map[i].length - 1 || (i == 3 && (j == 1 || j == 2))){
                    map[i][j] = 1;
                }
                else {
                    map[i][j] =0;
                }
            }
        }
    }
//        for(int i = 0 ; i < map.length ; i++) {
//            for (int j = 0; j < map[i].length; j++) {
//
//                System.out.print(map[i][j] + " ");
//
//
//            }
//            System.out.println();
//        }


        T t = new T();
        t.findway(map,1,1);
    }

}
/*
老鼠找路
 */

//class T{
//
//    public boolean findWay(int[][] map, int i ,int j)
//    {
//        map[1][1] = 2;
//        if(map[6][5] != 2){
//            if (map[i + 1][j] == 1) {
//
//                map[i + 1][j] = 3;
//                erwei(map);
//
//            } else {
//                map[i + 1][j] = 2;
//                erwei(map);
//                return findWay(map, i + 1, j);
//
//            }
//            if (map[i][j + 1] == 1) {
//                map[i][j + 1] = 3;
//                erwei(map);
//            } else {
//                map[i][j + 1] = 2;
//                erwei(map);
//                return findWay(map, i, j + 1);
//            }
//            if (map[i - 1][j] == 1) {
//                map[i - 1][j] = 3;
//                erwei(map);
//            } else {
//                map[i - 1][j] = 2;
//                erwei(map);
//                return findWay(map, i - 1, j);
//            }
//            if (map[i][j - 1] == 1) {
//                map[i][j - 1] = 3;
//                erwei(map);
//            } else {
//                map[i][j - 1] = 2;
//                erwei(map);
//                return findWay(map, i, j - 1);
//            }
//        }
//        else
//            System.out.println("恭喜你找到通路");
//        return true;
//
//    }
//
//    public void erwei(int[][] map){
//        System.out.println("============");
//        for(int a = 0 ; a < map.length ; a++) {
//            for (int b = 0; b < map[a].length; b++) {
//
//                System.out.print(map[a][b] + " ");
//
//
//            }
//            System.out.println();
//        }
//    }
//}



class T{

    public boolean findway(int[][] map ,int i, int j){
        if(map[6][5] == 2){
            erwei(map);
            return true;

        }
        else{
            if(map[i][j] == 0){
                map[i][j] = 2;

                if(findway(map,i + 1,j)){
                    return true;
                }
                else if(findway(map,i , j+1)){
                    return  true;
                }
                else  if(findway(map,i-1,j)){
                    return  true;
                }
                else if(findway(map,i,j-1)){
                    return  true;
                }
                else {
                    map[i][j] = 3;

                    return false;
                }
            }
            else {
                return false;
            }
        }

    }
    public void erwei(int[][] map){
        System.out.println("============");
        for(int a = 0 ; a < map.length ; a++) {
            for (int b = 0; b < map[a].length; b++) {

                System.out.print(map[a][b] + " ");


            }
            System.out.println();
        }
    }
}
































