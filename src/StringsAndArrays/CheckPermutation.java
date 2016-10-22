package StringsAndArrays;

/**
 * Created by Kumar on 10/22/2016.
 */
public class CheckPermutation {
    public static void main(String arg[]){
        String Input1 ="top dad";
        String Input2 ="add opt";
        char[] InputChar1 = Input1.toCharArray();
        char[] InputChar2 = Input2.toCharArray();
        boolean result = Method1(InputChar1,InputChar2);
        System.out.println("Strings are permutation? "+ result);
    }

    //Method 1 using integer arrays to compare character counts. Spaces count too!
    static boolean Method1(char[] In1, char[]In2) {
        if (In1.length == In2.length) {
            int[] ArrayCheck = new int[256];
            for (int i = 0; i < In1.length; i++) {
                int Index = (int) In1[i];
                ArrayCheck[Index]++;
            }
            for (int i = 0; i < In1.length; i++) {
                int Index = (int) In2[i];
                ArrayCheck[Index]--;
            }

            for (int element : ArrayCheck) {
                if (element != 0) return false;
            }
            return true;
        }
        return false;
    }
}
