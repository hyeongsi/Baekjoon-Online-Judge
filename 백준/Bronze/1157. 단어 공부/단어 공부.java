import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int str = br.read();
		int[] arr = new int[26];
		
		while(str > ' ') {	// \r(13), \n(10), ' '(32) 
			if(str >= 'A' && str <= 'Z')
				arr[str - 'A']++;
			else
				arr[str - 'a']++;
			
			str = br.read();
		}
		
		int[] max = {0,0}; // maxValue, index
		boolean dup = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(max[0] < arr[i]) {
				dup = false;
				max[0] = arr[i];
				max[1] = i;
			}
			else if(max[0] == arr[i]) {
				dup = true;
			}
		}
		
		System.out.println(dup==true? '?':(char)(max[1]+'A'));
	}
}