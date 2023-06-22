import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int arrSize = Integer.parseInt(br.readLine());
		double[] scoreArr = new double[arrSize];
		
		double max = Double.MIN_VALUE;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arrSize; i++) {
			scoreArr[i] = Double.parseDouble(st.nextToken());
			if(max < scoreArr[i])
				max = scoreArr[i];
		}
		
		double sum = 0.0;
		for(int i = 0; i < arrSize; i++) {
			sum += scoreArr[i] / max * 100.0;
		}
		
		System.out.println(sum / arrSize);
	}
}