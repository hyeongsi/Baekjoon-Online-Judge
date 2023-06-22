import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] studentArr = new boolean[30];
		Arrays.fill(studentArr, false);
		
		for(int i = 0; i < 28; i++) {
			studentArr[Integer.parseInt(br.readLine())-1] = true; 
		}
		
		for(int i = 0; i < 30; i++) {
			if(studentArr[i] == false)
				System.out.println(i+1);
		}
		
		br.close();
	}
}