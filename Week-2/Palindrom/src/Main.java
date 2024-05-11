import java.util.Scanner;

public class Main {
    static boolean isPalindrom (int number){
        int temp = number, reverseNumber = 0, lastNumber, digit = 0;
        double palindrom = 0;

        while (temp % 10 != 0){
            temp = temp / 10;
            digit++;
        }
        temp=number;
        for(int i = digit-1; i >= 0 ; i--){

            palindrom += Math.pow(10,i) *(temp % 10);
            temp/=10;
            System.out.println(palindrom); //Get the result for code control
        }
        if(palindrom == number){
             return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(454));
    }
}