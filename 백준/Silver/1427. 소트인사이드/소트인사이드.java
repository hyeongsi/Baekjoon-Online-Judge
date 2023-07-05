import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		
		Integer[] iArr = new Integer[arr.length];
		for(int i = 0; i < arr.length; i++) {
			iArr[i] = arr[i] - '0';
		}

		Arrays.sort(iArr, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < iArr.length; i++)
			sb.append(iArr[i].intValue());
		
		System.out.println(sb);
	}
}