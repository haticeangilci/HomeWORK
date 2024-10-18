package HOMEWORK;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz:Ahmet Ali
        //Soyisminiz: Can
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.
        //String manipulation ile isimlerin baş harfleri buyuk kalanları kucuk olucak şekilde yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=input.nextLine();//ahmet ali

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=input.nextLine();//can

        String isim1=isim.toLowerCase().split("\\s+")[0].substring(0);
        String isim11=isim1.substring(0,1).toUpperCase()  + isim1.substring(1);

        String isim2=isim.toLowerCase().split("\\s+")[1].substring(0);
        String isim22=isim2.substring(0,1).toUpperCase()  + isim2.substring(1);

        System.out.println("isim: " + isim11 + " " +isim22);


        String soyisim2=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
        System.out.println("soyisim = " + soyisim2);//Can

        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");


    }
}

