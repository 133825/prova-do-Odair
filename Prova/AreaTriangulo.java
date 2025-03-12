import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triangulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura)/2;
        System.out.println("a area do triangulo é "+area);
        scanner.close();
    }
}
