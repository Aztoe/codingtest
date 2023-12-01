import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> -Integer.compare(a, b));

        int N = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0 && pq.isEmpty()) {
                result.append("0\n");
            } else if (x != 0) {
                pq.add(x);
            } else {
                result.append(pq.poll()).append("\n");
            }
        }

        System.out.print(result.toString());
    }
}