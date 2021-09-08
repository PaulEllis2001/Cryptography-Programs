/*
* Author: Paul Ellis
* Date: August 30, 2021
* Description: A program to encrypt messages using Ceasar ciphers
*           Using the Java Programing language
 */
import java.util.Scanner;

public class CeasarCipherEncrypt {
    public static void main(String[] args){

        //Get the input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the message you would like to encrypt: ");
        String input = keyboard.nextLine();
        System.out.println("Please Enter the number of spaces you would like to move: ");
        int offset = keyboard.nextInt();
        keyboard.close();

        //Format the input to be UPPER CASE and send to char array
        input = input.toUpperCase();
        char[] inputChar = input.toCharArray();

        //Create String Builder to store output in
        StringBuilder output = new StringBuilder();

        //For loop to add each character to the string builder after offset
        for(char cur : inputChar){
            //Append offset char
            output.append(AddOffset(cur, offset));
        }

        //Print out encrypted message
        String out = output.toString();
        System.out.println("Encrypted Message: " + out);
    }

    /**
     * Add the offset to the char provided
     * @param in - char to be encrypted
     * @param offset - int to be added to char
     * @return - encrypted char
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
