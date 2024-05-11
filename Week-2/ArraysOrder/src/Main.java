import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Input a number length of array from users
        System.out.print("Enter length of array n : ");
        int arrayLength = scan.nextInt();

        //Define the list.
        int[] list = new int[arrayLength];

        //Enter array elements from users
        for (int i = 0; i < list.length; i++){
            System.out.print("Enter a " + (i+1) + ". elements : ");
            list[i] = scan.nextInt();
        }
        //Arrays elements are sorted.
        Arrays.sort(list);

        //Arrays elements are showed.
        System.out.print("Arrays order : ");
        for (int i : list){
            System.out.print(i + " ");
        }

    }
}