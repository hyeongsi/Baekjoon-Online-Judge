import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int loop = Integer.parseInt(br.readLine());
		
		String[] str = new String[loop];
		for(int i = 0; i < loop; i++) {
			str[i] = br.readLine();
		}
		
		int result = 0;
		int prev = -1;
		
		for(int i = 0; i < str.length; i++) {
			boolean[] alphabet = new boolean[26];
			
			for(int j = 0; j < str[i].length(); j++) {
				if(alphabet[str[i].charAt(j)-'a'] == false) {
					alphabet[str[i].charAt(j)-'a'] = true;
					prev = str[i].charAt(j)-'a';
				}
				else if(alphabet[str[i].charAt(j)-'a'] == true){
					if(prev != str[i].charAt(j)-'a') {
						prev = -1;
						break;
					}
				}
			}
			
			if(prev != -1)
				result++;
		}
		
		System.out.println(result);
	}
}