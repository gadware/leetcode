package twopointers;

import java.util.List;

public class BackspaceStringCompare {

    static public boolean backspaceCompare(String s, String t) {

        StringBuilder s_sb = new StringBuilder(s);
        StringBuilder t_sb = new StringBuilder(t);

        for(int i = 0; i < s_sb.length(); i++){
            //System.out.println("i: " + i + " - s_sb[i]: " + s_sb.charAt(i) + " - size: " + s_sb.length());
            if(s_sb.charAt(i) == '#'){
                s_sb.deleteCharAt(i);
                if(i != 0){
                    s_sb.deleteCharAt(i-1);
                    i--;
                }
                i--;
            }
        }

        for(int i = 0; i < t_sb.length(); i++){
            if(t_sb.charAt(i) == '#'){
                t_sb.deleteCharAt(i);
                if(i != 0){
                    t_sb.deleteCharAt(i-1);
                    i--;
                }
                i--;
            }
        }

//        System.out.println("s: " + s_sb);
//        System.out.println("t: " + t_sb);

        return s_sb.toString().equals(t_sb.toString());


    }

    public static void main (String[] args) {


        String s = "a#c";
        String t = "b";

        System.out.println(backspaceCompare(s,t)?"true":"false");


    }

}
