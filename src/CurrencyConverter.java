import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("Exchange rate VND to USD now is : ");
        a = scanner.nextDouble();

        double USD;
        System.out.println("Input USD: ");
        USD = scanner.nextDouble();


        double VND= USD * a;
        System.out.println("Total money is: " + VND);


    }
}
