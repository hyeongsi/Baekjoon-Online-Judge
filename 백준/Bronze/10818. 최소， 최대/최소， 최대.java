import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int loop = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int cmp;
		for(int i=0; i<loop; i++) {
			cmp = Integer.parseInt(st.nextToken());
			if(max < cmp) {
				max = cmp;
			}
			if(min > cmp) {
				min = cmp;
			}
		}
		
		bw.write(min + " " + max);
		bw.flush();
		
		bw.close();
		br.close();
	}
}