import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 집의 개수
        int C = Integer.parseInt(st.nextToken());   // 공유기의 개수

        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());    // 집의 좌표
        }

        Arrays.sort(arr);

        int lo = 1;
        int hi = arr[arr.length-1] - arr[0] + 1;

        while (lo < hi){
            int mid = (hi + lo) / 2;

            if(check(arr, mid) < C){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }

        System.out.println(lo - 1);
    }

    static int check(int[] arr, int key){
        int cnt = 1;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int locate = arr[i];

            if(locate - prev >= key){
                prev = arr[i];
                cnt++;
            }
        }

        return cnt;
    }

}
