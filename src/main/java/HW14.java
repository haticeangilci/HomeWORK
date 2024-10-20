import java.util.ArrayList;

public class HW14 {
    public static void main(String[] args) {

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

                int minDiff = nums.get(1)-nums.get(0);//

                for (int i = 1 ; i < nums.size() ; i++)
                {
                    minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1));
                    if (nums.get(i) - nums.get(i - 1) == minDiff)
                    {
                        System.out.println(nums.get(i) + "ve" + nums.get(i - 1));
                    }
                }

                // Bu çözüm içiçe olduğundan, doğru sonucu bulana kadar her dönüşte farklı minDiff hesaplayabilir
                //                            o nedenle elde ettiği tüm minDiff ler için tamsayıları da getirir.
                //for döngüsünde minDiff bulunduktan sonra dışarı çıkıp tam sayıları baştan çağırmalıyız.

            }
        }         //not: tek for içinde yapamıyoruz


