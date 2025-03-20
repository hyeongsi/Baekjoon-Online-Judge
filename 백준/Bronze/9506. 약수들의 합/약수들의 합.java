import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		while(true) {
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1)
				return;
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for(int i = 1; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					al.add(i);
					al.add(n / i);
				}
			}
			
			Collections.sort(al);

			int sum = 0;
			
			sb.append(n + " = ");
			for(int i = 0; i < al.size() - 1; i++) {
				int v = al.get(i);
				sum += v;
				
				sb.append(v + " + ");
			}
			
			if(sum == n) {
				sb.delete(sb.length()-3, sb.length()-1);
				System.out.println(sb);
			}
			else
				System.out.println(n + " is NOT perfect.");
		}	
	}
}