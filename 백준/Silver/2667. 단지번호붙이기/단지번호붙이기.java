import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> queue = new LinkedList<>();
    static ArrayList<Integer> apartmentCounts = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];
        visited = new boolean[n][n];
        int apart = 0;
        for (int i = 0; i < n; i++) {
                String str = br.readLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = str.charAt(j)-'0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                    apart++;
                }
            }
        }
        System.out.println(apart);
        Collections.sort(apartmentCounts);
        apartmentCounts.forEach(System.out::println);
    }

    static void bfs(int x, int y) {
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int apartmentCount = 1;

        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int cx = position[0];
            int cy = position[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (isValid(nx, ny) && grid[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    apartmentCount++;
                }
            }
        }

        apartmentCounts.add(apartmentCount);
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }
}