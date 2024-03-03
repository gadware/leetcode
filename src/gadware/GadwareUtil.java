package gadware;

public class GadwareUtil {

    public static Long factorial (Long num){
        if(num > 1)
            return factorial(num - 1) * num;
        return 1L;
    }

    public static <T> void printArray( T[] arr){

        for (int i = 0; i < arr.length; i++){
            System.out.println("Index: " + i + "  - value: " + arr[i] );
        }

    }

    public static void printArrayInt( int[] arr){

        for (int i = 0; i < arr.length; i++){
            System.out.println("Index: " + i + "  - value: " + arr[i] );
        }

    }

    public static void printMatrixInt( int[][] mat){

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] +", " );
            }
            System.out.println("");
        }

    }

}
