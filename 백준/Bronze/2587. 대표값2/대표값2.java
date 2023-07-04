import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		int sum = 0;
		for(int n = 0; n < 5; n++) {
			arr[n] = Integer.parseInt(br.readLine());
			sum += arr[n];
		}
		Arrays.sort(arr);
		
		System.out.println(sum / 5);
		System.out.println(arr[2]);
	}	
}