import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 나무의 수
        int M = Integer.parseInt(st.nextToken());   // 집으로 가져가려고 하는 나무 길이

        int max = 0;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        long lo = 0;
        long hi = max;

        while(lo < hi){
            long mid = (lo + hi) / 2;

            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                long cut = arr[i] - mid;
                if(cut > 0){
                    sum += cut;
                }
            }

            if(sum < M){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }

        System.out.println(lo - 1);
    }

}
