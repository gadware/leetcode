package islands.matrix.traversal;


import gadware.GadwareUtil;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc] == color) return image;

        paintImage(image, sr, sc, image[sr][sc], color);

        return image;

    }

    public static void paintImage(int[][] image, int x, int y, int oldColor, int newColor){

        if(x < 0 || x >= image.length || y < 0 || y >= image[0].length){
            return;
        }

        if(image[x][y] != oldColor){
            return;
        }

        image[x][y] = newColor;
        paintImage(image, x+1, y, oldColor, newColor);
        paintImage(image, x-1, y, oldColor, newColor);
        paintImage(image, x, y+1, oldColor, newColor);
        paintImage(image, x, y-1, oldColor, newColor);

    }

    public static void main(String args[]){

        int[][] image = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,1,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        floodFill(image, 6, 8, 5);

        GadwareUtil.printMatrixInt(image);

    }

}
