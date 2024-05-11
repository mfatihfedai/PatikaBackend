import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenler tanımlanır.
        String username, password, passOld ="patika123";
        int sorgu = 0;
        Scanner sc = new Scanner(System.in);

        //Kullanıcıdan bilgiler istenir.
        System.out.print("Lütfen kullanıcı adınızı giriniz :");
        username = sc.nextLine();

        System.out.print("Lütfen şifrenizi giriniz :");
        password = sc.nextLine();

        //Bilgilerin doğruluğu sorgulanır.
        if(password.equals(passOld)){
            System.out.println("Başarılı bir şekilde giriş yaptınız!");
        }
        else{
            System.out.println("Şifrenizi yanlış girdiniz! Şifrenizi değiştirmek ister misiniz ? \n1-evet \n2-Hayır ");
        }
        sorgu = sc.nextInt();
        switch (sorgu){
            case 1:
                System.out.print("Eski şifreniz yenisi ile aynı olmamalıdır! Lütfen yeni şifrenizi giriniz:");
                Scanner sr = new Scanner(System.in);
                password = sr.nextLine();
                if (password.equals(passOld)) {
                    System.out.println("Şifreniz oluşturulamadı lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifreniz başarı ile oluşturuldu.");
                }
                break;
            case 2:
                System.out.println("Görüşmek üzere!");
                break;
        }

    }
}