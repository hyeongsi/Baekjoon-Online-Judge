import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] changes = {25, 10, 5, 1};
		
		int loop = Integer.parseInt(br.readLine());
		for(int i = 0; i < loop; i++) {
			int change = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < changes.length; j++) {
				System.out.print(change / changes[j] + " ");
				change = change % changes[j];
			}
			System.out.println();
		}
	}
}