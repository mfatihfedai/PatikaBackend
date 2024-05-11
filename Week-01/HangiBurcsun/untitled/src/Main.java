import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan bilgiler istenir.
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı giriniz:");
        int ay = sc.nextInt();
        System.out.println("Lütfen doğduğunuz günü giriniz:");
        int gun = sc.nextInt();

        //Girilen bilgilerin doğruluğu teyit edilir.
        if (ay>12 || ay <1) {
            System.out.println("Hatalı bir ay değeri girdiniz.");
        System.exit(0);
        }
        if (gun>31 || gun <1) {
            System.out.println("Hatalı bir gün değeri girdiniz.");
            System.exit(0);
        }

        //Burç işlemi yapılır.
        if (ay ==1 && gun <22){
            System.out.println("Oğlak burcusunuz");
        }
        else if(ay ==1 && gun >22){
            System.out.println("Kova burcusunuz");
        }
        else if(ay ==2 && gun <20){
            System.out.println("Kova burcusunuz");
        }
        else if(ay ==2 && gun > 20){
            System.out.println("Balık burcusunuz");
        }
        else if(ay ==3 && gun <21){
            System.out.println("Balık burcusunuz");
        }
        else if(ay ==3 && gun > 21){
            System.out.println("Koç burcusunuz");
        }
        if (ay ==4 && gun <21){
            System.out.println("Koç burcusunuz");
        }
        else if(ay ==4 && gun > 21){
            System.out.println("Boğa burcusunuz");
        }
        if (ay ==5 && gun <22){
            System.out.println("Boğa burcusunuz");
        }
        else if(ay ==5 && gun > 22){
            System.out.println("İkizler burcusunuz");
        }
        if (ay ==6 && gun <23){
            System.out.println("İkizler burcusunuz");
        }
        else if(ay ==6 && gun > 23){
            System.out.println("Yengeç burcusunuz");
        }
        if (ay ==7 && gun <23){
            System.out.println("Yengeç burcusunuz");
        }
        else if(ay ==7 && gun > 23){
            System.out.println("Aslan burcusunuz");
        }
        if (ay ==8 && gun <23){
            System.out.println("Aslan burcusunuz");
        }
        else if(ay ==8 && gun > 23){
            System.out.println("Başak burcusunuz");
        }
        if (ay ==9 && gun <23){
            System.out.println("Başak burcusunuz");
        }
        else if(ay ==9 && gun > 23){
            System.out.println("Terazi burcusunuz");
        }
        if (ay ==10 && gun <23){
            System.out.println("Terazi burcusunuz");
        }
        else if(ay ==10 && gun > 23){
            System.out.println("Akrep burcusunuz");
        }
        if (ay ==11 && gun <22){
            System.out.println("Akrep burcusunuz");
        }
        else if(ay ==11 && gun > 22){
            System.out.println("Yay burcusunuz");
        }
        if (ay ==12 && gun <22){
            System.out.println("Yay burcusunuz");
        }
        else if(ay ==12 && gun > 22){
            System.out.println("Oğlak burcusunuz");
        }
    }
}