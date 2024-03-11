import java.util.*;

class Solution {
  public int[] solution(String msg) {
        int nextIndex = 27;
        int nextStartIndex = 0;

        Map<String, Integer> dictionary = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        while (true) {
            if (nextStartIndex > msg.length() - 1) { 
                break;
            }
            if (nextStartIndex == msg.length() - 1) { 
                char w = msg.charAt(nextStartIndex);
                list.add(w - 64);
                break;
            }

            String toFind = msg.substring(nextStartIndex, nextStartIndex + 2);
            String w = "";
            if (dictionary.containsKey(toFind)) {
                w = toFind;
                boolean findLargerW = true;
                int i = 2;
                while (findLargerW) {
                    i++;
                    if (nextStartIndex + i > msg.length()) {
                        break;
                    }
                    toFind = msg.substring(nextStartIndex, nextStartIndex + i);
                    if (dictionary.containsKey(toFind)) {
                        findLargerW = true;
                        w = toFind;
                    } else {
                        findLargerW = false;
                    }
                }
                list.add(dictionary.get(w));
                dictionary.put(toFind, nextIndex++);
                nextStartIndex += w.length();

            } else {
                char c = msg.charAt(nextStartIndex);
                list.add(c - 64);
                dictionary.put(toFind, nextIndex++);
                nextStartIndex++;
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}