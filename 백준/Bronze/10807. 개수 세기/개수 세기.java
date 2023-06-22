import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int loop = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		String find = br.readLine();
		
		int result = 0;
		String[] arr = new String[loop];
		
		for(int i=0; i<loop; i++) {
			arr[i] = st.nextToken();
			if(arr[i].equals(find))
				result++;
		}
		
		System.out.println(result);
		br.close();
	}
}