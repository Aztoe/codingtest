import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m,answer=0;
    static int[][] map ,dis;
    static  int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

    static boolean[][] visited;

   static Queue<int []> q = new LinkedList<>();

   static void bfs() {

       while (!q.isEmpty()) {
           int[] position = q.poll();
           int cx = position[0];
           int cy = position[1];

          for (int[] dir:directions) {
              int nextX = cx+dir[0];
              int nextY = cy+dir[1];

              if (!(nextX >= 0 && nextY >= 0 && nextX < m && nextY < n)) {
                  continue;
              }

              if (map[nextY][nextX] != 0) {
                  continue;
              }

              q.add(new int[] {nextX,nextY});
              map[nextY][nextX] = map[cy][cx] + 1;
              answer = Math.max(answer, map[nextY][nextX]);
          }
       }
   }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());

        n = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1) q.add(new int[] {j,i});

            }
        }
        
        bfs();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    answer = -1;
                    break;
                }
            }
        }
        if (answer == 0 ) { 
            System.out.println(0);
        } else if(answer == -1) {
            System.out.println(-1);
        }else{ 
            System.out.println(answer-1);
        }

    }
}