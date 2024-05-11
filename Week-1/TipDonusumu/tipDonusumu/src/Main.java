import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp =0;

        //Kullanıcıdan 1 tam sayı ve 1 ondalıklı sayı girmesi istenir.
        System.out.print("Lütfen bir tam sayı giriniz : ");
        int number1 = sc.nextInt();

        System.out.print("Lütfen bir ondalıklı sayı giriniz : ");
        double number2 = sc.nextDouble();

        //Tip dönüşümleri yapılır.
        temp = number1;
        number1 = (int) number2;
        number2 = temp;

        System.out.println("tam sayı : " + number2 + " ondalıklı sayı : " + number1);

    }
}