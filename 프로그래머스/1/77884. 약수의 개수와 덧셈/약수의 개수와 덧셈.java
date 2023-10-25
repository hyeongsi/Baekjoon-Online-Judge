class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            if(divisor(i) % 2 == 0){
                answer+=i;
            }else{
                answer-=i;
            }
        }
        
        return answer;
    }
    
    public int divisor(int num){
        int divCnt = 0;
        
        for(int i = 1; i * i <= num; i++){
            if(i * i == num){
                divCnt++;
            }
            else if(num % i == 0){
                divCnt+=2;
            }
        }
            
        return divCnt;
    }
}