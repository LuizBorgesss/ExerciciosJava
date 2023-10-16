import java.util.Scanner;

public class exWhile1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha = scan.nextInt();

        while (senha != 2002){
            System.out.println("Senha inválida!");
            senha = scan.nextInt();
        }
        System.out.println("Acesso permitido!");

        scan.close();
    }
}
