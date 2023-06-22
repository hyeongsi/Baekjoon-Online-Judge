import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = br.readLine().toCharArray();
		int[] dial = {2,2,2, 3,3,3, 4,4,4, 5,5,5, 6,6,6, 7,7,7,7, 8,8,8, 9,9,9,9 };
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += dial[(int)(arr[i] - 'A')];
		}
		
		System.out.println(sum + arr.length);
		
	}
}