import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

        static  int n,m,v;
        static  int[][] graph;
        static  boolean[] visited;
        static Queue<Integer>  q = new LinkedList<>();
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
                n = Integer.parseInt(st.nextToken());
                m = Integer.parseInt(st.nextToken());
                v = Integer.parseInt(st.nextToken());

                graph = new int[n+1][n+1];
                visited= new boolean[n+1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b]=1;
            graph[b][a]=1;
        }

        dfs(v);
        System.out.println("");
        visited = new boolean[n+1];
        bfs(v);
    }

    static void dfs(int v) {

        visited[v] = true;
        System.out.print(v+" ");
        for (int i = 1; i <=n ; i++) {

            if(!visited[i] && graph[v][i] ==1 ) {
                dfs(i);


            }
        }
    }

    static  void bfs(int v) {
        q.add(v);
        visited[v] = true;
        while (!q.isEmpty()) {

            v= q.poll();
            System.out.print(v+" ");
            for (int i = 1; i <=n ; i++) {
                if(graph[v][i]==1 && !visited[i]) {
                    q.add(i);
                    visited[i]= true;
                }
            }
        }
    }
}