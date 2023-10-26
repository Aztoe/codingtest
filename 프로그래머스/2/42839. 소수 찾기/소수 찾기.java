import java.util.HashSet;

class Solution {
    static boolean[] visited;
    static char[] array;
    static HashSet<Integer> set = new HashSet();
    int count;

    public int solution(String numbers) {
        array = new char[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            array[i] = numbers.charAt(i);
        }
        visited = new boolean[array.length];

        dfs("", 0);

        return (int) set.stream().filter(Solution::isPrime).count();
    }

    public void dfs(String str, int idx) {
        if (idx >= array.length) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                set.add(Integer.parseInt(str + array[i]));
                dfs(str + array[i], idx + 1);
                visited[i] = false;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
