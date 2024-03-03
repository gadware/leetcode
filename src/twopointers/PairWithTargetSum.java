package twopointers;

import gadware.GadwareUtil;
import jdk.jshell.execution.Util;

import java.util.Arrays;

public class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            if(arr[left] + arr[right] == targetSum){
                return new int[] {left, right};
            }
            if(arr[left] + arr[right] > targetSum){
                right--;
            }
            if(arr[left] + arr[right] < targetSum){
                left++;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main (String[] args) {


        int[] temp = { -6, 1, 2, 3, 4, 6, 8};

        //int[] temp = { 0};

        GadwareUtil.printArrayInt(search(temp, -10));


    }

}
