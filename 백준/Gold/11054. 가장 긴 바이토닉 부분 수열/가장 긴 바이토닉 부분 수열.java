import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int[] dpA;
	static int[] dpD;
	static int N;
	static int max = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		dpA = new int[N];
		dpD = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			dpA[i] = 1;
			for(int j = i-1; j >=0 ; j--) {			
				if(arr[i] > arr[j]) {
					dpA[i] = Math.max(dpA[i], dpA[j]+1);
				}
			}
		}
		
		for(int i = N-1; i >= 0; i--) {
			dpD[i] = 1;
			for(int j = i+1; j < N; j++) {			
				if(arr[i] > arr[j]) {
					dpD[i] = Math.max(dpD[i], dpD[j]+1);
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			max = Math.max(max, dpA[i] + dpD[i]);
		}	
		System.out.println(max-1);
	}
}