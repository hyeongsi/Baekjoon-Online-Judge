import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 1번째 줄
		int N = Integer.parseInt(br.readLine());		
		
		// 2,3 번째 줄
		Deque<Long> dq = new ArrayDeque();
		StringTokenizer st1 = new StringTokenizer(br.readLine());	// 2번째 줄
		StringTokenizer st2 = new StringTokenizer(br.readLine());	// 3번째 줄
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(st1.nextToken());
			long m = Long.parseLong(st2.nextToken());
			
			if(n == 0) {
				dq.add(m);
			}
		}
		
		// 4번째 줄
		int M = Integer.parseInt(br.readLine());		
		
		// 5번째 줄
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			if(!dq.isEmpty()) {
				sb.append(dq.pollLast()).append(" ");
			}
			else {
				long n = Long.parseLong(st3.nextToken());
				sb.append(n).append(" ");
			}	
		}
		
		System.out.println(sb);
	}
}