import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashSet<Integer> num = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			num.add(scn.nextInt() % 42);
		}
		scn.close();
		System.out.println(num.size());
	}
}
