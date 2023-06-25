import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(br.readLine());
		
		int[]x = {Integer.MAX_VALUE, Integer.MIN_VALUE};	// min, max
		int[]y = {Integer.MAX_VALUE, Integer.MIN_VALUE};	// min, max
		
		for(int i = 0; i < loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int dotX = Integer.parseInt(st.nextToken());
			int dotY = Integer.parseInt(st.nextToken());
			
			if(x[0] > dotX) {
				x[0] = dotX;
			}
			if(x[1] < dotX) {
				x[1] = dotX;
			}
			
			if(y[0] > dotY) {
				y[0] = dotY;
			}
			if(y[1] < dotY) {
				y[1] = dotY;
			}
		}
		
		System.out.println((x[1]-x[0]) * (y[1]-y[0]));
	}
}