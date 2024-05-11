import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Değişkenler tanımlanır.
        int taban, us, sonuc = 1 ;

        //Entered the value from the user
        System.out.print("Üssü alınacak sayıyı giriniz :");
        taban = sc.nextInt();

        System.out.print("Üs olacak sayıyı giriniz :");
        us = sc.nextInt();

        for (int i = 1; i <= us ; i++){
            sonuc *= taban;
        }
        System.out.println("Üslü ifadenin sonucu " + sonuc);
    }
}