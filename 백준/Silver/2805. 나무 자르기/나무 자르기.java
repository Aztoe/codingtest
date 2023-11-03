import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static int[] arr;


    public static long solution(int n, int m ,int[] arr ){
        long start = 0;
        long end = arr[arr.length - 1];
        long answer = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long totalHeight = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    totalHeight += arr[i] - mid;
                }
            }

            if (totalHeight >= m) {
                answer = Math.max(answer, mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        return answer;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        System.out.println(solution(n,m,arr));
    }


}