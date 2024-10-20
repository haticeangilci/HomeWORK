
import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;
public class HW16_leapyear {
    public static void main(String[] args) {
        //ODEV leap year sorusnu isLeapYear metotuyla çözmeye çalış
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı giriniz");
        int userMonth = input.nextInt();

        Year year2 = Year.of(userMonth);


        String isLeapYear = (year2.isLeap()) ? ("Leap year") : ("Leap year değil");
        System.out.println(isLeapYear);


        //-----------------------------------------------------------------------
        //2.yol
        input.useDelimiter("[.,\\s]+");

        System.out.println("Lütfen bir yil, ay ve günü sirasiyla giriniz");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate date1 = LocalDate.of(year,month,day);

        boolean leapYearControl = date1.isLeapYear();
        if (leapYearControl){
            System.out.println("Girilen tarihin yili bir Leap Year'dir. ");
        }else {
            System.out.println("Girilen tarihin yili bir Leap Year degildir");
        }
    }
}
