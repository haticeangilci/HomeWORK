package HOMEWORK;
import java.util.Scanner;
public class HW06 {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz:Ahmet Ali
        //Soyisminiz: Can
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.
        //String manipulation ile isimlerin baş harfleri buyuk kalanları kucuk olucak şekilde yazdırın

        String str="Ali";
        //Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz:Ahmet Ali
        //Soyisminiz: Can
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.
        //String manipulation ile isimlerin baş harfleri buyuk kalanları kucuk olucak şekilde yazdırın
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= input.nextLine();
        System.out.println("Lütfen soyismini giriniz");
        String soyIsim= input.next();
        String ilkIsim=isim.trim().split(" ")[0];
        String sonIsim=isim.trim().split(" ")[1];
        ilkIsim=ilkIsim.toUpperCase().charAt(0)+ilkIsim.toLowerCase().substring(1);
        sonIsim=sonIsim.toUpperCase().charAt(0)+sonIsim.toLowerCase().substring(1);

        soyIsim= soyIsim.toUpperCase().charAt(0)+soyIsim.toLowerCase().substring(1);
        System.out.println("İsminiz : "+ilkIsim+" "+sonIsim);
        System.out.println("Soyisminiz : "+soyIsim);
    }
}

