import java.util.Stack;
 
class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for(int move : moves) {
                move--;
                for (int i = 0; i < board.length; i++) {
                    if(board[i][move] !=0) {
                        int doll = board[i][move];
                        board[i][move] =0;
                        if(!stack.isEmpty() && stack.peek() == doll) {
                            stack.pop();
                            answer += 2;
                        } else{
                            stack.push(doll);
                        }
                        break;
                    }
                    
                }
            }
            return answer;
        }
    }