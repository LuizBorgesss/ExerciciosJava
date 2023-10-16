import java.util.Scanner;

public class exWhile2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("1° Quadrante!");
            } else if (x < 0 && y > 0) {
                System.out.println("2° Quadrante!");
            } else if (x < 0 && y < 0) {
                System.out.println("3° Quadrante!");
            } else {
                System.out.println("4° Quadrante!");
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }
    }
}
