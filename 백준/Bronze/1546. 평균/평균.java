import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int arrSize = Integer.parseInt(br.readLine());
		double[] scoreArr = new double[arrSize];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < arrSize; i++) {
			scoreArr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(scoreArr);
		
		double sum = 0.0;
		for(int i = 0; i < arrSize; i++) {
			sum += scoreArr[i] / scoreArr[scoreArr.length - 1] * 100.0;
		}
		
		System.out.println(sum / arrSize);
	}
}