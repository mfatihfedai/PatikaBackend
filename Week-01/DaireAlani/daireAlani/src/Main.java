import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        double yaricap = inp.nextDouble();

        System.out.print("Daire diliminin açısını giriniz :");
        double aci = inp.nextDouble();
        double pi = 3.14;
        double dilimAlani = (yaricap * yaricap * pi) * (aci /360);
        System.out.println("Daire diliminin alanı : " + dilimAlani);
    }
}