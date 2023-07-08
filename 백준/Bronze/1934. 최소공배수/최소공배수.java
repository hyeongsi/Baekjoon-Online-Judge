import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(lcm(a,b) + "\n");
		}
		
		System.out.println(sb);
	}
	
	public static int lcm(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		int i = 1;
		int result = 0;
		while(true) {
			result = min * i++;
			if(result % max == 0)
				return result;
		}
	}
}