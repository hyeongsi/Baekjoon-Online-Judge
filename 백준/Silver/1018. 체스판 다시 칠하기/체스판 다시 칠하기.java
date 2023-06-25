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
		int wc;
		int bc;
		
		String[] board = new String[y];
		for(int i = 0; i < y; i++) {
			board[i] = br.readLine();
		}
		
		for(int i = 0; i <= y - 8; i ++) {
			for(int j = 0; j <= x - 8; j ++) {
				wc = getColoring(board.clone(), i, j, true);
				bc = getColoring(board.clone(), i, j, false);
				
				if(min > Math.min(wc, bc)) {
					min = Math.min(wc, bc);
				}
			}
		}
		
		System.out.println(min);
	}

	private static int getColoring(String[] board, int y, int x, boolean isW) {
		
		int coloring = 0;
		
		for(int i = 0; i < 8; i ++) {
			for(int j = 0; j < 8; j ++) {
				
				if(isW) {	// w가 칠해질 순서에
					if(board[y + i].charAt(x + j) != 'W' ) 	// w가 칠해져 있지 않다면
						coloring++;		// 색칠 후 카운팅
				}
				else {		// b가 칠해질 순서에
					if(board[y + i].charAt(x + j) != 'B' )  // b가 칠해져 있지 않다면
						coloring++;		// 색칠 후 카운팅
				}
				
				if(isW)
					isW = false;
				else
					isW = true;			
			}
			
			if(isW)
				isW = false;
			else
				isW = true;
		}
		
		return coloring;
	}
}