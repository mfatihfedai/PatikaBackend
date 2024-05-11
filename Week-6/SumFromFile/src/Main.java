import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaYolu = "sayilar.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dosyaYolu))){
            int sum = 0;

            String satir;
            while((satir = bufferedReader.readLine()) != null){
                int sayi = Integer.parseInt(satir);
                sum += sayi;
            }
            System.out.println("Dosyadaki sayıların toplamı : " + sum);

        } catch (FileNotFoundException e) {
            System.err.println("Dosya bulunamadı: " + dosyaYolu);
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Sayıya dönüştürme hatası: " + e.getMessage());
        }
    }
}