class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int acc = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    acc = nums[i] + nums[j] + nums[k];
                    if(isPrime(acc))
                        answer++;
                }
            }
        }

        return answer;
    }
    
    public boolean isPrime(int num){
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}