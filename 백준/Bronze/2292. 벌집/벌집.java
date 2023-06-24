import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int compare = 0;
		
		int loop = 0;
		int result = 1;
		
		final int hexagon = 6;
		while(compare < num-1) {
			result++;
			loop++;
			
			compare += (hexagon * loop);
		}
			
		System.out.println(result);		
	}
}