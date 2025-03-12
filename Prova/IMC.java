import java.util.Scanner;
public class IMC {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso (kg): " );
        double peso  = scanner.nextDouble();
        System.out.println("Digite sua altura (m):");
        double altura = scanner.nextDouble();
        double imc = peso/(altura * altura);
        System.out.println("Seu IMC é "+imc);

        scanner.close();
    }
}
