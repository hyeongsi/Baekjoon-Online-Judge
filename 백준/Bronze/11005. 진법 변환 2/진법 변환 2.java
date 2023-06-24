import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int base = Integer.parseInt(st.nextToken());
		
		String result = "";
		
		int quot = 0, remain = 0;
		while(num > 0) {
			quot = num / base;
			remain = num % base;
			
			num = quot;
			if(remain < 10) { // 숫자
				result += Integer.toString(remain);
			}
			else{ // 알파벳
				result += Character.toString((remain + 'A' - 10));
			}
		}
		
		for(int i = result.length()-1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
	}
}