import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        String[] todayArr = today.split("\\.");
        int todayDate = stringToIntDate(todayArr);
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] termArr = term.split(" ");
            map.put(termArr[0], Integer.parseInt(termArr[1]));
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] dateArr = privacies[i].split(" ");
            int term = map.get(dateArr[1]);
            String[] startDateArr = dateArr[0].split("\\.");
            
            int date = stringToIntDate(startDateArr);
            date += term * 28;
            
            if (todayDate >= date) {
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i) + 1;
        }
        return answer;
    }
    
    public int stringToIntDate(String[] dateArr) {
        int year = Integer.parseInt(dateArr[0]) * 12 * 28;
        int month = Integer.parseInt(dateArr[1]) * 28;
        int day = Integer.parseInt(dateArr[2]);
        
        return year + month + day;
    }
}