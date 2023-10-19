import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long A;
    static long B;
    static long C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(B));
    } // end main


    static long pow(long exponent){

        if(exponent == 1){
            return A % C;
        }

        long half = pow(exponent/2);

        if(exponent % 2 == 1){
            return (half * half % C) * A % C;
        }

        return half * half % C;
    }
}
