import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		
		int ans = 0;
		boolean first = true;
		while(st.hasMoreTokens()) {
			String formula = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(formula, "+");
			int sum = 0;
			while(st2.hasMoreTokens()) {
				sum += Integer.parseInt(st2.nextToken());
			}
			
			if(first) {
				first = false;
				ans += sum;
			}else {
				ans -= sum;
			}
		}
		
		System.out.println(ans);
	}
}
