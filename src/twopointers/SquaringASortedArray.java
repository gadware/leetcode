package twopointers;

import gadware.GadwareUtil;

import java.util.Arrays;

public class SquaringASortedArray {

    public static int[] makeSquares(int[] arr) {

        int[] squares = Arrays.stream(arr).mapToDouble(x -> Math.pow(x,2)).mapToInt(x -> (int)Math.round(x)).toArray();
        return Arrays.stream(squares).sorted().toArray();

    }

    public static void main (String[] args) {


        int[] temp = { -2, 2, 3, 3, 3, 6, 9, 9, 11};

        int[] temp1 = { 2, 2, 2, 11};

        //int[] temp = { 0};

        GadwareUtil.printArrayInt(makeSquares(temp));


    }

}
