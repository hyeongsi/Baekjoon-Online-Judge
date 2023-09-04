import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int absO1 = Math.abs(o1);
                int absO2 = Math.abs(o2);

                if(absO1 == absO2){
                    if(o1 < o2){
                        return -1;
                    }else if(o1 > o2) {
                        return 1;
                    }else{
                        return 0;
                    }
                }else if(absO1 < absO2){
                    return -1;
                }else{
                    return 1;
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                Integer value = priorityQueue.poll();

                if(value == null){
                    sb.append(0);
                }else{
                    sb.append(value);
                }

                sb.append("\n");
            }else{
                priorityQueue.add(n);
            }
        }

        System.out.println(sb);
    }
}
