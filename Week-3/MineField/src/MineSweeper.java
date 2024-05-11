import java.util.Random;
import java.util.Scanner;

public class MineSweeper {      //Değerlendirme 5.

    int rowNumber;              //Defined the variables.
    int colNumber;
    String[][] minesField;
    String[][] playerField;


    MineSweeper(int rowNumber, int colNumber) {     //Constructor method is defined.
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.minesField = new String[rowNumber][colNumber];
        this.playerField = new String[rowNumber][colNumber];
        initializeMines();
        initialPlayerArea();
    }

    public void initializeMines() {         //Create random mines in a different array method. //Değerlendirme 6.
        Random random = new Random();                   //Değerlendirme 8.
        int numMines = (rowNumber * colNumber) / 4;     //Mines number is calculated.

        for (int i = 0; i < rowNumber; i++) {           //To all array elements are written "-".
            for (int j = 0; j < colNumber; j++) {
                minesField[i][j] = "-";
            }
        }

        for (int i = 0; i < numMines; i++) {                //Mines are overwritten to array.
            int randRow = random.nextInt(rowNumber);
            int randCol = random.nextInt(colNumber);
            if (minesField[randRow][randCol].equals("*")) {
                i--;
            }
            minesField[randRow][randCol] = "*";
        }

        System.out.println("Mines locations : ");               //Show the mines location.
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(minesField[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void initialPlayerArea() {                       //A new array is created for player try  //Değerlendirme 6
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                playerField[i][j] = "-";
            }
        }
    }

    public void printBoard(String[][] board) {                  //Every try print the screen.  //Değerlendirme 6
        System.out.println("======================");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void nearMines(int row, int col) {               //Is there any mines around the chosen coordinate
        int quantityMines = 0;                              //If there is mines, how many mines around
        for (int i = -1; i <= 1; i++) {                     //Değerlendirme 6.
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                if (newRow >= 0 && newRow < rowNumber && newCol >= 0 && newCol < colNumber) {
                    if (minesField[newRow][newCol].equals("*")) {
                        quantityMines++;
                    }
                }
            }
        }
        playerField[row][col] = String.valueOf(quantityMines);
    }

    public void run() {                                 //Run the project
        Scanner scan = new Scanner(System.in);          //Değerlendirme 6.
        int estimateRow;
        int estimateCol;
        int right = 3;
        System.out.println("Welcome to Mein Sweeper Game ! ");
        printBoard(playerField);
        int remain = 0;

        while (true) {
            System.out.print("Enter row ( 0 - " + (rowNumber - 1) + ") : ");
            estimateRow = scan.nextInt();                               //Değerlendirme 9.

            System.out.print("Enter col ( 0 - " + (colNumber - 1) + ") : ");
            estimateCol = scan.nextInt();

            if ((estimateRow < 0 || estimateRow >= rowNumber) || (estimateCol < 0 || estimateCol >= colNumber)) {       //If user select out of the array elements, the system gives warning.
                right--;                                                                                                //Değerlendirme 10.
                if (right == 0) {
                    System.out.println("Game over!");
                    break;
                }
                System.out.println("Please enter new coordinate. You remaining right " + right);
                continue;
            }
            if (minesField[estimateRow][estimateCol].equals("*")) {                 //If the user choose mine, game over condition.
                System.out.println("Game over!");                                   //Değerlendirme 13.
                playerField[estimateRow][estimateCol] = "*";                        //Değerlendirme 15.
                printBoard(playerField);
                break;
            } else if (!playerField[estimateRow][estimateCol].equals("-")) {        //If the user choose element that choose before, the system gives warning and try again.
                System.out.println("This coordinate is selected before. Please select again.");
                remain--;

            } else if (remain == (3 * rowNumber * colNumber) / 4) {         //If the user don't choose mines, user will win.
                System.out.println("Congratulations! You are win!");        //Değerlendirme 14.
                nearMines(estimateRow, estimateCol);                        //Değerlendirme 15.
                printBoard(playerField);
                break;
            } else {                                        //Değerlendirme 12.
                nearMines(estimateRow, estimateCol);        //The screen board and be number of around mines showed.
                printBoard(playerField);                    //Değerlendirme 11.
            }
            remain++;
        }

    }
}
