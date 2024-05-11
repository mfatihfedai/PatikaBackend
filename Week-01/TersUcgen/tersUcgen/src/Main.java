import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan basamak sayısı istenir.
        System.out.print("Basamak sayısı : ");
        int bas = input.nextInt();

        //Döngü ile ters üçgen yazdırılır.
        for (int i = 0 ; i <= bas ; i++){
            for (int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 2 * bas - 1 ; k > 2*i; k-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}