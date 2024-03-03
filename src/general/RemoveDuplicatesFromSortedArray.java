package general;

import gadware.GadwareUtil;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        Set<Integer> unq = new HashSet();
        int k = 0;
        int lastUnq = 0;

        for(int i = 0; i < nums.length ; i++){
            if(!unq.contains(nums[i])){
                unq.add(nums[i]);
                k++;
                nums[lastUnq] = nums[i];
                lastUnq++;
            }
        }
        return k;
    }

    public static void main (String[] args) {
        int[] temp = { 0,0,0,1,1,2,2,2,2,3,3 };

        System.out.println(removeDuplicates(temp));

        GadwareUtil.printArrayInt(temp);

    }

}
