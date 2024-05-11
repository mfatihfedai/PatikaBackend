import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {


        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 3, 2, 9};
        int[] against = new int[list.length];
        int startIndex = 0;

        for (int i =0; i < list.length; i++){
            for (int j = 0 ; j < list.length; j++){
                if((i != j) && (list [j] == list[i]) && (list[i] % 2 ==0)){
                    if(!(isFind(against, list[i]))){
                        against[startIndex++] = list[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(against));

    }
}