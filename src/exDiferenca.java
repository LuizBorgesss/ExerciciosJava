import java.util.Scanner;

public class exDiferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C, D;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        int diferenca = ((A*B)-(C*D));
        System.out.println("Diferença= " + diferenca);
    }
}
