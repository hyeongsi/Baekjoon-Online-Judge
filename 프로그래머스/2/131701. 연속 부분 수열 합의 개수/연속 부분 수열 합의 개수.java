import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        HashSet<Integer> prefixSumSet = new HashSet<Integer>();
        int[] prefixSum = new int[elements.length];
        
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                
                int idx = j + i;
                if (idx >= elements.length) {
                    idx -= elements.length;
                }
                prefixSum[j] += elements[idx]; 
                prefixSumSet.add(prefixSum[j]);
            }
        }
        
        int answer = prefixSumSet.size();
        return answer;
    }
}