package twopointers;

public class ShortestUnsortedContinuousSubarray {

    static public int findUnsortedSubarray(int[] nums) {

        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 1, j = n-2; i < n && j >= 0; i++, j--) {
            if(nums[i] < nums[i-1]) {
                minVal = Math.min(minVal, nums[i]);
            }
            if(nums[j] > nums[j+1]) {
                maxVal = Math.max(maxVal, nums[j]);
            }
        }
        if(minVal == Integer.MAX_VALUE && maxVal == Integer.MIN_VALUE) return 0;

        int start = 0, end = n-1;
        for(; start < n; start++) {
            if(nums[start] > minVal) break;
        }
        for(; end >= 0; end--) {
            if(nums[end] < maxVal) break;
        }
        return end - start + 1;
    }

    public static void main (String[] args) {
//        int[] list = { 1,2,3,5,6,7,10,4};

        int[] list = { 2,6,4,8,10,9,15};


        System.out.println(findUnsortedSubarray(list));


    }

}
