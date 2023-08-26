import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N = N / 100 * 100;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 100; i++) {
            int temp = N + i;

            if(temp % F == 0) {
                min = Math.min(min, temp % 100);
            }
        }

        if(min < 10){
            System.out.println("0" + min);
        }else{
            System.out.println(min);
        }
    }

}
