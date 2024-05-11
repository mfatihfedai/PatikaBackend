import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Define the first list array.
        int[][] list = {
                        {2,3,4},
                        {5,6,4},
                        };

        //Define second array because assign the every element of list
        int[][] temp = new int[3][2];
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++){
                temp[j][i] = list[i][j];
            }
        }
        //Shown original matrix on the screen
        System.out.println("Matrix : ");
        for (int[] i : list){
            for( int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //Shown transpose matrix on the screen
        System.out.println("Transpose : ");
        for (int[] i : temp){
            for( int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}