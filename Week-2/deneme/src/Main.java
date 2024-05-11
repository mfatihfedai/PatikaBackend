import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int row;
        int column;

        System.out.print("Satır sayısı giriniz: ");
        row = input.nextInt();

        System.out.print("Sütun sayısı giriniz: ");
        column = input.nextInt();

        int[][] matris = new int[row][column];
        System.out.println("\nMatris ");      // Matris Oluşturma

        int value = 1;
        for (int r = 0; r < row; r++) {      // Matris Değer Atama
            for (int c = 0; c < column; c++) {
                matris[r][c] = value;
                value++;
                System.out.print(matris[r][c] + "  ");
            }
            System.out.println();
        }
        int[][] transpozMatris = new int[column][row];
        System.out.println("\nTranspoze ");  // Transpoze Oluşturma

        for (int r = 0; r < transpozMatris.length; r++) {
            for (int c = 0; c < transpozMatris[r].length; c++) {

                transpozMatris[r][c] = matris[c][r]; // Matrisin değerlerini çevirme
                System.out.print(transpozMatris[r][c] + "  ");
            }
            System.out.println();
        }
    }
}