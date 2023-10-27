import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Main t = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        System.out.println(t.solution(N,T));
    }

    public int solution(int N, int K) {
        int answer =0;
        int count =0;
        int[] arr = new int[N+1];

        for (int i = 2; i < arr.length ; i++) {
            if (isPrime(i)) {
                for (int j = i; j <= N; j+=i) {
                    if(arr[j]==0) {
                        arr[j]=1;
                        count++;
                        if(count==K){
                            answer =j;
                        }
                    }

                }
            }

        }
        return  answer;
    }

    public boolean isPrime(int num) {
        if(num == 0 || num==1) {
            return  false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}