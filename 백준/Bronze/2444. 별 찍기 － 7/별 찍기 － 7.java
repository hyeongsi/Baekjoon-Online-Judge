import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n-1; j++)
				bw.write(" ");
			for(int k = 0; k < 2*i+1; k++)
				bw.write("*");
			bw.newLine();
		}
		
		for (int i = n-1; i > 0; i--) {
			for(int j = n; j > i; j--)
				bw.write(" ");
			for(int k = 2*i-1; k > 0; k--)
				bw.write("*");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
}