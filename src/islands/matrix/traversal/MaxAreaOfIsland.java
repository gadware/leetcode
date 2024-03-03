package islands.matrix.traversal;

public class MaxAreaOfIsland {

    static boolean[][] visited;
    static int islandSize = 0 ;

    public static int maxAreaOfIsland(int[][] grid) {

        int maxIsland = 0;
        visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1 && visited[i][j] == false){
                    islandSize = 0;
                    calculateIslandSize(grid, i, j);
                    if(islandSize > maxIsland){
                        maxIsland = islandSize;
                    }
                }
                visited[i][j] = true;
            }
        }



        return maxIsland;
    }

    public static void calculateIslandSize (int[][] allArea, int x, int y){
        if (x < 0 || x >= allArea.length || y < 0 || y >= allArea[0].length)
            return;

        if(allArea[x][y] == 0 || visited[x][y] == true) {
            return;
        }

        visited[x][y] = true;
        islandSize++;
        calculateIslandSize(allArea, x + 1, y);
        calculateIslandSize(allArea, x - 1, y);
        calculateIslandSize(allArea, x, y + 1);
        calculateIslandSize(allArea, x, y - 1);


    }

    public static void main(String args[]){

        int[][] allArea = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,1,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        System.out.println(maxAreaOfIsland(allArea));

    }

}
