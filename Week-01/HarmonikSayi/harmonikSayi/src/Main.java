import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number, harmonic = 0;

        //Enter a value from user
        System.out.println("Enter a value : ");
        number = scanner.nextDouble();

        //Function will be run
        for (int i = 1; i <= number; i++) {
            harmonic += (double) 1 /i;
        }
        System.out.println("Harmonic series of the number is " + harmonic);
    }
}