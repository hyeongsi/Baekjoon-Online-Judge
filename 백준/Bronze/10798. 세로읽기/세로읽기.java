import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] strArr = new String[15];
		Arrays.fill(strArr, "");
			
		for(int i = 0; i < 5; i++) {
			String[] line = br.readLine().split("");
			for(int j = 0; j < line.length; j++) {
				strArr[j] += line[j];
			}
		}
		
		for(String str:strArr) {
			System.out.print(str);
		}
	}
}