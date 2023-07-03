import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String p = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String arr = br.readLine();
			arr = arr.substring(1, arr.length()-1);
			StringTokenizer st = new StringTokenizer(arr, ",");
			
			int[] iArr = new int[n];
			for(int j = 0; j < n; j++) {
				iArr[j] = Integer.parseInt(st.nextToken());
			}
			
			Boolean error = false;
			Boolean reverse = false;
			int front = 0;
			int back = n-1;
			
			outer:
			for(int j = 0; j < p.length(); j++) {		
				switch(p.charAt(j)) {
				case'R':
					reverse = !reverse;
					break;
				case'D':
					if(back == -1 || front > back) {
						error = true;
						break outer;
					}
					
					if(reverse) {
						iArr[back] = -1;
						back--;
					}
					else {
						iArr[front] = -1;
						front++;
					}
					break;
				}
			}
					
			if(error) {
				sb.append("error\n");
			}
			else {
				sb.append("[");
				if(reverse) {
					for(int j = back; j >= front ; j--)
						sb.append(iArr[j] + ",");
				}
				else {
					for(int j = front; j <= back ; j++)
						sb.append(iArr[j] + ",");
				}
				if(!(back == -1 || front > back))
					sb.deleteCharAt(sb.length()-1);
				sb.append("]\n");
			}
		}
		
		System.out.println(sb);
	}	
}