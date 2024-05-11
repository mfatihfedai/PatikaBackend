import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Kullanıcıdan Artık yıl sorgulaması için yıl istenir.
        System.out.print("Lütfen yıl giriniz :");
        int yil = sc.nextInt();

        //Artık yıl hesabı yapılır.
        if(yil % 4 == 0) {
            if(yil % 400 != 0 && yil % 100 == 0){
                System.out.println(yil + " bir artık yıl değildir");
            }
            else {
                System.out.println(yil + " bir artık yıldır.");
            }
        }
        else {
            System.out.println(yil + " bir artık yıl değildir");
        }
    }
}