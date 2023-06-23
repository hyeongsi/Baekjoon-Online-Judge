import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] chArr = br.readLine().toCharArray();
		
		int result = 0;
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == 'c' && i < chArr.length-1) {
				if(chArr[i+1] == '=' || chArr[i+1] == '-') {
					i++;	
				}
			}
			else if(chArr[i] == 'd' && i < chArr.length-1) {
				if(chArr[i+1] == '-') {
					i++;	
				}
				else if(chArr[i+1] == 'z' && i < chArr.length-2) {
					if(chArr[i+2] == '=') {
						i+=2;
					}
				}
			}
			else if(chArr[i] == 'l' && i < chArr.length-1) {
				if(chArr[i+1] == 'j') {
					i++;	
				}
			}
			else if(chArr[i] == 'n' && i < chArr.length-1) {
				if(chArr[i+1] == 'j') {
					i++;	
				}
			}
			else if(chArr[i] == 's' && i < chArr.length-1) {
				if(chArr[i+1] == '=') {
					i++;	
				}
			}
			else if(chArr[i] == 'z' && i < chArr.length-1) {
				if(chArr[i+1] == '=') {
					i++;	
				}
			}

			result++;
		}
		
		
		System.out.println(result);	
	}
}