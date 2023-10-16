import java.util.Scanner;

public class exFor7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N ; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;

            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

        }
        scan.close();
    }
}
