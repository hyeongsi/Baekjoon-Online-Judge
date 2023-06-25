import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {	
			String str = Integer.toString(i);
			sum = i;
			
			for(int j = 0; j < str.length(); j++) {
				sum += (str.charAt(j)-'0');
			}
			
			if(n == sum) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(0);
	}
}