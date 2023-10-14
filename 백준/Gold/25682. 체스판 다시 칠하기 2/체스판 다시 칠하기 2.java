import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] prefixSum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        prefixSum = new int[N+1][M+1];
        for (int i = 1; i <= N; i++) {
            char[] line = br.readLine().toCharArray();

            for (int j = 1; j <= M; j++) {
                int value = wbCheck(i, j, line[j-1]);
                prefixSum[i][j] = pSum(i,j) + value;
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {
                ans = Math.min(getMinBox(i, j, K), ans);
            }
        }

        System.out.println(ans);

    } // end main

    static int wbCheck(int i, int j, char c){
        if((i+j) % 2 == 0){
            return (c == 'W') ? 1 : 0;
        }

        return (c == 'B') ? 1 : 0;
    }

    static int pSum(int i, int j){
        return prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1];
    }

    static int getMinBox(int i, int j, int k){
        int boxSum = prefixSum[i][j] - prefixSum[i][j-k] - prefixSum[i-k][j] + prefixSum[i-k][j-k];
        return Math.min(boxSum, k*k - boxSum);
    }
}
