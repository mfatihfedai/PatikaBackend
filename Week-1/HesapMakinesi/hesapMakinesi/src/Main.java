import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Sayilar tanımlanır.
        double ilkSayi, ikinciSayi, sonuc = 0;
        int islem;

        Scanner sc = new Scanner(System.in);

        //Değişkenler kullanıcıdan istenir.
        System.out.print("İlk sayıyı giriniz :");
        ilkSayi = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz :");
        ikinciSayi = sc.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi giriniz:");
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");

        islem = sc.nextInt();
        //Sayılar işleme girer.
        switch (islem) {
            case 1:
                sonuc = ilkSayi + ikinciSayi;
                break;
            case 2:
                sonuc = ilkSayi - ikinciSayi;
                break;
            case 3:
                sonuc = ilkSayi * ikinciSayi;
                break;
            case 4:
                sonuc = ilkSayi / ikinciSayi;
                break;
        }
        //Sonuç ekrana yazdırılır
        if(islem ==4 && ikinciSayi == 0){
            System.out.println("Bölen 0 olamaz!");
        }
        else {
            System.out.println("İşlem Sonucunuz: " + sonuc);
        }

    }
}