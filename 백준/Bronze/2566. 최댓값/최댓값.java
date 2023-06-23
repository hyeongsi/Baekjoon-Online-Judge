import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] max = new int[3]; // 값, 행, 열
		max[0] = -1;
		
		for(int i = 0; i < 9; i ++) {
			String[] strArr = br.readLine().split(" ");
			
			for(int j = 0; j < 9; j ++) {
				int value = Integer.parseInt(strArr[j]);
				
				if(max[0] < value) {
					max[0] = value;
					max[1] = i + 1;
					max[2] = j + 1;
				}	
			}
		}
		
		System.out.println(max[0]);
		System.out.println(max[1] + " " + max[2]);
	}
}