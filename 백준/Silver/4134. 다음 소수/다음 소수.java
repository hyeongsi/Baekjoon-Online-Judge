import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int loop = Integer.parseInt(br.readLine());

		for (int i = 0; i < loop; i++) {
			BigInteger bi = new BigInteger(br.readLine());
			
			if(!bi.isProbablePrime(10))
				bw.write(bi.nextProbablePrime().toString() + "\n");
			else
				bw.write(bi.toString() + "\n");
		}

		bw.flush();
		bw.close();
	}

}