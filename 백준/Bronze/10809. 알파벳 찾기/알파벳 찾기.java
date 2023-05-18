import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int[] positions = findAlphabetPositions(word);
        
        for (int position : positions) {
            System.out.print(position + " ");
        }
    }
    
    public static int[] findAlphabetPositions(String word) {
        int[] positions = new int[26];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }
        
        return positions;
    }
}
