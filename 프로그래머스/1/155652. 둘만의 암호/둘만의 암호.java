class Solution {
    public String solution(String s, String skip, int index) {
        
        char[] chArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();
        
        for (int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            
            for (int j = 0; j < index; j++) {
                ch = increaseAlphabet(ch);
                
                while(isSkip(skipArr, ch)) {
                    ch = increaseAlphabet(ch);
                }
            }
            
            chArr[i] = ch;
        }
        

        return new String(chArr);
    }
    
    public boolean isSkip(final char[] skip, char ch) {
        for(int i = 0; i < skip.length; i++) {
            if(ch == skip[i]) {
                return true;
            }
        }
        
        return false;
    }
    
    public char increaseAlphabet(char ch) {
        char result = ++ch;
        
        if(result > 'z') {
            result = 'a';
        }
        
        return result;
    }
}