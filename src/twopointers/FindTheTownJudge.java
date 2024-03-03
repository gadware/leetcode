package twopointers;

import gadware.GadwareUtil;

import java.util.HashMap;
import java.util.Map;

public class FindTheTownJudge {

    public static int findJudge(int n, int[][] trust)  {

        if(trust.length == 0 && n == 1)
            return 1;

        System.out.println("length: " + trust.length);

        Map<Integer, Integer> trusters = new HashMap<>();
        Map<Integer, Integer> trustees = new HashMap<>();
        for(int i = 0; i < trust.length; i++){
            Integer exist1 = trusters.get(trust[i][0]);
            Integer exist2 = trustees.get(trust[i][1]);

            if(exist1 != null){
                exist1++;
                trusters.put(trust[i][0], exist1);
            } else {
                trusters.put(trust[i][0], 1);
            }

            if(exist2 != null){
                exist2++;
                trustees.put(trust[i][1], exist2);
            } else {
                trustees.put(trust[i][1], 1);
            }
        }

        Long judgeNum = trustees.entrySet().stream().filter(x -> x.getValue() == n-1).count();
        if(judgeNum != 1) return -1;

        Integer judge = trustees.entrySet().stream().filter(x -> x.getValue() == n-1).findFirst().get().getKey();

        if(trusters.get(judge) != null) return -1;

        return judge;

    }

    public static void main (String[] args) {


        int[][] temp = { {1,2} ,{4,2}, {6,2}, {3,2}, {3,2}, {5,1}, {3,4}};

        System.out.println(FindTheTownJudge.findJudge(6, temp));
    }

}
