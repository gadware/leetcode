package islands.matrix.traversal;

import gadware.GadwareUtil;

public class NumberOfClosedIslands {

    static int islandCount = 0;
    static boolean[][] visited;
    static boolean closedIsland = false;

    public static int closedIsland(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){

                if(grid[i][j] == 0 && visited[i][j] == false){
                    closedIsland = true;
                    isClosedIsland(grid, i ,j);
                    if(closedIsland){
                        islandCount++;
                    }
                }

            }
        }

        return islandCount;
    }

    public static void isClosedIsland(int[][] grid, int x, int y){

        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length) return;
        if((x==0 || x==grid.length-1 || y==0 || y==grid[0].length-1) && grid[x][y] == 0) {
            closedIsland = false ;
        }

        if(visited[x][y]) return;
        visited[x][y] = true;
        if(grid[x][y] == 1) return;
        isClosedIsland(grid, x+1, y);
        isClosedIsland(grid, x-1, y);
        isClosedIsland(grid, x, y+1);
        isClosedIsland(grid, x, y-1);

    }

    public static void main(String args[]){

        int[][] gridTest1 = {
                {1,1,1,1,1,1,1},
                {1,0,0,0,0,0,1},
                {1,0,1,1,1,0,1},
                {1,0,1,0,1,0,1},
                {1,0,1,1,1,0,1},
                {1,0,0,0,0,0,1},
                {1,1,1,1,1,1,1}
        };


        int[][] gridTest2 = {
                {0,0,1,0,0},
                {0,1,0,1,0},
                {0,1,1,1,0}
        };


        System.out.println(closedIsland(gridTest2));

    }

}
