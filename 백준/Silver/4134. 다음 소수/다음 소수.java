import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int loop = Integer.parseInt(br.readLine());

		for (int i = 0; i < loop; i++) {
			long tmp = Long.parseLong(br.readLine());
			while(true) {
				if(tmp == 0 || tmp == 1) {
					sb.append(2).append('\n');
					break;
				}
				if(getPrime(tmp)) {
					sb.append(tmp).append('\n');
					break;
				}
				tmp++;
			}		
		}
		System.out.println(sb);
	}
	static boolean getPrime(long a) {
		for(long i =2; i<= Math.sqrt(a); i++) {
			if(a%i == 0)
				return false;
		}
		return true;
	}

}