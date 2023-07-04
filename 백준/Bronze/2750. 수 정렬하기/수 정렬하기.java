import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(br.readLine());
		int[] arr = new int[loop];
		for(int n = 0; n < loop; n++) {
			arr[n] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}	
}