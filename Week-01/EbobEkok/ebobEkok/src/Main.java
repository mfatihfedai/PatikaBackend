import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Değişkenler tanımlanır.
        int sayi1, sayi2, temp1 = 1, temp2 = 1, ebob = 0, ekok = 0;

        //Kullanıcıdan değişken değerleri istenir.
        System.out.print("Lütfen 1. sayıyı giriniz.");
        sayi1 = input.nextInt();

        System.out.print("Lütfen 2. sayıyı giriniz.");
        sayi2 = input.nextInt();


        while(temp1 < sayi1){
            if (sayi1 % temp1 == 0 && sayi2 % temp1 == 0){
                ebob = temp1;
            }
            temp1++;
        }

        while(temp2 <= (sayi1*sayi2)){
            if (temp2 % sayi1 == 0 && temp2 % sayi2 == 0){
                ekok = temp2;
                break;
            }
            temp2++;
        }
        System.out.println("Girilen sayıların ebobu : " + ebob + " ekoku : " + ekok);
    }
}