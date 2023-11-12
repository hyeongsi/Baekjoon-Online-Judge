class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() < 4 || s.length() > 6 || s.length() == 5)
            return false;
        
        char[] chArr = s.toCharArray();
        for(int i = 0; i < chArr.length; i++){
            if(chArr[i] < '0' || chArr[i] > '9')
                return false;
        }
        
        return answer;
    }
}