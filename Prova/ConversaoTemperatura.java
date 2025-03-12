import java.util.Scanner;
public class ConversaoTemperatura {
    public static void main (String [] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) +32;

        System.out.println("A temperatura em Fahrenheit é: "+ String.format("%.2f", fahrenheit) +"ºF");

        scanner.close();
    }
}
