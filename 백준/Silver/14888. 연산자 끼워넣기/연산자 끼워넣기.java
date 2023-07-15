import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static String[] opArr;
	static String[] opCalc;
	static boolean[] path;
	
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	
		
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] opCnt = new int[4];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			opCnt[i] = Integer.parseInt(st.nextToken());
		}
		
		String[] opStr = {"+", "-", "*", "/"};
		opArr = new String[n-1];		// 연산자 개수는 항상 입력숫자 -1
		opCalc = new String[n-1];
		path = new boolean[n-1];
		int idx = 0;
		
		for(int i = 0; i < opCnt.length; i++) {
			for(int j = 0; j < opCnt[i]; j++) {
				opArr[idx++] = opStr[i];				
			}
		}
		
		acc(0, -1);
		System.out.println(max);
		System.out.println(min);
	}
	
	static void acc(int deep, int e) {
		if(deep == arr.length-1) {
			int result = arr[0];
			for(int i = 0; i < opCalc.length; i++) {
				
				switch (opCalc[i]) {
				case "+":
					result += arr[i+1];
					break;
				case "-":
					result -= arr[i+1];
					break;
				case "*":
					result *= arr[i+1];
					break;
				case "/":
					result /= arr[i+1];
					break;
				}
			}
			
			if(max < result)
				max = result;
			
			if(min > result)
				min = result;
			return;
		}
		
		for(int i = 0; i < opArr.length; i++) {
			if(path[i])
				continue;
			
			path[i] = true; 
			opCalc[deep] = opArr[i];
			acc(deep+1, 1);
			path[i] = false;
		}
	}
}
