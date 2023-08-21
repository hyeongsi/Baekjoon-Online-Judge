import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static char[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = st.nextToken().toCharArray();
		}
		
		quadTree(0,0,N);
		System.out.println(sb);
	}
	
	static void quadTree(int y, int x, int range) {
		if(check(y, x, range)) {
			sb.append(arr[y][x]);
			return;
		}
		
		int half = range/2;
		
		sb.append("(");
		quadTree(y, x, half);
		quadTree(y, x+half, half);
		quadTree(y+half, x, half);
		quadTree(y+half, x+half, half);
		sb.append(")");
	}
	
	static boolean check(int y, int x, int range) {
		char dot = arr[y][x];
		
		for(int i = y; i < y+range; i++) {
			for(int j = x; j < x+range; j++) {
				if(dot != arr[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}
