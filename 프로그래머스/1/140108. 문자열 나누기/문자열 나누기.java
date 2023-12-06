class Solution {
    public int solution(String s) {
    
        int answer = 0;
        
        char first = s.charAt(0);
        int[] cnt = new int[] {1 , 0}; // x , !x
        
        for(int i = 1; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == first)
                cnt[0]++;
             else
                cnt[1]++;
            
            if(cnt[0] == cnt[1]){
                
                System.out.println(ch);
                cnt[0] = 0;
                cnt[1] = 0;
                
                answer++;
                if(i < s.length() - 1)
                    first = s.charAt(i + 1);
            }
            else if(i == s.length() - 1){
                answer++;
            }
            
        }
        
        return (answer == 0) ? 1 : answer;
    }
}