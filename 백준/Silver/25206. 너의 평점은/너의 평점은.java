import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sum = 0.0;
		double totalCredit = 0.0;

		final int loop = 20;
		
		for(int i = 0; i < loop; i++){
			String[] str = br.readLine().split(" ");	// 과목명, 학점, 평점
			
			if(!str[2].equals("P")) {
				sum += Double.parseDouble(str[1]) * acc(str[2]);
				totalCredit += Double.parseDouble(str[1]);
			}
		}
		
		System.out.println(Math.ceil(sum / totalCredit * 1000000) / 1000000.0);
	}
	
	public static double acc(String str) {
		switch(str) {
		case "A+": return 4.5;
		case "A0": return 4.0;
		case "B+": return 3.5;
		case "B0": return 3.0;
		case "C+": return 2.5;
		case "C0": return 2.0;
		case "D+": return 1.5;
		case "D0": return 1.0;
		default: return 0.0;
		}
	}
}