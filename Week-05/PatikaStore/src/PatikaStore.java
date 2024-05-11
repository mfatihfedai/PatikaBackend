import java.util.Scanner;
public class PatikaStore {
    Scanner scanner = new Scanner(System.in);

    boolean isRunning = true;

    public void run(){
        while (isRunning){
            System.out.println("Patika Store Yönetim Paneli");
            System.out.println("1 - Notebook İşlemleri \n" +
                    "2 - Cep Telefonu İşlemleri \n" +
                    "3 - Markaları listeleme \n" +
                    "0 - Çıkış yap ");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.runMenu();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.printBrand();
                    break;
                default:
                    System.out.println("Çıkış yaptınız.");
                    isRunning = false;
                    break;
            }
        }
    }
}
