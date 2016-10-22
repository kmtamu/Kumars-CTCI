package StringsAndArrays;

/**
 * Created by Kumar on 10/22/2016.
 */
public class UrlIfy {
    public static void main(String arg[]){
        String Input = "More the merrier          "; //String has extra spaces in the end to hold extra characters needed
        int TrueLength = 16; //True length of the string is given! (we can find is using split by space)
        char[] InputChar = Input.toCharArray();
        String Url = Method1(InputChar,TrueLength);
        System.out.println("The url is: "+Url);
    }


    //Method 1 using string builder
    static String Method1(char[] In1, int len){
        StringBuilder Output = new StringBuilder();
        for (int i=0;i<len;i++){
            if(In1[i]==' '){
                Output.append("%20");
            }
            else{
                Output.append(In1[i]);
            }
        }
        return Output.toString();
    }
}
