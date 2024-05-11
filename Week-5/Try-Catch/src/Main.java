import java.util.Scanner;

public class Main {
    static int[] list = new int[10]; //Enter bound of list

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {//Input element of list
            list[i] = i*i;
        }

        System.out.print("Please select a element of the list : ");
        int element = input.nextInt(); //User enters the value
        try {
            int result = getElementsOfIndex(element);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static int getElementsOfIndex(int elements) throws Exception {
        if (elements < 0 || elements >= list.length){
            throw new ArrayIndexOutOfBoundsException("Index " + elements + " is out of bounds");
        }
        return list[elements];
    }

}