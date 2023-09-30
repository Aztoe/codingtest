import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int M = sc.nextInt();

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack1.add(str.charAt(i));
        }

        for (int i = 0; i < M; i++) {
            String alpha = sc.next();
            char c = alpha.charAt(0);
            if( c=='L' && !stack1.isEmpty()){
                    stack2.add(stack1.pop());
            } else if (c =='D'&& !stack2.isEmpty()) {
                        stack1.add(stack2.pop());
            }else if ( c=='B' &&!stack1.isEmpty() ) {
                    stack1.pop();
            }else if(c =='P'){
                String al  =   sc.next();
                char p = al.charAt(0);
                stack1.add(p);
            }


        }
        StringBuilder sb = new StringBuilder();
        for( char alpha : stack1){
            sb.append(alpha);
        }
        for (int i = stack2.size()-1; i >=0 ; i--) {
            sb.append(stack2.get(i));
        }
        System.out.println(sb);
    }
}