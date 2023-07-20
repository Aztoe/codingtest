# [Bronze II] 나머지 - 3052 

[문제 링크](https://www.acmicpc.net/problem/3052) 

### 성능 요약

메모리: 17692 KB, 시간: 208 ms

### 분류

사칙연산, 수학

### 문제 설명

<p>두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. </p>

<p>수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.</p>

### 출력 

 <p>첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.</p>

 ```c
import java.util.HashSet;
import java.util.Scanner;

public class Boj3052 {
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
```
### HashSet
HashSet 은 자바 COllection 중 Set의 파생 클래스이다 여기서 효과적인 점은
1. 중복되는 원소를 넣을 경우 false를 반환한다 중복허용 x
2. HashSet 은 순서 개념이 없다. 정렬을 하고 싶으면 List 로 변 후 정렬해야함

문제에서 서로 다른 나머지를 세야 하기 때문에 HashSet 에 숫자를 집어넣은 다음
size 를 반환하기만 하면 된


