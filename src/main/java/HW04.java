package HomeWORK;
import java.util.Scanner;

public class HW04 {

    public static void main(String[] args) {
    /*Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
    1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
    - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
    - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
    - Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 100'den kucuk bir tamsayi giriniz");
        int sayi= input.nextInt();
        if (sayi<101&&sayi>0){
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0&&i%5==0){
                    System.out.print("Java Güzeldir ");
                } else if (i%3==0){
                    System.out.print("Java ");
                }else if (i%5==0){
                    System.out.print("Güzeldir ");
                }else {
                    System.out.print(i+" ");
                }

            }

        }else {
            System.out.println("Lütfen verilen aralıkta bir deger giriniz");
        }



    }
}

