package StringsAndArrays;

/**
 * Created by Kumar on 10/21/2016.
 */
public class IsUnique {
    public static void main(String[] arg){
        String Input="AbcaA";
        char Inchar[] = Input.toCharArray();
        boolean Result = IsUnique(Inchar);
        System.out.println("String has all unique charcters? "+Result);
        boolean Result2 = IsUnique2(Inchar);
        System.out.println("String has all unique charcters? "+Result2);
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

    //Method to check without using any new data structure
    static boolean IsUnique2(char[] Inchar){
        for (int i=0;i<Inchar.length-1;i++){
            for(int j=i+1;j<Inchar.length;j++){
                if (Inchar[i]==Inchar[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
