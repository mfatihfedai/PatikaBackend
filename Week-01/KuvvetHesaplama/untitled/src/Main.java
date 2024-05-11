import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayı istenir.
        System.out.print("Lütfen bir sayı giriniz :");
        int sayi = input.nextInt();

        //döngü ile işlemlere başlanır.
        System.out.println("4'ün katları olan sayılar :");
        for(int i = 1; i < sayi; i *=4){
            System.out.print(i + ", ");
        }
        System.out.println("\n5'in katları olan sayılar :");
        for(int j = 1; j < sayi; j *=5){
            System.out.print(j + ", ");
        }
    }
}