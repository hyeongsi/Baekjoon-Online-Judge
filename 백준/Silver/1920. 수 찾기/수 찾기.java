import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Boolean> m = new HashMap<>();
		for(int i = 0; i < n; i++) {
			m.put(Integer.parseInt(st.nextToken()), false);
		}
		
		int k = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			if(m.get(Integer.parseInt(st.nextToken())) != null)
				bw.write(1 + "\n");
			else
				bw.write(0 + "\n");
		}
		
		bw.flush();
		bw.close();
	}		
}