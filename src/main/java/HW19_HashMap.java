import java.util.HashMap;

public class HW19_HashMap {
    public static void main(String[] args) {
        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           "Hello" ==> H=1, e=1, l=2, o=1

        String h2 = "Hello";

        String[] h3 =  h2.split("");

        HashMap<String,Integer> h3Map = new HashMap<>();

        for (String w: h3){

            Integer contains = h3Map.get(w);

            if (contains == null){
                h3Map.put(w,1);

            }else {
                h3Map.put(w,contains +1);
            }

        }
        System.out.println(h3Map); // {e=1, H=1, l=2, o=1}
    }
}
