import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		while(q.size() > 1) {
			q.poll();
			if(q.size() > 1) {
				int val = q.poll();
				q.add(val);
			}
			else {
				break;
			}
		}
		
		System.out.println(q.poll());
	}
}
