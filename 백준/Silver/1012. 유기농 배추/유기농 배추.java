import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N,M,K;
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            int[][] map = new int[N][M];
            boolean[][] visited =  new boolean[N][M];

            while (K --> 0) {
                 st = new StringTokenizer(br.readLine());

                int x,y;
                x =Integer.parseInt(st.nextToken());
                y=Integer.parseInt(st.nextToken());

                map[x][y] = 1;

            }
            int[] dx = {-1,1,0,0};
            int[] dy = {0,0,-1,1};
            int answer =0;

            for (int i =  0; i < N; i++) {

                for (int j = 0; j <M; j++) {
                    if(map[i][j] ==1 && !visited[i][j]) {
                        answer++;
                        Stack<int[]> stack = new Stack<>();

                        stack.push(new int[] {i,j});
                        visited[i][j] =true;

                        while(!stack.isEmpty()) {
                            int[] temp = stack.pop();
                            for (int d = 0; d < 4; d++) {
                                int x = temp[0]+dx[d];
                                int y = temp[1]+dy[d];

                                if(x>=0 && y>=0 && x <N && y<M && map[x][y]==1 && !visited[x][y]){
                                    stack.add(new int[] {x,y});
                                    visited[x][y] =true;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(answer);
         }
    }
}