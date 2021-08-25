import java.util.Locale;

public class CeasarCipherBrute {
    public static void main(String args[]){
        String Input = "ILSSV UOLYL";
        Input = Input.toUpperCase();
        char[] inputCharArray = Input.toCharArray();
        int offset = 0;

        for(int i = 0; i < 26; i++){
            StringBuilder output = new StringBuilder();
            for(char cur : inputCharArray){
                output.append(AddOffset(cur, i));
            }
            System.out.println("Offset: "+ i + " Message: \""+ output.toString() + "\"");
        }
    }

    public static char AddOffset(char in, int offset){
        char out = in;
        //Capitals 65-90
        //Lower Case 97-122
        if(out == ' ')
        {
            //Leave Spaces Alone
            return out;
        } else{
            //Add the offset
            out += offset;
            //If it loops set back to beginning
            if((out > 90)) {
                out -= 26;
            }
            return out;
        }
    }
}
