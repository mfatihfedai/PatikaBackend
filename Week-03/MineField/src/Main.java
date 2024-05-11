import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowNumber;
        int colNumber;

        //If user enter lower than 2x2, do-while run code again.
        do {
            System.out.print("Enter the number of rows (min 2): ");
            rowNumber = scanner.nextInt();                              //Değerlendirme 7.

            System.out.print("Enter the number of columns (min 2): ");
            colNumber = scanner.nextInt();

            if (rowNumber < 2 || colNumber < 2) {
                System.out.println("Row or col numbers must be minimum 2x2. Please try again.");
            }
        } while (rowNumber < 2 || colNumber < 2);

        //MineSweeper class is defined.
        MineSweeper game = new MineSweeper(rowNumber, colNumber);
        game.run();         //Game start!
    }
}