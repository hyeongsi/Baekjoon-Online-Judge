class Solution {
    public String solution(int a, int b) {
        String[] answer = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] md = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int currentD = 4;  // 0일, 목
         
        int dCnt = 0;
        for(int i = 0; i < a - 1; i++){
            dCnt += md[i];
        }
        
        dCnt += b;
        
        return answer[ (currentD + dCnt) % 7];
    }
}