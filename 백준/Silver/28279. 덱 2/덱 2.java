import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());		
		
		Deque<Integer> dq = new LinkedList<>();		
		StringBuilder sb = new StringBuilder();
		
		for(int l = 0; l < N; l++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			switch (Integer.parseInt(st.nextToken())) {
			case 1:
				dq.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				dq.addLast(Integer.parseInt(st.nextToken()));
				break;
			case 3:
				sb.append(dq.isEmpty() ? -1 : dq.pollFirst()).append('\n'); 
				break;
			case 4:
				sb.append(dq.isEmpty() ? -1 : dq.pollLast()).append('\n'); 
				break;
			case 5:
				sb.append(dq.size()).append('\n'); 
				break;
			case 6:
				sb.append(dq.isEmpty() ? 1 : 0).append('\n'); 
				break;
			case 7:
				sb.append(dq.isEmpty() ? -1 : dq.peekFirst()).append('\n'); 
				break;
			case 8:
				sb.append(dq.isEmpty() ? -1 : dq.peekLast()).append('\n'); 
				break;
			default:
				break;
			}
		}
		
		System.out.println(sb);
	}
}