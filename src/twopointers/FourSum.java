package twopointers;

import java.util.*;

public class FourSum {

    static public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        Set<List<Integer>> quadruplets = new HashSet<List<Integer>>();

        for(int f4 = 0; f4 < nums.length - 3; f4++){

            long threeTarget = target - nums[f4];

            if(f4 == 0 || (f4 > 0 && nums[f4] != nums[f4 - 1])){
                for(int f1 = f4+1; f1 < nums.length - 2; f1++){

                    int low = f1 + 1;
                    int high = nums.length - 1;
                    long sum = threeTarget - nums[f1];

                    while(low < high) {
                        if(sum == nums[low] + nums[high]){
                            List<Integer> t = Arrays.asList(nums[f4], nums[f1], nums[low], nums[high]);
                            Collections.sort(t);
                            quadruplets.add(new ArrayList<>(t));
                            while(low < high && nums[low] == nums[low + 1]) low++;
                            while(low < high && nums[high] == nums[high - 1]) high--;
                            low++;
                            high--;

                        } else if(nums[low] + nums[high] > sum) {
                            high--;
                        } else {
                            low++;
                        }
                    }

                }
            }
        }


        return new ArrayList<>(quadruplets);

    }

    public static void main (String[] args) {


        int[] list = { 1,0,-1,0,-2,2};



        List<List<Integer>> temp = fourSum(list, 0);

        //int[] temp = { 0};
        for(int i = 0; i < temp.size(); i++){
            System.out.println("{" + temp.get(i).get(0)+ ", "+temp.get(i).get(1)+ ", "+temp.get(i).get(2)+  ", "+temp.get(i).get(3)+"}") ;
        }


    }

}
