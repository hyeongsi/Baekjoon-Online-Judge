import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int im = Integer.parseInt(st.nextToken());

        if (kim < 1 || im < 1) {
            System.out.println(-1);
            return;
        }

        int round = 0;
        while (n != 1) {
            round++;
            n = n / 2 + (n % 2);

            if (Math.max(kim, im) % 2 == 0 && Math.abs(kim - im) == 1) {
                break;
            }

            kim = kim / 2 + (kim % 2);
            im = im / 2 + (im % 2);
        }

        System.out.println(round);
    }// end main
}

