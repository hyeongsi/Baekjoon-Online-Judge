import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder sb = null;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		 while((str = br.readLine()) != null){ 
            int n = Integer.parseInt(str);
            int len = (int) Math.pow(3, n);
			
            sb = new StringBuilder();
            for(int i = 0; i < len; i++) {
            		sb.append('-');
            }
            
            kantoer(0, len);
            System.out.println(sb);
		}
	}
	
	public static void kantoer(int start, int size) {
		if(size == 1)
			return;
		
		int div = size / 3;
		int sIdx = start + div;
		for(int i = sIdx; i< sIdx + div; i++) {
			sb.setCharAt(i, ' ');
		}
		
		kantoer(start, div);
		kantoer(start + 2 * div, div);
	}
}
