import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] array;
    static int[] node;
    static int N;
     public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int M = Integer.parseInt(br.readLine());
        array = new int[N+1][N+1];
        node = new int[N+1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            array[a][b] =1;
            array[b][a] =1;

        }

        bfs(1);
    }

    public static void bfs(int start) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        node[start]= 1;
        int count =0;
        while (!q.isEmpty()) {

            int x = q.poll();

            for (int i = 1; i <=N ; i++) {
                if(array[x][i]==1 && !(node[i] ==1)) {
                    q.add(i);
                    node[i] = 1;
                     count++;
                }
            }
        }
        System.out.println(count);
    }
}