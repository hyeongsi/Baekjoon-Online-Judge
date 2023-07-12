import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		LinkedList<Integer> dq = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			dq.add(i);
		}

		int cnt = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int f = Integer.parseInt(st.nextToken());

			int halfIdx = dq.size() / 2;
			if (dq.size() % 2 == 0) {
				halfIdx--;
			}
			
			int fIdx = dq.indexOf(f);
			if(fIdx <= halfIdx) {
				for(int j = 0; j < fIdx; j++) {
					dq.add(dq.poll());
					cnt++;
				}
			}
			else {
				for(int j = dq.size(); j > fIdx; j--) {
					dq.addFirst(dq.pollLast());
					cnt++;
				}
			}
			dq.poll();
		}
		System.out.println(cnt);
	}
}
