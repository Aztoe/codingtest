import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(br.readLine()); // 빌딩 개수
            int[] array = new int[n];
             StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;

            for (int i = 0; i < n; i++) {   //testcase 빌딩 높이 배열 저장
                array[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 2; i < n-2; i++) {
                int max=0;
                max =Math.max(array[i-2],array[i-1]);
                max = Math.max(max,array[i+1]);
                max= Math.max(max,array[i+2]);

                int num = array[i]-max;
                if(num>0) {
                    answer +=num;
                }

            }
            System.out.println("#"+tc+" "+answer);
        }

    }
}