import java.util.Scanner;

public class exFor5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int fat = 1;

        for (int i = 1; i <= N ; i++) {
            fat = fat * i ;
        }
        System.out.println(fat);
    }
}
