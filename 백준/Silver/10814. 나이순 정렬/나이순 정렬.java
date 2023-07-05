import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int sequence = 0;
		Info[] arr = new Info[n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			arr[i] = new Info(age, name, ++sequence);
		}
		
		Arrays.sort(arr, (o1, o2)->{
			if(o1.age == o2.age) {
				return o1.sequence - o2.sequence;
			}
			
			return o1.age - o2.age;
		});
		
		for(Info a: arr) {
			System.out.println(a);
		}
	}
}

class Info{
	int age;
	String name;
	int sequence;
	
	Info(int age, String name, int sequence){
		this.age = age;
		this.name = name;
		this.sequence = sequence;
	}
	
	@Override
	public String toString() {
		return age + " " + name;
	}
}