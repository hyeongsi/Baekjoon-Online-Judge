import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		int cnt = 0;
		bw.append("<");
		while(q.size() != 1) {
			cnt++;
			
			int pop = q.poll();
			if(cnt == k) {
				cnt = 0;
				bw.append(pop + ", ");
			}
			else {
				q.add(pop);
			}
		}
		bw.append(q.poll()+"");
		bw.append(">");
		
		bw.flush();
		bw.close();
	}		
}