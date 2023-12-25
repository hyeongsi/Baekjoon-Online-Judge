class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        while (n > 1) {
            answer++;
            
            if((a + 1)/ 2 == (b + 1) / 2) {
                return answer;
            }
            
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            n /= 2;
        }

        return answer;
    }
}