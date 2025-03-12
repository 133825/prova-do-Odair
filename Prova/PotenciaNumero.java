import java.util.Scanner;
public class PotenciaNumero {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);

        System.out.println("O quadrado de " + numero + " é: " + String.format("%.2f", quadrado));
        System.out.println("O cubo de " + numero + " é: " + String.format("%.2f", cubo));

        scanner.close();

    }
}

