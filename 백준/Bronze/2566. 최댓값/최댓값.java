import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] matrix = new String[9][9];
		int[] max = new int[3]; // 값, 행, 열
		max[0] = -1;
		
		for(int i = 0; i < 9; i++) {
				matrix[i] = br.readLine().split(" ");
		}
		
		for(int i = 0; i < 9; i ++) {
			for(int j = 0; j < 9; j ++) {
				if(max[0] < Integer.parseInt(matrix[i][j])) {
					max[0] = Integer.parseInt(matrix[i][j]);
					max[1] = i + 1;
					max[2] = j + 1;
				}	
			}
		}
		
		System.out.println(max[0]);
		System.out.println(max[1] + " " + max[2]);
	}
}