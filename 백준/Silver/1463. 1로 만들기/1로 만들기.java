import java.util.Scanner;

public class Main {
    static int[] visited;
    static int count=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        visited = new int[1000001];
        dfs(N,0);
        System.out.println(count);
    }

    public static void dfs(int start, int depth) {

            if(depth >= count || start<1) return;

            if(start ==1) {
                count = depth;
                return;
            }
            if (start % 2 == 0) {
                dfs(start / 2, depth + 1);
            }

            if (start % 3 == 0) {
                dfs(start / 3, depth + 1);
            }



            dfs(start - 1, depth + 1);
            visited[start] = 1;
        }


}