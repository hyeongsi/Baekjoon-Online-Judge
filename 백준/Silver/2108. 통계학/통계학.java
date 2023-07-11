import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = Integer.parseInt(br.readLine());
		
		int[] arr = new int[loop];
		int[] frequency = new int[8001];
		for(int l = 0; l < loop; l++) {
			int value = Integer.parseInt(br.readLine());
			arr[l] = value;
			frequency[value + 4000]++;
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for(int i = 0; i < loop; i++) {
			sum += arr[i];
		}
		sb.append(Math.round((float)sum / arr.length) + "\n");
		sb.append(arr[arr.length/2] + "\n");
		
		ArrayList<Integer> freArr = new ArrayList<>();
		int mostFreq = 0;
		for(int i = 0; i < 8001; i++) {
			if(frequency[i] == 0)
				continue;
			
			if(mostFreq < frequency[i]) {
				mostFreq = frequency[i];
				freArr.clear();
			}
			
			if(mostFreq == frequency[i]) {
				freArr.add(i);
			}
		}
		
		Collections.sort(freArr);
		if(freArr.size() > 1) {
			sb.append(freArr.get(1)-4000);
		}else {
			sb.append(freArr.get(0)-4000);
		}
		sb.append("\n");
		
		sb.append(arr[arr.length-1] - arr[0]);
		System.out.println(sb);
	}
}