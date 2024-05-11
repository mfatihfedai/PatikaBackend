import java.util.Scanner;

public class Main {
    public static int program(int temp, int number, boolean isPositive){

        if (temp >= 0 && isPositive){
            System.out.print(temp + " ");
            return program(temp-5, number, true);
        }
        else {
            if(temp == number){
                System.out.print(temp + " ");
                return 0;
            }

            System.out.print(temp + " ");
            return program(temp+5,number,false);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Enter value from users
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        int temp = number;
        program(temp, number, true);




    }
}