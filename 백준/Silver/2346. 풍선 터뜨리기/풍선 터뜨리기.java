import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());		
			
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 0 : idx, 1 : value
		Deque<int[]> dq = new ArrayDeque<>();
	
		for(int i = 1; i <= N; i++) {
			int[] arr = new int[2];
			arr[0] = i;
			arr[1] = Integer.parseInt(st.nextToken());
			dq.add(arr);
		}	
		
		while(dq.size() > 1) {
			int[] v = dq.pollFirst();
			sb.append(v[0] + " ");
			
			if(v[1] > 0) {
				for(int i = 1; i < v[1]; i++) {
					dq.addLast(dq.pollFirst());
				}
			}else {
				for(int i = 0; i < v[1] * -1; i++) {
					dq.addFirst(dq.pollLast());
				}
			}
		}
		
		sb.append(dq.pop()[0]);
		System.out.println(sb);
	}
}