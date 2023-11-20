class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            for(int j = 0; j < n - binary.length(); j++){
                sb.append(" ");
            }
            for(int j = 0; j < binary.length(); j++){
                if(binary.charAt(j) == '0'){
                    sb.append(" ");
                }else{
                    sb.append("#");
                }
            }
            
            answer[i] = sb.toString();
        }
        return answer;
    }
}