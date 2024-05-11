import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Değişkenler tanımlanır.
        int birinciSayi, ikinciSayi, ucuncuSayi;

        //Kullanıcı tarafından değişkenler atanır.
        System.out.println("Lütfen sırayla 3 tane sayı giriniz:");
        birinciSayi = sc.nextInt();
        ikinciSayi = sc.nextInt();
        ucuncuSayi = sc.nextInt();

        if(birinciSayi < ikinciSayi && birinciSayi < ucuncuSayi){
            if(ikinciSayi < ucuncuSayi){
                System.out.println("Sayılar sırasıyla " + birinciSayi+ ", " + ikinciSayi+ ", "+ ucuncuSayi);
            }else {
                System.out.println("Sayılar sırasıyla " + birinciSayi+ ", " + ucuncuSayi+ ", "+ ikinciSayi);
            }
        } else if (ikinciSayi < birinciSayi && ikinciSayi < ucuncuSayi) {
            if(birinciSayi < ucuncuSayi){
                System.out.println("Sayılar sırasıyla " + ikinciSayi+ ", " + birinciSayi+ ", "+ ucuncuSayi);
            }else {
                System.out.println("Sayılar sırasıyla " + ikinciSayi+ ", " + ucuncuSayi+ ", "+ birinciSayi);
            }
        } else {
            if(birinciSayi < ikinciSayi){
                System.out.println("Sayılar sırasıyla " + ucuncuSayi+ ", " + birinciSayi+ ", "+ ikinciSayi);
            }
            else {
                System.out.println("Sayılar sırasıyla " + ucuncuSayi+ ", " + ikinciSayi+ ", "+ birinciSayi);
            }
        }

    }
}