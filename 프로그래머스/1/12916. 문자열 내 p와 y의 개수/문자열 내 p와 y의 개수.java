class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt = 0;
        for(char c : s.toLowerCase().toCharArray()){
            if(c == 'p')
                cnt++;
            else if(c == 'y')
                cnt--;
        }

        return (cnt == 0);
    }
}