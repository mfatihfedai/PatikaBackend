import java.util.Scanner;

public class Main {
        //Recursive methods
    public static String prime(int number, int primeNumb){
        //Show the result sentences
        String primeStr ="The number is prime.", NotPrimeStr = "The number is not prime";

        if (primeNumb > 1 && number % primeNumb == 0){
            return NotPrimeStr;
        }
        else if (primeNumb == 1){
            return primeStr;
        }
        return prime(number, primeNumb-1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Enter the value from users
        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        int primeNumb = number-1; //primeNumber is control the number with division
        System.out.println(prime(number, primeNumb));

    }
}