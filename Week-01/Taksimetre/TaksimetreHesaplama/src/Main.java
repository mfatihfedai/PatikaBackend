import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç km gideceksiniz ?");
        double mesafe = girdi.nextDouble();

        double ucret = 10 + (mesafe * 2.20);
        boolean kosul = ucret >=20;
        ucret = kosul ? ucret : 20;

        System.out.println("Taksi ücretiniz =" + ucret);


    }
}