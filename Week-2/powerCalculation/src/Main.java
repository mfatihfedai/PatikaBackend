import java.util.Scanner;

public class Main {
    //Define power calculation methods
    public static int powerCalculation(int power, int base) {

        int multiplication = 1;

        if (power > 0) { // If the power is greater than 0, the function is work

            return multiplication= base * powerCalculation(power-1, base);
        }else {
            return multiplication;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get the value from users
        System.out.print("Taban değerini giriniz : ");
        int base = scan.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int power = scan.nextInt();

        //Show the result
        int result = powerCalculation(power,base);
        System.out.println("Result = " + result);


    }
}