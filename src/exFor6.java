import java.util.Scanner;

public class exFor6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N ; i++) {

            if (N % i == 0){
                System.out.println(i);
            }
        }
    }
}
