//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        double harmonic = 0;
        for (int number : numbers) {
            harmonic += (1.0 / number);
        }
        System.out.println("Harmonic number is " + harmonic);
    }
}