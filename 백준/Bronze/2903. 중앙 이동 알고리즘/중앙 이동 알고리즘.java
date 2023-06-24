import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());

		int dot = 2;
		int addRatio = 0;
		for(int i = 0; i < num; i ++) {
			addRatio = (int)Math.pow(2, i);
			dot += addRatio;
		}
		
		System.out.println(dot * dot);		
	}
}