package HOMEWORK;
import java.util.Random;
public class HW07 {
    public static void main(String[] args) {
       /* Java'da rastgele ondalıklı ve negatif sayılar üretilir mi?
        Evet, üretilebilir. Bunun için Random sınıfının uygun metodlarını kullanarak sınırları belirleyebilirsiniz.
        Bunun için ;*/

        Random random = new Random();
        // 0.0 ile 10.0 arasında bir rastgele ondalıklı sayı
        double randomOndalikliSayi = random.nextDouble() * 10;
        System.out.println("Üretilen ondalıklı sayı: " + randomOndalikliSayi);


    }
}


