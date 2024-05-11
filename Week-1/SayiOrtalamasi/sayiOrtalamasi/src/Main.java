import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0, temp = 0;

        Scanner sc = new Scanner(System.in);

        //Kullanıcıdan bir  sayı istenir.
        System.out.print("Lütfen bir sayı giriniz : ");
        sayi = sc.nextInt();

        //Sayının 3 ve 4 ile tam bölünüp bölünmediği hesaplanır.
        for(int i = 1; i <= sayi; i++){
            if(i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                temp ++;
            }
        }
        //Çıktı ekrana yazdırılır.
        System.out.println("0'dan girilen sayıya kadar olan, 3'e ve 4'e tam bölünen sayıların ortalaması :" + (toplam/temp));
    }
}