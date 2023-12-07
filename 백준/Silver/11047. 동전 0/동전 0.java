import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static  int[] money;
    static int N,M;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         money = new int[N];
         for (int i = 0; i < N; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solution());


    }

    public static int solution() {
         count =0;
        for (int i =N-1; i >=0 ; i--) {
            if(money[i]<=M) {
                count += M/money[i];
                M = M%money[i];
            }

        }
        return count;
    }


    }