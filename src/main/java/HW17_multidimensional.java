import java.util.Arrays;

public class HW17_multidimensional {
    public static void main(String[] args) {
        /*
        Asagidaki multi dimensional array'in
        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
        */

        int[][] list= {{1,2,3}, {4,5}, {6, 7}};
        int sum=0;
        int a=0;

        int[] yeni= new int[list.length];
        for (int[] i: list) {
            sum-=sum;
            for (int j:i){

                sum+=j;

            }
            yeni[a]=sum;

            a++;

        } System.out.println("yeni= " + Arrays.toString(yeni));
    }
}
