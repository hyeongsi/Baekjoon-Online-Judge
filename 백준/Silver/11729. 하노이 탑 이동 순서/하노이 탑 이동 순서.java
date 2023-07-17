import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		hanoi(n, 1,2,3);
		
		System.out.println(cnt);
		System.out.println(sb);
	}
	
	static void hanoi(int n, int start, int mid, int to) {
		if(n == 1) {
			cnt++;
			sb.append(start).append(" ").append(to).append("\n");
			return;
		}
		
		hanoi(n-1,start,to,mid);
		sb.append(start).append(" ").append(to).append("\n");
		cnt++;
		hanoi(n-1,mid,start,to);
	}
}
