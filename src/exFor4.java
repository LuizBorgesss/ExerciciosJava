import java.util.Scanner;

public class exFor4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {

            int x = scan.nextInt();
            int y = scan.nextInt();

            if (y == 0) {
                System.out.println("Divisão impossível!");
            } else {
                int divisao = x / y;
                System.out.println(divisao);
            }
        }
    }
}
