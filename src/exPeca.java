import java.util.Scanner;

public class exPeca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigoPeca1, numeroPecas1;
        double valorUnitario1;

        int codigoPeca2, numeroPecas2;
        double valorUnitario2;

        System.out.println("Digite o código da 1° peça: ");
        codigoPeca1 = scan.nextInt();
        System.out.println("Digite o número de peças da 1°: ");
        numeroPecas1 = scan.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        valorUnitario1 = scan.nextDouble();

        System.out.println("Digite o código da 2° peça: ");
        codigoPeca2 = scan.nextInt();
        System.out.println("Digite o número de peças da 2°: ");
        numeroPecas2 = scan.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        valorUnitario2 = scan.nextDouble();

        double valorAPagar = (numeroPecas1 * valorUnitario1) + (numeroPecas2 * valorUnitario2);
        System.out.printf("Valor a pagar: R$%.2f%n ", valorAPagar);

    }
}
