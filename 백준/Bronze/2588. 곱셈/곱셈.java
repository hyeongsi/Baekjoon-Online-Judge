import java.util.Scanner;

public class Main{
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String sNum = sc.next();
		
		for(int i = sNum.length()-1; i >=0; i--) {
			System.out.println(num * (Character.getNumericValue(sNum.charAt(i))));
		}
		
		System.out.println(num * Integer.parseInt(sNum));
		
		sc.close();
	}
}