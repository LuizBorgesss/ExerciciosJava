import java.util.Scanner;

public class exTabela {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();

        double total = 0;

        if (codigo == 1){
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4){
            total = quantidade * 2.00;
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        } else {
            System.out.println("Este ítem não existe!");
        }
        System.out.printf("Total: R$ %.2f%n", total);

    }
}
