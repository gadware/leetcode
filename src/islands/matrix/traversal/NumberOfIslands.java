package islands.matrix.traversal;

import gadware.GadwareUtil;

public class NumberOfIslands {

    public static int numIslands(char[][] grid) {

        int res = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    res++;
                    dfs(grid, i , j);
                }
            }
        }

        return res;
    }

    public static void dfs(char[][] matrix, int x, int y){
        if(x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length)
            return;
        if(matrix[x][y] == 0) return;

        matrix[x][y] = 0;
        dfs(matrix, x + 1, y);
        dfs(matrix, x - 1, y);
        dfs(matrix, x, y + 1);
        dfs(matrix, x, y - 1);

    }


    public static void main (String[] args) {
        char[][] temp = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
            };

        System.out.println(numIslands(temp));


    }
}
