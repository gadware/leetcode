package general;

import gadware.GadwareUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        if(IntStream.of(nums).filter(x -> x==val).count() == nums.length){
            nums = new int[0];
            return 0;
        }

        int first = 0;
        int last = nums.length - 1;

        while(first < last){
            if(nums[first] != val){
                first++;
            }else {
                nums[first] = nums[last];
                nums[last] = val;
                last--;
            }
        }

        GadwareUtil.printArrayInt(nums);
        return nums[first]==val ? first : first+1;
    }

    public static void main (String[] args) {


        int[] temp = { -6, 1, 2, 3, -6, 6, 8};
        int[] temp1 = {3,2,2,3};

        //int[] temp = { 0};

        System.out.println(removeElement(temp1, 3));


    }

}
