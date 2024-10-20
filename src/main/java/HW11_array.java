import java.util.Arrays;

public class HW11_array {
    public static void main(String[] args) {


                ////ARASTIRMA ODEVI: Java'da char veya boolean turunde bir array olusturabilir misiniz?

                char[] characters =  {'a' , 'c' , 'd' ,'b'};
                System.out.println("characters = " + Arrays.toString(characters)); //characters = [a, c, d, b]
                Arrays.sort(characters);
                System.out.println("characters = " + Arrays.toString(characters)); //characters = [a, b, c, d]


                boolean[] true_false = {true , true, false , true};
                System.out.println(Arrays.toString(true_false)); //[true, true, false, true]

            }
        }


