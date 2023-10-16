import java.util.Scanner;

public class exArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite  o valor do raio do circulo: ");
        double raioCirculo = scan.nextDouble();

        double pi = 3.14159;
        double area = pi * Math.pow(raioCirculo, 2.0);

        System.out.println("A área do circulo é igual a = " + area);
    }
}
