import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int loop = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int targetNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < loop; i++) {
            if (targetNum == Integer.parseInt(st.nextToken())) {
                ++answer;
            }
        }

        System.out.println(answer);
    }
}
