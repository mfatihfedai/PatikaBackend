import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;

        //Enter the bas value from users
        System.out.println("Baklava diliminin uzunluğunu giriniz : ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <  (2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m = 0; m <= n; m++){
            for (int g = 0; g <= m; g++){
                System.out.print(" ");
            }
            for (int p = 2*n-4; p > 2*m -1; p-- ){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}