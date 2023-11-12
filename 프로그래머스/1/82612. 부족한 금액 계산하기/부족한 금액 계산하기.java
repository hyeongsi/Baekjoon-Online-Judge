class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for(int i = 1; i <= count; i++){
            answer+= (price * i);
        }
        
        final long sub = answer - money; 
        return (sub >= 0) ? sub : 0;
    }
}