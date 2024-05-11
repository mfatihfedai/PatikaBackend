import java.util.Scanner;

public class Main {

    static int plus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1. number ");
        int number1 = input.nextInt();

        System.out.print("Enter 2. number ");
        int number2 = input.nextInt();

        System.out.println("Sum : " + (number1+number2));
        return 1;
    }
    static int minus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1. number ");
        int number1 = input.nextInt();

        System.out.print("Enter 2. number ");
        int number2 = input.nextInt();

        System.out.println("Minus : " + (number1-number2));
        return 1;
    }
    static int division(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1. number ");
        int number1 = input.nextInt();

        System.out.print("Enter 2. number ");
        int number2 = input.nextInt();

        System.out.println("Division : " + number1/number2);
        return 1;
    }
    static int multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1. number ");
        int number1 = input.nextInt();

        System.out.print("Enter 2. number ");
        int number2 = input.nextInt();

        System.out.println("Multiplication : " + number1*number2);
        return 1;
    }
    static int exponential(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number ");
        int number1 = input.nextInt();

        System.out.print("Enter power number ");
        int number2 = input.nextInt();

        int result = 1;
        for (int i = 0; i < number2 ; i++){
            result *= number1;
        }
        System.out.println("Exponential : " + result);
        return 1;
    }
    static int factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number1 = input.nextInt();

        int result = 1;
        for (int i = 1 ; i <=number1; i++){
            result *=i;
        }
        System.out.println("Factorial : " + result);
        return 1;
    }
    static int mod(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1. number ");
        int number1 = input.nextInt();

        System.out.print("Enter 2. number ");
        int number2 = input.nextInt();

        System.out.println("Mod : " + number1%number2);
        return 1;
    }
    static int rectangular(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1. number ");
        int number1 = input.nextInt();

        System.out.print("Enter 2. number ");
        int number2 = input.nextInt();

        System.out.println("Area : " + number1*number2);
        System.out.println("Circumference : " + 2*(number1+number2));
        return 1;
    }
    public static void main(String[] args) {
        int number1, number2, selection;



        do {
            System.out.println("Choose a selection");
            System.out.print("1 - Addition \n" +
                    "2 - Minus \n" +
                    "3 - Division \n" +
                    "4 - Multiplication \n" +
                    "5 - Exponential \n" +
                    "6 - Factorial \n" +
                    "7 - Mod \n" +
                    "8 - Rectangular Area and circumference \n" +
                    "9 - Exit \n");

            Scanner input = new Scanner(System.in);
            selection = input.nextInt();

            switch (selection) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    division();
                    break;
                case 4:
                    multiplication();
                    break;
                case 5:
                    exponential();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Unvalid value. Please try again.");
            }
        }while (selection != 0);
    }
}