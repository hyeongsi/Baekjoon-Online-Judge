import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String initStr = br.readLine();
		int m = Integer.parseInt(br.readLine());
		
		LinkedList<Character> list = new LinkedList<>();
		for(int i = 0; i < initStr.length(); i++)
			list.add(initStr.charAt(i));
		
		ListIterator<Character> iter = list.listIterator();
		while(iter.hasNext()) {
			iter.next();
		}
		
		for(int i = 0; i < m; i++) {
			String command = br.readLine();
			char c = command.charAt(0);
			
			switch (c) {
				case 'L':	// 커서를 왼쪽으로 한 칸 옮김(커서가 문장의 맨 앞이면 무시)
					if(iter.hasPrevious())	
						iter.previous();
					break;
				case 'D':	// 커서를 오른쪽으로 한 칸 옮김(커서가 문장의 맨 뒤면 무시)
					if(iter.hasNext())
						iter.next();
					break;
				case 'B':	// 왼쪽에 있는 문자 삭제(커서가 문장의 맨 앞이면 무시)
					if(iter.hasPrevious())	{
						iter.previous();
						iter.remove();
					}
					break;
				case 'P':// 문자 1개더 입력받고 커서 왼쪽에 추가
					iter.add(command.charAt(2));
					break;
			}
		}
		for(Character chr: list) {
			bw.write(chr);
		}
		
		bw.flush();
		bw.close();
	}		
}