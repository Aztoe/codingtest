import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer=0;
        int N = Integer.parseInt(br.readLine());
        int[] array= new int[N];
        int [] sum = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            sum[i] = (i > 0 ? sum[i - 1] : 0) + array[i];  // 올바른 누적합 계산
        }

        for (int num : sum) {
            answer += num;
        }
        System.out.println(answer);
    }
}