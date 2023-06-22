import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		
		int loop = Integer.parseInt(br.readLine());
		
		int m;
		String str;
		for(int i = 0; i < loop; i++) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			
			sb = new StringBuilder();
			for(int j = 0; j < str.length(); j++) {
				for(int k = 0; k < m; k++)
					sb.append(str.charAt(j));
			}
			
			System.out.println(sb.toString());
		}
	}
}