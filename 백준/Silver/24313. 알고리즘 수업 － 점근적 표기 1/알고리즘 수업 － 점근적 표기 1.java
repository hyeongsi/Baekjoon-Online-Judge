import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[2];
		boolean define = true;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		a[1] = Integer.parseInt(st.nextToken());
		a[0] = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
		for(int n = n0; n <= 100; n++) {
			if(!((a[1] * n + a[0]) <= (c * n))) {
				define = false;
				break;
			}
		}
		
		if(define)
			System.out.println(1);
		else
			System.out.println(0);
	}
}