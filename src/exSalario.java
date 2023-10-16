import java.util.Scanner;

public class exSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número do funcionário: ");
        int numeroFuncionario = scan.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();
        System.out.println("Digite quanto você recebe por hora: ");
        double valorPorHora = scan.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.printf("Salário do funcionário = R$ %.2f%n ", salario);

        scan.close();
    }
}
