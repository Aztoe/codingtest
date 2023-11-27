import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

        static  List<Time> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.add(new Time(start,end));

        }

        Collections.sort(list, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if(o1.end==o2.end) {
                   return o1.start-o2.start;
                }
                return o1.end -o2.end;
            }
        });

        int count=0;
        int prev_end= 0;
        for (int i = 0; i < T; i++) {

            Time time = list.get(i);

            if(prev_end<=time.start) {
                prev_end = time.end;
                count++;
            }
        }
        System.out.println(count);

    }

    static class Time {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}