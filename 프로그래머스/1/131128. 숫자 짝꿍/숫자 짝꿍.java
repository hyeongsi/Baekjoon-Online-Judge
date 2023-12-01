import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        
        for(int i = 0; i < X.length(); i++){
            xArr[X.charAt(i) - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < Y.length(); i++){
            int idx = Y.charAt(i) - '0';
            if(xArr[idx] > 0){
                xArr[idx]--;
                sb.append(idx);
            }
        }
        
        if(sb.length() == 0){
            return "-1";
        }
        
        char[] chArr = sb.toString().toCharArray();
        Arrays.sort(chArr);
        
        String answer = new StringBuilder(new String(chArr)).reverse().toString();
        
        return (answer.charAt(0) != '0') ? answer : "0";
    }
}