package twopointers;

import gadware.GadwareUtil;

public class FindNonDuplicateNumberInstance {

    public static int remove(int[] arr) {

        int left = 1;

        for(int right = 1; right < arr.length; right++){
            if(arr[left - 1] != arr[right]){
                arr[left] = arr[right];
                left++;
            }
        }
        return left;



    }

    public static void main (String[] args) {


        int[] temp = { -2, 2, 3, 3, 3, 6, 9, 9, 11};

        int[] temp1 = { 2, 2, 2, 11};

        //int[] temp = { 0};

        System.out.println(remove(temp));


    }

}
