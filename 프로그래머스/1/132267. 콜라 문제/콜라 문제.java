class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int coke = (n / a) * b;
            n = coke + (n % a);
            answer += coke;
        }
        
        return answer;
    }
}