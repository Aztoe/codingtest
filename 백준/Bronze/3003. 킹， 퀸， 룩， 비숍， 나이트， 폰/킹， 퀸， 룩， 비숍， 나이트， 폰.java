
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int look = 2;
        int bishop = 2;
        int knight = 2;
        int porn = 8;

        king = king -sc.nextInt();
        queen = queen - sc.nextInt();
        look = look - sc.nextInt();
        bishop = bishop -sc.nextInt();
        knight = knight - sc.nextInt();
        porn = porn -sc.nextInt();

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(look + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(porn);
    }
}