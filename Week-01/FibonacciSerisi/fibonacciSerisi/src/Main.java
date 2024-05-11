import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Değişkenler tanımlanır.
        int number, value1 = 0, value2 = 1, sum = 0;

        //Değişkenler kullanıcıdan istenir.
        System.out.print("Eleman sayısını giriniz : ");
        number = input.nextInt();

        //Girilen eleman sayısı kadar işlem döndürür
        for (int i = 0; i < number ; i++){
            sum = value1 + value2;

            System.out.println(value1 + " + " + value2 + " = " + sum); //İşlem çıktısı ekrana yazdırılır.
            value1 = value2;
            value2 = sum;
        }
    }
}