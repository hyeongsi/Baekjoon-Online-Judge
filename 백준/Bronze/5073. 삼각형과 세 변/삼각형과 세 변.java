import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] a = new int[3];
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int l[] = new int[3];
			l[0] = Integer.parseInt(st.nextToken());
			l[1] = Integer.parseInt(st.nextToken());
			l[2] = Integer.parseInt(st.nextToken());
			
			if(l[0] == 0 && l[1] == 0 && l[2] == 0)
				return;
			
			Arrays.sort(l);
			if(l[0] + l[1] <= l[2]) {
				System.out.println("Invalid");
				continue;
			}
				
			if(l[0] == l[1] && l[0] == l[2])
				System.out.println("Equilateral");
			else if(l[0] == l[1] || l[0] == l[2] || l[1] == l[2])
				System.out.println("Isosceles");
			else
				System.out.println("Scalene");
		}
	}
}