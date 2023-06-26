import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] sugar = {5,3};
		int ans = -1;
		
		int fCnt = n / sugar[0];
		while(fCnt >= 0) {
			int rest = n - (sugar[0] * fCnt);
			
			if(rest % sugar[1] == 0) {
				ans = fCnt + (rest/sugar[1]);
				break;
			}
				
			fCnt--;
		}
		
		System.out.println(ans);
	}			
}