import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
        static int n,m;
        static  int[] arr;

        public static long solution(int n,int m,int[] arr) throws IOException {

            long start = 1;
            long end = arr[arr.length - 1];
            long answer =0;

            while (start <= end) {
                int length = 0;

                long mid = (start + end) / 2;
                for (int i = 0; i < n; i++) {
                    length += arr[i] / mid;

                }

                if (length < m) {
                    end = mid - 1;
                } else {
                    start= mid+1;
                    answer = mid;
                }

            }
            return answer;
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(solution(n,m,arr));
    }
}