
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler tanımlanır.
        int mat, fizik, kimya, turkce, muzik, toplam=0, dersSayisi=0;
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan bilgiler istenir.
        System.out.print("Matematik notunuzu giriniz :");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz :");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz :");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz :");
        turkce = inp.nextInt();;

        System.out.print("Müzik notunuzu giriniz :");
        muzik = inp.nextInt();

        //Derslerin 0 ile 100 arasında olup olmadığı sorgulanır.
        if(mat > 0 && mat<100){
            toplam += mat;
            dersSayisi++;
        }
        if(fizik > 0 && fizik<100){
            toplam += fizik;
            dersSayisi++;
        }
        if(kimya > 0 && kimya<100){
            toplam += kimya;
            dersSayisi++;
        }
        if(turkce > 0 && turkce<100){
            toplam += turkce;
            dersSayisi++;
        }
        if(muzik > 0 && muzik<100){
            toplam += muzik;
            dersSayisi++;
        }

        //toplanan derslerin ortalaması alınır.
        double ortalama = toplam / dersSayisi;
        System.out.println("Ortalamanız : " + ortalama);

        boolean kosul = ortalama >= 55;

        //Sonuç ekrana yazdırılır.
        String str = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);
    }
}
