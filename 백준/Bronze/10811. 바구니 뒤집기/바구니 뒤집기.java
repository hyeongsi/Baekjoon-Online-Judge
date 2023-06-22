import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] bktArr = new int[n];
		Arrays.setAll(bktArr, num->num+1);
		
		int bkt_i, bkt_j;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			bkt_i = Integer.parseInt(st.nextToken()) - 1;
			bkt_j = Integer.parseInt(st.nextToken()) - 1;
			
			int temp;
			for(int j = 0; j < (bkt_j - bkt_i) / 2f; j++) {
				temp = bktArr[bkt_i + j];
				bktArr[bkt_i + j] = bktArr[bkt_j - j];
				bktArr[bkt_j - j] = temp;
			}
		}
		br.close();
		
		for(int i : bktArr)
			System.out.print(i + " ");
	}
}