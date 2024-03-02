import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        Queue<Process> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new Process(priorities[i], i));
        }
        
        int preQueueSize = 0;
        while(!queue.isEmpty()) {
            preQueueSize = queue.size();
            Process process = queue.poll(); 
            
            Iterator<Process> it = queue.iterator();
            while(it.hasNext()) {
                if (it.next().priority > process.priority) {
                    queue.add(process);
                    break;
                }
            }
            
            if (queue.size() != preQueueSize) {
                resultArray.add(process.location);
            }
        }
        
        return resultArray.indexOf(location) + 1;
    }
    
    class Process {
        public int priority;
        public int location;

        public Process(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }
}