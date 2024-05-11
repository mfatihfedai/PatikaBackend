import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //If there is any text in the notes.txt, shown the screen.
            FileReader fileReaderOld = new FileReader("notes.txt");
            readText(fileReaderOld);

            //Enter a text from the user.
            System.out.print("Enter a text : ");
            String text = scanner.nextLine();

            //The program written the new text is written continue of the before text
            FileWriter fileWriter = new FileWriter("notes.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(text);
            printWriter.close();

            //The last text is shown on the screen.
            FileReader fileReader = new FileReader("notes.txt");
            readText(fileReader);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //For don't repeat myself, create a new method.
    public static void readText(FileReader fileReader){
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readText;
            while ((readText = bufferedReader.readLine()) != null) {
                System.out.println(readText);
            }
            bufferedReader.close();
        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}