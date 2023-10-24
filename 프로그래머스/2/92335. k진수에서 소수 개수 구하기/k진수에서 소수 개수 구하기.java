
import java.io.IOException;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws IOException {
        Solution t = new Solution();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(t.solution(N, K));

    }

    public int solution(int N, int K) {


        if (N == 0) {
            return 0;

        }

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            long num = N % K;
            sb.insert(0, num); //0 인덱스에 num 삽입
            N /= K;
        }
        int primeCount = countPrimes(sb.toString());
        return primeCount;

    }
    public int countPrimes(String s) {
        int count = 0;
        String[] numbers = s.split("0");
        for (String numStr : numbers) {
            if(!numStr.isEmpty()) {
                long num = Long.parseLong(numStr);
                if (isPrime(num)) {
                    count++;
            }

            }
        }
        return count;

    }


    public boolean isPrime(long n) {
        if(n <= 1) return false;
        else if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }

    }


