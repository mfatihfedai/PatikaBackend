import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler tanımlanır.
        double mesafe, mesafeUcreti = 0.1, toplamTutar;
        int yolculukTipi, yas;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan istenilen bilgiler alınır.
        System.out.print("Lütfen gideceğiniz mesafe bilgisini giriniz :");
        mesafe = input.nextDouble();

        System.out.print("Lütfen yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.print("Lütfen yolculuk tipini giriniz \n 1-Tek Yön \n 2-Gidiş-Dönüş :");
        yolculukTipi = input.nextInt();

        //Değerlerin doğruluğu kontrol edilir.
        if(mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)){
            System.out.println("Hatalı bir veri girdiniz.");
            System.exit(0);
        }

        //Normal tutar hesaplanır.
        toplamTutar = mesafe * mesafeUcreti;

        //İndirim tutarı hesaplanır.
        if(yas < 12) {
            toplamTutar -= toplamTutar/2;
        } else if (yas < 24) {
            toplamTutar -= toplamTutar/10;
        } else if (yas >= 65) {
            toplamTutar -= toplamTutar*((double) 3 /10);
        }
        if (yolculukTipi == 2){
                toplamTutar -=toplamTutar/5;
                toplamTutar *=2;
        }

        //Toplam tutar ekrana yazdırılır.
        System.out.println("Toplam tutar : " + toplamTutar);
    }
}