import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(n > 0) {
			arr.add(n%10);
			n/=10;
		}
		
		Collections.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = arr.size()-1; i >= 0; i--) {
			sb.append(arr.get(i));
		}
		
		System.out.println(sb);
	}
}