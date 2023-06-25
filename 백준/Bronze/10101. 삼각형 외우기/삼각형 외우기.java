import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[3];
		
		for(int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		if((a[0] + a[1] + a[2]) != 180) {
			System.out.println("Error");
			return;
		}
		
		if((a[0] == a[1])) {
			if(a[0] == a[2]) {
				System.out.println("Equilateral");
			}
			else {
				System.out.println("Isosceles");
			}
		}
		else if((a[0] == a[2])) {
			if(a[1] == a[2]) {
				System.out.println("Equilateral");
			}
			else {
				System.out.println("Isosceles");
			}
		}
		else if((a[1] == a[2])) {
			if(a[0] == a[1]) {
				System.out.println("Equilateral");
			}
			else {
				System.out.println("Isosceles");
			}
		}
		else {
			System.out.println("Scalene");
		}	

	}
}