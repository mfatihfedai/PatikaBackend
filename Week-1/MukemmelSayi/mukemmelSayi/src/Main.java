import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Değişkenler tanımlanır.
        int number, division = 0;

        //Kullanıcıdan sayı istenir.
        System.out.print("Bir sayı giriniz : ");
        number = sc.nextInt();

        //Mükemmel sayı hesaplama işlemi yapılır.
        for (int i = 1; i < number ; i ++){
            if (number % i == 0){
                division += i;
            }
        }

        //Mükemmel sayı sorgulaması yapılır ve sonuç ekrana yazdırılır.
        if (division == number) {
            System.out.println(number + " mükemmel sayıdır.");
        }else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}