import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        static int n;
        static int[][] array;
        static boolean[] visited;
        static int Min = Integer.MAX_VALUE;
     public static void dfs(int index, int depth) {
         if(depth==n/2) {
             solution();
             return;
         }

         for (int i = index; i <n ; i++) {
             if(!visited[i]) {
                 visited[i] = true;
                 dfs(i+1,depth+1);
                 visited[i] = false;
             }

         }
     }

     static  void solution() {
         int team_start = 0;
         int team_link =0;

         for (int i = 0; i < n-1; i++) {
             for (int j = i+1; j <n ; j++) {
                 if (visited[i] && visited[j]) {
                     team_start += array[i][j]+array[j][i];
                   ;

                 } else if (!visited[i] && !visited[j]) {
                        team_link += array[i][j]+array[j][i];
                 }
             }
         }
         int val = Math.abs(team_start-team_link);

      
         Min = Math.min(val,Min);
     }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
         array = new int[n][n];
         visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0,0);
        System.out.println(Min);
    }


}