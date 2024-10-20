import java.util.Random;
import java.util.Scanner;

public class HW12_Random {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int rastgeleSayi = random.nextInt(101); //0-100 arasi sayi urettik
        System.out.println(rastgeleSayi);
        int tahmin;
        int tahminSayisi = 0;
        int tahminHakki=5;
        System.out.println("Lutfen bir sayi giriniz");
        do {

            tahmin = scan.nextInt();
            tahminSayisi++;
            if (tahmin > rastgeleSayi) {
                System.out.println("lutfen tahmıninizi azaltınız");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Lutfen tahmınınızı arrtırınız");
            }else {
                System.out.println("Tebrik ederiz buldunuz");
                System.out.println(tahminSayisi +".kere de buldunuz");
            }

            if (rastgeleSayi!=tahmin && tahminSayisi!=5){
                System.out.println(tahminHakki-tahminSayisi+" kadar hakkınız kaldı");
            }
        } while (tahminSayisi != 5);
        System.out.println("Exıt tekrar deneyiniz");



    }
    }

