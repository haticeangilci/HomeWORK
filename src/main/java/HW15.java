import java.util.ArrayList;

public class HW15 {
    public static void main(String[] args) {
        //Ornek 1:  Bir String ArrayList oluşturun ve “a” içeren elemanlari silin.
        //Example 1: Create a String ArrayList and delete the elements containing “a”.
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r); //[Manisa, Nigde, Tokat, Van]

        //ODEV: Bu soruyu i'yi son index'ten baslatarak ta cozebilirdik.i-- yazmaya gerek kalmazdi. Nasil?
        for (int j = r.size()-1; j >= 0; j--)
        {
            if (r.get(j).contains("a"))
            {
                r.remove(j);
            }
        }
        System.out.println(r);
        //------------------------------------------------------------------------------
            //Ornek 1: Bir tane Integer List olusturunuz.Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
            // Example 1: Create an Integer List.Write the two closest integers in this List.
            //      [12, 23, 10, 19] ==> 12 ve 10
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(12);
            nums.add(23);
            nums.add(10);
            nums.add(19);
            System.out.println(nums);
            nums.sort(null);
            System.out.println(nums);


            //------------ODEV: Bu soru tek for'la veya for each'le cozulebilir miydi?
            //------------for


            ArrayList<Integer> diff = new ArrayList<>();

            for (int i = 1; i < nums.size(); i++)
            {
                diff.add(nums.get(i)- nums.get(i-1));
                diff.sort(null);
                if((nums.get(i)- nums.get(i-1))==diff.get(0))
                {
                    System.out.println(nums.get(i)+" ve "+nums.get(i-1));
                }
            }
            //not: Yeni arrayList oluşturup farkları bu liste ekledim / sort ile sıraladım / eger farkları yeni listenin ilk elemanına eşitse bu sayıları yazdıdım.
        }
        //---------------------------------------------------------------------------------
          }


