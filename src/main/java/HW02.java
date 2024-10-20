package HomeWORK;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        //Ödev: En az 1 tane sembol içermeli.
        Scanner input = new Scanner(System.in);
        System.out.println("Sayısal bir deger giriniz.");

        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}