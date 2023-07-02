import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Pos{
	int x;
	int y;
	
	Pos(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		List<Pos> list = new LinkedList<>();
		
		for(int i = 0; i < k; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list.add(new Pos(x,y));
		}
		
		Collections.sort(list, (p1, p2)->{
			if(p1.x == p2.x) {
				return p1.y - p2.y;
			}
			
			return p1.x - p2.x;
		});
		
		for(Pos p : list) {
			System.out.println(p.x + " " + p.y);
		}
	}	
}