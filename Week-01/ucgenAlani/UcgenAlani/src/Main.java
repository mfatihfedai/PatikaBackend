import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("ilk kenarı giriniz :");
        double a = input.nextDouble();

        System.out.print("ikinci kenarı giriniz :");
        double b = input.nextDouble();

        double ucgenAlani = a * b / 2;

        System.out.println("Üçgenin alanı :" + ucgenAlani);

    }
}