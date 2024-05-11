import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı girin :");

        double ilkSayi = input.nextDouble();

        System.out.print("İkinci sayıyı girin :");
        double ikinciSayi = input.nextDouble();

        System.out.print("Üçüncü sayıyı girin :");
        double ucuncuSayi = input.nextDouble();

        double sonuc = ilkSayi + ikinciSayi * ucuncuSayi - ikinciSayi;
        System.out.println("İşlem sonucunuz" + sonuc);

    }
}