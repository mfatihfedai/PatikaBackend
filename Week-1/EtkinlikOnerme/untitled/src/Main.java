import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişken tanımlanır.
        int heat;

        Scanner sc = new Scanner(System.in);
        //Kullanıcıdan sıcaklık bilgisi girilir.
        System.out.print("Sıcaklık değerini giriniz:");
        heat = sc.nextInt();

        //Koşullara göre önermeler sıralanır.
        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz");
        } else {
            if (heat <= 15) {
                System.out.print("Sinemaya gidebilirsiniz");
            } else {
                if (heat <= 25) {
                    System.out.print("Pikniğe gidebilirsiniz.");
                } else {
                    System.out.print("Yüzmeye gidebilirsiniz");
                }
            }
        }


    }
}