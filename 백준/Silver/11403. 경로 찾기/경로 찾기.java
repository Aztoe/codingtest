import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] graph;	
    static int[][] result;	
    static int[] visit;	
    static int N;	

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(start);

        while(!q.isEmpty()) {
            int temp = q.poll();
            for(int i=0; i<N; i++) {
                if(graph[temp][i] == 1 && visit[i] != 1) {
                    q.offer(i);
                    visit[i] = 1;
                    result[start][i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new int[N][N];
        result = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            visit = new int[N];  // i 돌 때마다 visit 다시 생성 해줘야함 이것때매 해멨네 아오
            bfs(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        sc.close();
    }

}