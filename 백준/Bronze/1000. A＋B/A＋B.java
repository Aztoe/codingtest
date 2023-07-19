import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 정수 A와 B를 입력받습니다.
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        // A와 B를 더한 결과를 출력합니다.
        int sum = A + B;
        System.out.println(sum);
    }
}
