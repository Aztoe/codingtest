import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static int[] arr;
    static  int[] answer;
    static  boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

         arr = new int[n];
         answer = new int[m];
         visited = new boolean[n];
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth==m) {
          for (int num: answer) {
              sb.append(num).append(" ");
          }
           sb.append("\n");
           return;
        }

        for (int i = 0; i < n; i++) {
           if(!visited[i]){
               answer[depth] = arr[i];
               visited[i] = true;
               dfs(depth+1);
               visited[i] =false;
           }

        }
    }
}