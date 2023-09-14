import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 설탕의 무게 입력
        int N = scanner.nextInt();
        
        // 최소한의 봉지 개수 계산
        int result = solve(N);
        
        // 결과 출력
        System.out.println(result);
        
        scanner.close();
    }
    
    // 최소한의 봉지 개수 계산하는 함수
    public static int solve(int N) {
        // 5킬로그램 봉지를 최대한 사용하고 남은 무게를 계산
        int count = N / 5;
        N %= 5;
        
        // 3킬로그램 봉지를 추가로 사용하여 남은 무게를 정확히 0으로 만들 수 있는지 확인
        while (count >= 0) {
            if (N % 3 == 0) {
                return count + (N / 3);
            }
            
            // 5킬로그램 봉지 하나를 빼고 3킬로그램 봉지 하나를 추가
            count--;
            N += 5;
        }
        
        // 정확한 무게를 만들 수 없는 경우
        return -1;
    }
}
