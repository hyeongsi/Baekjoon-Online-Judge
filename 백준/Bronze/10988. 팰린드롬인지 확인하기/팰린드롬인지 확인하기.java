import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr = br.readLine().toCharArray();
		
		int result = 0;
		for(int i = 0; i <= arr.length/2; i++){
			if(arr[i] == arr[arr.length-1-i]) {
				result = 1;
			}
			else {
				result = 0;
				break;
			}
		}
		
		System.out.println(result);
	}
}