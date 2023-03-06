package data.struct.recursion;

/**
 * 理解迷宫问题
 * 0:表示没走过 1：表示墙 2：表示走过 3：该点已经走过但是走不通
 */
public class Maze {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        map[2][1] = 1;
        map[3][1] = 1;
        //把外围全部设置为1表示围墙
        for(int i = 0; i < 8; i++){
            map[0][i==0?0:i-1] = 1;
            map[7][i==0?0:i-1] = 1;
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for(int i = 0; i < 8; i++){
           for(int j =0; j < 7; j++){
               System.out.print(map[i][j] + " ");
           }
            System.out.println();
        }
        System.out.println("----------------");
        maze(map, 1, 1);
        for(int i = 0; i < 8; i++){
            for(int j =0; j < 7; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }


    }

    /**
     *
     * @param map 表示地图
     * @param i   表示起始位置的横坐标
     * @param j   纵坐标
     * @return    找到通路返回true 否则返回false
     */
    public static boolean maze(int[][] map, int i, int j){
        if(map[6][5] == 2){
            return true;
        }else{
            //假设当前没走过
            if(map[i][j] == 0){
                //按照策略下右上左
                map[i][j] = 2;
                if(maze(map, i+1, j)){
                    return true;
                }else if(maze(map, i, j+1 )){
                    return true;
                }else if(maze(map, i-1, j)){
                    return true;
                }else if(maze(map, i, j-1)){
                    return true;
                }else {
                    //说明走不通是死路
                    map[i][j] = 3;
                    return false;
                }
            }else {
                //不是0说明是 1 2 3
                return false;
            }
        }
    }
}
