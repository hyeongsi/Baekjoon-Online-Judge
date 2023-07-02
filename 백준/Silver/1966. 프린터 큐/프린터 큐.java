import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> indexq = new LinkedList<Integer>();
		StringTokenizer st; 
		
		int loop = Integer.parseInt(br.readLine());
		for(int i = 0; i < loop; i++) {
			q.clear();
			indexq.clear();
			
			st = new StringTokenizer(br.readLine()); 	// 모든 문서들의 중요도
			int n = Integer.parseInt(st.nextToken());	// 문서의 개수
			int m = Integer.parseInt(st.nextToken());	// 순서확인 문서가 큐에서 위치 0 ~ N-1
			
			st = new StringTokenizer(br.readLine()); 	// 모든 문서들의 중요도
			for(int j = 0; j < n; j++) {
				int imp = Integer.parseInt(st.nextToken());
				q.offer(imp);
				indexq.offer(j);
			}
			
			int cnt = 0;
			while(!q.isEmpty()) {
				int max = Collections.max(q);
				int cur = q.poll();
				int curIndex = indexq.poll();
				
				if(cur == max) {
					cnt++;
					
					if(curIndex == m) {
						System.out.println(cnt);
						break;
					}
				}
				else {
					q.offer(cur);
					indexq.offer(curIndex);
				}
			}
		}
	}	
}