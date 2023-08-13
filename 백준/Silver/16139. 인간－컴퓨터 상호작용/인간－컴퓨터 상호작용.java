import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();		// 문자열
		int q = Integer.parseInt(br.readLine());	// 질문의 수
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < q; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char a = st.nextToken().charAt(0);	// 알파벳
			int l = Integer.parseInt(st.nextToken());	// 시작 위치
			int r = Integer.parseInt(st.nextToken());	// 끝 위치
			
			int sum = 0;
			for(int j = l; j <= r; j++) {
				if(S.charAt(j) == a) {
					sum++;
				}
			}
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
}
