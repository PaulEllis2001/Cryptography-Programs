import java.util.Locale;
import java.util.Scanner;

public class CeasarCipherEncrypt {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the message you would like to encrypt: ");
        String input = keyboard.nextLine();
        System.out.println("Please Enter the number of spaces you would like to move: ");
        int offset = keyboard.nextInt();
        keyboard.close();
        input.toUpperCase();
        char[] inputChar = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for(char cur : inputChar){
            output.append(AddOffset(cur, offset));
        }

        System.out.println("Encrypted Message: " + output.toString());
    }

    public static char AddOffset(char in, int offset){
        char out = in;
        //Capitals 65-90
        //Lower Case 97-122
        if(out == ' ')
        {
            return out;
        } else if ((out + offset) > 90) {
            out += offset;
            out -= 26;
            return out;
        } else {
            return (char)(out+offset);
        }
    }
}
