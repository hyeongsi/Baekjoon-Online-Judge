import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int white = 0;
	static int blue = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		for(int y = 0; y < N; y++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int x = 0; x < N; x++) {
				arr[y][x] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
	}
	
	static void divide(int iy, int ix, int div) {
		boolean isdivide = false;
		
		int prevValue = arr[iy][ix];
		if(div == 1) {
			cnt(prevValue);
			return;
		}
		
		escape:
		for(int y = iy; y < iy+div; y++) {
			for(int x = ix; x < ix+div; x++) {
				if(prevValue != arr[y][x]) {
					isdivide = true;
					break escape;
				}
			}
		}
		
		if(isdivide) {
			int half = div/2;
			
			divide(iy, ix, half);
			divide(iy+half, ix, half);
			divide(iy, ix+half, half);
			divide(iy+half, ix+half, half);
		}else {
			cnt(prevValue);
		}
	}
	
	static void cnt(int value) {
		if(value == 0)
			white++;
		else
			blue++;
	}
}
