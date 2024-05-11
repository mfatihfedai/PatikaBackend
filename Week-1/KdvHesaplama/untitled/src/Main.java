import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir fiyat giriniz : ");
        double ucret = input.nextInt();
        boolean kosul = ucret >= 1000;
        double kdvOrani = kosul ? 0.08 : 0.18;
        double kdvUcreti = ucret * kdvOrani;

        System.out.println("KDV'siz fiyat : " + ucret);
        System.out.println("KDV'li fiyat : " + (kdvUcreti + ucret));
        System.out.println("KDV tutarı : " + kdvUcreti);
    }
}