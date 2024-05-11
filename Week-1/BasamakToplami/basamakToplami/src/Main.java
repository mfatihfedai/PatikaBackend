import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi, tempSayi, basValue = 0;

        //Enter the value from user
        System.out.print("Please enter a number :");
        sayi = scanner.nextInt();
        tempSayi = sayi;
        while (tempSayi != 0){
            basValue += tempSayi % 10;
            tempSayi /= 10;
        }

        System.out.println("Bas value of number is " + basValue);
    }
}