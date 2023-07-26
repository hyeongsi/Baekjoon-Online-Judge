import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int B_SIZE = 9;
	static int[][] arr = new int[B_SIZE][B_SIZE];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < B_SIZE; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < B_SIZE; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		sudoku(0, 0);
	}

	public static void sudoku(int row, int col) {
		
		if(col == B_SIZE) {
			sudoku(row+1, 0);
			return;
		}
		
		if(row == B_SIZE) {
			print();
		}
		
		if(arr[row][col] == 0) {
			for(int i = 1; i <= B_SIZE; i++) {
				if(possibility(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col+1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		
		sudoku(row, col+1);
	}
	
	public static boolean possibility(int row, int col, int value) {
		for(int i = 0; i < B_SIZE; i++) {
			if(arr[row][i] == value)
				return false;
			
			if(arr[i][col] == value)
				return false;
		}
		
		int set_row = (row / 3) * 3;
		int set_col = (col / 3) * 3;
		
		for(int i = set_row; i < set_row + 3; i++) {
			for(int j = set_col; j < set_col + 3; j++) {
				if(arr[i][j] == value)
					return false;
			}
		}
		
		return true;
	}
	
	public static void print() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < B_SIZE; i++) {
			for (int j = 0; j < B_SIZE; j++) {
				sb.append(arr[i][j]).append(' ');
			}
			sb.append('\n');
		}

		System.out.println(sb);
		System.exit(0);
	}
}