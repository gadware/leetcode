package twopointers;

import gadware.GadwareUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TripletSumToZero {

    public static List<List<Integer>> twoSum(int[] arr, int targetSum) {

        int left = 0;
        int right = arr.length - 1;

        List<List<Integer>>  res = new ArrayList();

        System.out.println(" 2 length: " + arr.length);
        System.out.println(" 2 targetSum: " + targetSum);
        GadwareUtil.printArrayInt(arr);


        while(left < right){
            if(arr[left] + arr[right] == targetSum){
                res.add(List.of(arr[left], arr[right]));
                right--;
            }
            if(arr[left] + arr[right] > targetSum){
                right--;
            }
            if(arr[left] + arr[right] < targetSum){
                left++;
            }
        }

        return res;
    }

    public static List<List<Integer>> threeSum(int[] arr) {

        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            int temp = i;
            List<List<Integer>> twoList = twoSum(IntStream.range(0, arr.length)
                    .filter(j -> j != temp)
                    .map(j -> arr[j]).sorted()
                    .toArray(), arr[i] * -1);

            System.out.println(" three: " + arr[i]);
            for(int y = 0; y < twoList.size(); y++){
                System.out.println("{" + twoList.get(y).get(0)+ ", "+twoList.get(y).get(1)+"}") ;
            }

            if(twoList.size() != 0) {
                for(int t = 0; t < twoList.size(); t++){
                    res.add(List.of(twoList.get(t).get(0), twoList.get(t).get(1), arr[i]).stream().sorted().collect(Collectors.toList()));
                }
            }
            twoList.clear();
        }


        return res.stream().collect(Collectors.toList());
    }

    public static void main (String[] args) {


        int[] list = { -1,0,1,2,-1,-4};



        List<List<Integer>> temp = threeSum(Arrays.stream(list).sorted().toArray());

        //int[] temp = { 0};
        for(int i = 0; i < temp.size(); i++){
            System.out.println("{" + temp.get(i).get(0)+ ", "+temp.get(i).get(1)+ ", "+temp.get(i).get(2)+ "}") ;
        }


    }

}
