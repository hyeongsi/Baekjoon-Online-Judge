import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		StringBuilder ans = new StringBuilder(arr[0]);
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				if(ans.charAt(j) != arr[i].charAt(j)) {
					ans.setCharAt(j, '?');
				}
			}
		}
		
		System.out.println(ans);
	}
}
