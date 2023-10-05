import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static  int[] coin= {500,100, 100, 50,10,5,1};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int charge = 1000-N;
        int count =0;

        for (int i = 0; i < coin.length; i++) {
            while (charge>= coin[i]) {
                charge -= coin[i];
                count++;
            }
            
        }
        System.out.println(count);

    }

}