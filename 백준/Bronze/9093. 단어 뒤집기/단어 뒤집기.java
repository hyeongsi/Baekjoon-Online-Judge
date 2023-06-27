import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int loop = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String str = st.nextToken();	
				
				for(int j = str.length()-1; j >= 0; j--) {
					sb.append(str.charAt(j));
				}
				
				sb.append(" ");
			}
			
			sb.append("\n");	
		}
		
		System.out.println(sb);
	}		
}