
public class Main {
    public static void main(String[] args) {

        int asal = 0;
        boolean temp = true;

        //1'den 100'e kadar olan sayılar döndürülür.
        for (int i = 2; i <= 100 ; i++){
            //2'den 100'e kadar olan her bir sayı için asal sayı kontrolü yapılır.
            for (int j = 2 ; j < i ; j++){
                if (i % j == 0){
                    temp=false; //Asal olan sayıyı bulunca sayı döngüden çıkar.
                    break;
                }
            }
            if(temp){
                System.out.print(i + " "); //Asal olan sayı ekrana yazdırılır.
            }
            temp = true;
        }
    }
}