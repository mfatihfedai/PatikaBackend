import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11,
                muzFiyat=0.95, patlicanFiyat=5;
        Scanner deger = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armut = deger.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elma = deger.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domates = deger.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muz = deger.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = deger.nextDouble();

        toplam = (armutFiyat*armut) + (elmaFiyat*elma) + (domatesFiyat*domates)
                + (muzFiyat*muz) + (patlicanFiyat*patlican);
        System.out.println("Toplam tutar :" + toplam);

    }
}