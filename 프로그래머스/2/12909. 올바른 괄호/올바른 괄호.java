import java.util.Stack;
 
class Solution {
        boolean solution(String s) {
            Stack<Character> stack = new Stack<>();

            for (char k : s.toCharArray()) {
                if ( k  == '(') {
                    stack.push(k);
                } else if (!stack.isEmpty() && k==')') {
                    stack.pop();
                }else {
                    return false;
                }
            }

            while (!stack.isEmpty()) {
                return false;
            }

            return true;
        }
    }