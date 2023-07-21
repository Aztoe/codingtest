import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int[] result = changeAlarmTime(H, M);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] changeAlarmTime(int H, int M) {
        M -= 45;
        if (M < 0) {
            H -= 1;
            M += 60;
        }

        if (H < 0) {
            H = 23;
        }

        int[] result = {H, M};
        return result;
    }
}
