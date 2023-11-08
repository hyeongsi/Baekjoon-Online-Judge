class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < phone_number.length(); i++){
            if(phone_number.length() - 4 > i){
                sb.append("*");
            }
            else{
                sb.append(phone_number.charAt(i));
            }
        }
        
        return sb.toString();
    }
}