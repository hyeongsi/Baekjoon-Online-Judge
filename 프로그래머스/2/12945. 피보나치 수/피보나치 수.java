class Solution {
    public int solution(int n) {
        
        final int div = 1234567; 
        int[] fibo = new int[100001];
        fibo[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] % div + fibo[i - 2] % div) % div;
        }
        
        return fibo[n];
    }
}