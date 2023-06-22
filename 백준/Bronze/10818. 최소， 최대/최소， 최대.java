import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb;
		
		int loop = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int cmp;
		for(int i=0; i<loop; i++) {
			cmp = Integer.parseInt(st.nextToken());
			
			if(max < cmp) 
				max = cmp;
			
			if(min > cmp) 
				min = cmp;
		}
		br.close();
		
		sb = new StringBuilder();
		sb.append(min).append(" ").append(max);
		
		System.out.println(sb.toString());
		
	}
}