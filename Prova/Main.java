import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em fahrenheit: ");
        double fahrenheit= scanner.nextDouble();
        double celcius = (fahrenheit - 32)*5/9;
        System.out.println("temperatura em celcius "+celcius);

        scanner.close();
    }
}


