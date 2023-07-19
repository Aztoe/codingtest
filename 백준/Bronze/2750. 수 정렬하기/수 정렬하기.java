import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // N 입력받기

        int[] arr = new int[N];  // N개의 수를 저장할 배열 생성

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();  // 수 입력받아 배열에 저장
        }

        Arrays.sort(arr);  // 배열 정렬

        for (int num : arr) {
            System.out.println(num);  // 오름차순으로 출력
        }
    }
}
