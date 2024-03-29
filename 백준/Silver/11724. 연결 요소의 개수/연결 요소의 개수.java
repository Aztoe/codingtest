import java.util.Scanner;

public class Main {
    static  int n,m,count;
    static  int[][] graph;
    static boolean[]  visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();
         m =sc.nextInt();
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] =1;
            graph[b][a] =1;
        }
        count = 0;
        for (int i = 1; i <=n ; i++) {
          if(!visited[i]) {
              dfs(i);
              count++;
          }
        }
        System.out.println(count);
    }


    static void dfs(int v) {

        visited[v] = true;
        for (int i = 1; i <= n; i++) {
            if(graph[v][i]==1 &&!visited[i]) {
                dfs(i);
            }

        }
    }
}