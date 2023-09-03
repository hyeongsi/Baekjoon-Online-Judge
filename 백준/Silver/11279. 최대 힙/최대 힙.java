import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

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
