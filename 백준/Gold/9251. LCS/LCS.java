import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(br.readLine());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(br.readLine());
		
		int[][] arr = new int[sb1.length()+1][sb2.length()+1];
		
		int max = 0;
		for(int i = 0; i <= sb1.length(); i++) {
			for(int j = 0; j <= sb2.length(); j++) {
				if(i == 0 || j == 0) {
					arr[i][j] = 0;
				}
				else if(sb1.charAt(i-1) == sb2.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1] + 1;
					max = Math.max(max, arr[i][j]);
				}else {
					arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
				}
			}
		}
		
		System.out.println(max);
	}
}