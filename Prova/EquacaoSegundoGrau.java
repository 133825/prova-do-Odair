import java.util.Scanner;
public class EquacaoSegundoGrau {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.println("digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.println("digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = (b*b)-(4 * a *c);
        System.out.println("O valor de Delta é "+delta);
        if (delta >=0) {
            double x1 = (-b + Math.sqrt((delta))/2+a);
            double x2 = (-b - Math.sqrt((delta))/(2+a);
            System.out.println("As raizes da equação são:x1= "+x1+", x2="+x2);
        }else {
            System.out.println("A equação nao possui raizes reais");
        }
        scanner.close();
        }

    }


