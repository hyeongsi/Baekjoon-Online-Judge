import java.util.*;

class Solution {
    public int solution(int n) {
        
        int nCnt = binaryOneCnt(n);
        
        while(true) {
            if(nCnt == binaryOneCnt(++n))
                break;
        }
        
        return n;
    }
    
    public int binaryOneCnt (int n) {
        String binary = Integer.toBinaryString(n);
        int cnt = 0;
        
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') cnt++;
        }
        
        return cnt;
    }
}