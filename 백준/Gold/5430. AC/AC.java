import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
			
			Deque<String> dq = new ArrayDeque<>();
			
			for(int j = 0; j < n; j++) {
				dq.add(st.nextToken());
			}
			
			boolean reverse = false;
			boolean error = false;
			for(int j = 0; j < p.length(); j++) {
				char c = p.charAt(j);
				if(c == 'R') {
					reverse = !reverse;
				}
				else {
					if(dq.isEmpty()) {
						error = true;
						break;
					}
					
					if(reverse) {
						dq.pollLast();
					}
					else {
						dq.pollFirst();
					}		
				}
			}
			
			if(error)
				sb.append("error\n");
			else{
				int size = dq.size();
				
				sb.append("[");
				while(!dq.isEmpty()) {
					if(reverse) {
						sb.append(dq.pollLast() + ",");
					}
					else {
						sb.append(dq.pollFirst()+ ",");
					}
				}
				
				if(size != 0)
					sb.deleteCharAt(sb.length()-1);
				sb.append("]\n");
			}
			
		}	
		System.out.println(sb);
	}	
}