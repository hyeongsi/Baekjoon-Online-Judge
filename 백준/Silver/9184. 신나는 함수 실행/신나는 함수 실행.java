import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int wArr[][][] = new int[51][51][51];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int a = 0, b = 0, c = 0;
		while (true) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			if((a == -1 && b == -1 && c == -1))
				return;
			
			System.out.println("w("+a+", "+b+", "+c+") = "+ w(a, b, c));
		}
	}

	public static int w(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			if(wArr[0][0][0] == 0) {
				wArr[0][0][0] = 1;
			}
			
			return wArr[0][0][0];
		}
		
		if (a > 20 || b > 20 || c > 20) {
			if(wArr[20][20][20] == 0) {
				wArr[20][20][20] = w(20,20,20);
			}
			
			return wArr[20][20][20];
		}
		
		if (a < b && b < c) {
			if(wArr[a][b][c-1] == 0)
				wArr[a][b][c-1] = w(a, b, c - 1);
			
			if(wArr[a][b - 1][c - 1] == 0)
				wArr[a][b - 1][c - 1] = w(a, b - 1, c - 1);
			
			if(wArr[a][b - 1][c] == 0)
				wArr[a][b - 1][c] = w(a, b - 1, c);
			
			return wArr[a][b][c-1] + wArr[a][b - 1][c - 1] - wArr[a][b - 1][c];
		}
		
		if(wArr[a-1][b][c] == 0)
			wArr[a-1][b][c] = w(a-1,b,c);
		
		if(wArr[a-1][b-1][c] == 0)
			wArr[a-1][b-1][c] = w(a-1, b-1, c);
		
		if(wArr[a-1][b][c-1] == 0)
			wArr[a-1][b][c-1] = w(a-1, b, c-1);
		
		if(wArr[a-1][b-1][c-1] == 0)
			wArr[a-1][b-1][c-1] = w(a-1, b-1, c-1);
		
		return wArr[a-1][b][c] + wArr[a-1][b-1][c] + wArr[a-1][b][c-1] - wArr[a-1][b-1][c-1];
	}
}
