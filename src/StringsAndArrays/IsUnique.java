package StringsAndArrays;

/**
 * Created by Kumar on 10/21/2016.
 */
public class IsUnique {
    public static void main(String[] arg){
        String Input="AbcdefAa";
        char Inchar[] = Input.toCharArray();
        boolean Result = IsUnique(Inchar);
        System.out.println("String has all unique charcters? "+Result);
    }


    // Using unicode value of char as index of another boolean array
    static boolean IsUnique(char[] Inchar){
        boolean[] MapArray = new boolean[256];
        for (int i=0;i<Inchar.length;i++){
            int index = (int) Inchar[i];
            if(MapArray[index]==true){
                return false;
            }
            else{
                MapArray[index]=true;
            }
        }
        return true;
    }
}
