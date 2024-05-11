import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //int rand = (int) (Math.random() * 100);

        Random rand = new Random();
        int random = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int right = 5;

        while (right > 0) {
            right--;
            System.out.println(random);
            System.out.print("Estimate a number : ");
            int est = scan.nextInt();

            if (est == random) {
                System.out.println("Congratulations! Estimate number is correct ");
            } else {
                System.out.println("Estimate number is wrong. Try again. Remaining right : " + right);
                if (est > random) {
                    System.out.println("Your estimate number is bigger than hidden number.");
                } else {
                    System.out.println("Your estimate number is smaller than hidden number. ");
                }
            }
        }
    }
}