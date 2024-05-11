import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String burc = "";

        //Kullanıcıdan doğum yılı bilgisi istenir.
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen doğum yılınızı giriniz:");
        int yil = sc.nextInt();

        //Çin zodyağı için doğum yılının 12 ile sonucunda kalan sayı bulunur.
        int kalanSayi = yil % 12;
        switch (kalanSayi) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
        }
        //Çıktı ekrana yazdırılır.
        System.out.println("Çin zodyağına göre burcunuz :" + burc);
    }
}