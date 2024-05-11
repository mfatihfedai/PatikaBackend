import java.util.Arrays;

public class Main {
    public static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] list = {10 , 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int start = 0;

        //First controlled element.
        for(int i = 0; i < list.length; i++){
            int quantity = 0; //Duplicate quantity number.
            if (isFind(duplicate, list[i])) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        quantity++; //Quantity number increase by 1.
                        duplicate[start++] = list[i];
                    }
                }
                System.out.println(list[i] + " number is duplicate " + quantity + " times.");
            }
        }
    }
}