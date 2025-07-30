import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        final int hSugar = 5;
        final int lSugar = 3;

        int ans = -1;

        int cnt = i / hSugar;
        while (cnt >= 0) {
            int rest = i - (hSugar * cnt);

            if (rest % lSugar == 0) {
                ans = cnt + (rest / lSugar);
                break;
            }

            cnt--;
        }

        System.out.println(ans);
    }
}