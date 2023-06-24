import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		int base = Integer.parseInt(st.nextToken());
		
		int result = 0;
		for(int i = str.length()-1; i >=0; i--) {
			char ch = str.charAt(i);
			int temp;
			
			if(Character.isAlphabetic(ch)) {
				temp = ch - 'A' + 10;
			}
			else {
				temp = ch - '0';
			}

			result += temp * Math.pow(base, str.length()-1 - i);
		}
		
		System.out.println(result);
	}
}