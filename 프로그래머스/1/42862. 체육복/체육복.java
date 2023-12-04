import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 체육복 x : -1
        // 체육복 o : 0
        // 체육복 o, 여벌 o : 1
        int[] students = new int[n];
        for(int i = 0; i < lost.length; i++){
            students[lost[i] - 1]--;
        }
        for(int i = 0; i < reserve.length; i++){
            students[reserve[i] - 1]++;
        }
        
        for(int i = 0; i < students.length; i++){
            if(students[i] != -1){
                continue;
            }
            
            if(i > 0 && students[i - 1] == 1){
                students[i]++;
                students[i - 1]--;
            }
            else if(i < students.length - 1 && students[i + 1] == 1){
                students[i]++;
                students[i + 1]--;
            }
        }
        
        for(int i = 0; i < students.length; i++){
            if(students[i] >= 0)
                answer++;
        }
        
        return answer;
    }
}