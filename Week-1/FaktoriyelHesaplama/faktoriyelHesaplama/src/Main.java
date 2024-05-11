import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nfactorial = 1, rfactorial = 1,factorial = 1, n, r, combination;

        //Kullanıcıdan sayı istenir.
        System.out.print("Enter a number for factorial :");
        n = input.nextInt();

        System.out.print("Enter a number for combination :");
        r = input.nextInt();

        //for döngüsü ile faktöriyel hesabı yapılır.
        for(int i = 1; i <= n; i++){
            nfactorial *= i;
        }
        for(int j = 1; j <= r; j++){
            rfactorial *= j;
        }
        for(int k = 1; k <= (n-r); k++){
            factorial *= k;
        }

        //Calculating with the formula
        combination = nfactorial /(rfactorial * factorial);

        //Show the result
        System.out.println("Your combination result is " + combination);

    }
}