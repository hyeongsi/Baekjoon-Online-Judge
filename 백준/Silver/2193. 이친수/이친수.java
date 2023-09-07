import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if(n <= 2){
            System.out.println(1);
            return;
        }

        long[][] arr = new long[n+1][2];
        arr[1][0] = 0;
        arr[1][1] = 1;

        arr[2][0] = 1;
        arr[2][1] = 0;

        for (int i = 3; i <= n; i++) {
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }

        System.out.println(arr[n][0] + arr[n][1]);
    }
}