import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());	
		
		int compare = 1;
		int sum = 2;
		
		while(compare < num) {
			compare += sum;
			sum++;
		}
		
		String result;
		int diff = compare - num;
		
		if(sum % 2 == 1) {	// 위->아래순서를 역순으로 계산, -1씩 이동
			result = (sum - diff - 1) + "/" + (diff + 1);
		}
		else{	// 아래->위순서를 순차대로 계산, +1씩 이동
			result = (diff + 1) + "/" + (sum - diff - 1);
		}
		
		System.out.println(result);
	}
}