import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select, balance = 1000, right = 3, price;
        String username, password;
        //Enter username and password

        while (right > 0) {
            System.out.print("Enter username :");
            username = input.nextLine();

            System.out.print("Enter password :");
            password = input.nextLine();

            if (username.equals("fatih") && password.equals("patikaplus")) {
                System.out.println("Bankamıza hoşgeldiniz ne işlem yapmak istersiniz ?");
                do {
                    System.out.println("1 - Para Yatırma \n2 - Para Çekme \n3 - Bakiye Sorgula \n4 - Çıkış Yap.");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarı :");
                            price = input.nextInt();
                            balance +=price;
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz para miktarı :");
                            price = input.nextInt();
                            if (price > balance){
                                System.out.println("Bakiyeniz yetersiz");
                            }
                            else {
                                balance -=price;
                                System.out.println("Kalan para miktarınız : " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;

                        case 4:
                            System.out.println("Başarı ile çıkış yaptınız!");
                            break;

                        default:
                            System.out.println("Hatalı bir tuşlama yaptınız!");
                    }
                }while (select !=4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            } else {
                right--;
                if(right == 0){
                    System.out.println("Bilgilerinizi 3 kere yanlış girdiniz hesabınzı bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                }
                else {
                    System.out.println("Lütfen yeniden deneyiniz. Kalan hakkınız : " + right);
                }
            }
        }
    }
}