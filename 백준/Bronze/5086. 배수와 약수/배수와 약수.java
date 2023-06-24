import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		String[] stateStr = {"neither", "factor", "multiple"}; // x, 약수, 배수
		int stateIndex;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			stateIndex = 0;
			
			if(a == 0 && b == 0)
				break;
			
			if((a <= b) && (b % a == 0)) {
				stateIndex = 1;
			}
			else if ((a > b) && ((a % b == 0)))
				stateIndex = 2;
			
			System.out.println(stateStr[stateIndex]);
		}
	}
}