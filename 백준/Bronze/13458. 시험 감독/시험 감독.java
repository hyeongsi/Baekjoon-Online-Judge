import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] -= B;    // 총 감독관, 무조건 1명 이상
            cnt++;

            if(arr[i] <= 0)
                continue;

            cnt += arr[i] / C;
            if((arr[i] % C) != 0)
                cnt++;
        }

        System.out.println(cnt);
    }
}