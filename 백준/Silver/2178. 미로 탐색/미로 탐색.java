import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.LinkedList;
    import java.util.Queue;
    import java.util.StringTokenizer;

    public class Main {
        static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        static  int[][] dist;
        static  int n;
        static  int m;
        static  boolean [][] visited;


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            dist = new int[n][m];
            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                for (int j = 0; j < m; j++) {
                    dist[i][j] = line.charAt(j) -'0';

                }
            }
            visited = new boolean[n][m];
            visited[0][0] = true;
            dfs(0, 0);
            System.out.println(dist[n-1][m-1]);


        }

        private static void dfs(int x, int y) {
            Queue<int[]> que = new LinkedList<>();
            que.add(new int[] {x,y});

            while(!que.isEmpty()){
                int [] positions = que.poll();
                int nx = positions[0];
                int ny = positions[1];

                for (int[] dir : dirs) {

                    int nextX = nx+ dir[0];
                    int nextY = ny+ dir[1];

                    if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
                        continue;
                    if (visited[nextX][nextY] || dist[nextX][nextY] == 0)
                        continue;


                    que.add(new int[] {nextX, nextY});
                    dist[nextX][nextY] = dist[nx][ny] + 1;
                    visited[nextX][nextY] = true;
                }
            }

        }
    }