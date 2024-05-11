import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Değişkenler tanımlanır.
        int value, max = 0, min = 0, number;

        //Kullanıcıdan kaç sayı girileceği bilgisi alınır.
        System.out.print("Kaç tane sayı gireceksiniz : ");
        value = sc.nextInt();

        //Döngü ile gireceği sayılar sırasıyla istenir.
        for (int i = 1 ; i <= value; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            number = sc.nextInt();

            //Sayının en büyük olup olmadığı sorgulanır.
            if (number > max){
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        //Sonuç ekrana yazdırılır.
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}