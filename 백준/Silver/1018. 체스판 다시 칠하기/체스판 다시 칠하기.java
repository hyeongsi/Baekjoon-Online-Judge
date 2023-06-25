import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		int c;
		
		String[] board = new String[y];
		for(int i = 0; i < y; i++) {
			board[i] = br.readLine();
		}
		
		for(int i = 0; i <= y - 8; i ++) {
			for(int j = 0; j <= x - 8; j ++) {
				c = getColoring(board.clone(), i, j);
				
				if(min > c) {
					min = c;
				}
			}
		}
		
		System.out.println(min);
	}

	private static int getColoring(String[] board, int y, int x) {
		
		int coloring = 0;
		char startColor = board[y].charAt(x);
		
		for(int i = 0; i < 8; i ++) {
			for(int j = 0; j < 8; j ++) {
				
				if(board[y + i].charAt(x + j) != startColor ) 	
					coloring++;		
	
				startColor = (startColor == 'W')? 'B' : 'W';
			}
			startColor = (startColor == 'W')? 'B' : 'W';
		}
		
		return Math.min(coloring, 64-coloring);
	}
}