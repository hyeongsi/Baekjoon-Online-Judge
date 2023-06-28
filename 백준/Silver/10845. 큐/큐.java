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
		
		Queue<Integer> q = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		int last = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch(st.nextToken()) {
				case "push":
					last = Integer.parseInt(st.nextToken());
					q.offer(last);
					break;
				case "pop":
					if(q.isEmpty())
						bw.write(-1 + "\n");
					else
						bw.write(q.poll() + "\n");
					break;
				case "size":
					bw.write(q.size() + "\n");
					break;
				case "empty":
					if(q.isEmpty())
						bw.write(1 + "\n");
					else
						bw.write(0 + "\n");
					break;
				case "front":
					if(q.isEmpty())
						bw.write(-1 + "\n");
					else
						bw.write(q.peek() + "\n");
					break;
				case "back":
					if(q.isEmpty())
						bw.write(-1 + "\n");
					else
						bw.write(last + "\n");
					break;
				default:
					return;
			}
		}
		
		bw.flush();
		bw.close();
	}		
}