import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int l = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int result = 0;
		for(int i = 0; i < l; i++) {
			int n = Integer.parseInt(st.nextToken());
			
			boolean decimal = true;
			for(int j = 2; j <= Math.sqrt(n); j++) {
				if(n % j == 0) {
					decimal = false;
					break;
				}
			}
			
			if(decimal && n != 1)
				result++;
		}
		
		System.out.println(result);
	}
}