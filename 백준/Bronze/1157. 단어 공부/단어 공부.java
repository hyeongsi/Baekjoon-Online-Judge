import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] ch = br.readLine().toUpperCase().toCharArray();
		int[] arr = new int['Z'-'A'+1];
		
		for(int i = 0; i < ch.length; i++) {
			arr[(int)(ch[i] - 'A')] +=1;
		}
		
		boolean dup = false;
		int index = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[index] < arr[i]) {
				dup = false;
				index = i;
			}
			else if(arr[index] == arr[i])
				dup = true;
		}
		
		if(dup)
			System.out.println("?");
		else
			System.out.println((char)(index + 'A'));
	}
}