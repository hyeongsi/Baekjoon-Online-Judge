import java.util.*;

class Solution {
    int dp[];
    public int solution(int[] numbers, int target) {
        dp = new int[numbers.length];
        
        int answer = dfs(0, 0, numbers, target);
        return answer;
    }
    
    public int dfs(int deep, int sum, int[] numbers, int target) {
        
        if (deep == numbers.length) {
            if (sum == target) {
                return 1;                
            }
            return 0;
        }
        
        return dfs(deep + 1, sum + numbers[deep], numbers, target) + dfs(deep + 1, sum - numbers[deep], numbers, target);
    }
}