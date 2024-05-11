import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = input.nextInt();

        int[] list = {56, 34, 83, 2, -92, -800, 164};

        ArrayList<Integer> minList = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();

        for(int i : list){
            if(i < number){
                minList.add(i);
            }
            else if(i > number){
                maxList.add(i);
            }
        }
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i : minList){
            if (i > min){
                min = i;
            }
        }
        for (int i : maxList){
            if(i < max){
                max = i;
            }
        }
        System.out.println(number + " than small greatest number is " + min);
        System.out.println(number + " than big smaller number is " + max);

    }
}