class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int diff = 'a' - 'A';
        int alphaCnt = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(c >= 'A' && c <= 'Z'){
                if(alphaCnt % 2 == 1){
                    c += diff;
                }

                alphaCnt++;
                sb.append(c);
            }else if(c >= 'a' && c <= 'z'){
                if(alphaCnt % 2 == 0){
                    c -= diff;
                }

                alphaCnt++;
                sb.append(c);
            }else{

                alphaCnt = 0;
                sb.append(' ');
            }
        }
        
        return sb.toString();
    }
}