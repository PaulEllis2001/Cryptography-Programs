/*
 * Author: Paul Ellis
 * Date: August 30, 2021
 * Description: A program to decrypt messages using Ceasar ciphers
 *           Using the Java Programing language
 */
import java.util.Scanner;

public class CeasarCipherBrute {
    public static void main(String[] args){
        //Get the input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the message you would like to decrypt: ");
        String Input = keyboard.nextLine();
        Input = Input.toUpperCase();
        //Formating the input for the algorithm
        char[] inputCharArray = Input.toCharArray();
        //Decrypting for each possible offset
        for(int i = 0; i < 26; i++){
            StringBuilder output = new StringBuilder();
            for(char cur : inputCharArray){
                output.append(AddOffset(cur, i));
            }
            String out = output.toString();
            System.out.println("Offset: "+ i + " Message: \""+ out + "\"");
        }
    }

    /**
     * Method for adding an offset to a char
     * @param in - char to add the offset to
     * @param offset - int of the number of char to offset by
     * @return char - the offset character
     */
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
