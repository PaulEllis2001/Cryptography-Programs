/*
* Author: Paul Ellis
* Date: September 4, 2021
* Description: A program to decrypt a message that is shifted by n
*               where n is the character of the message.
 */
public class ShiftCipherPartC {
    public static void main(String[] args){
        //Formating the method for the algorithm
        String input = "XJHRFTNZHMZGAHIUETXZJNBWNUTRHEPOMDNBJMAUGORFAOIZOCC";
        StringBuilder output = new StringBuilder();
        char[] inArray = input.toUpperCase().toCharArray();
        int curLoc = 0;
        //loop to decrypt the character
        for(char c : inArray){
            char o = (char) (c-((curLoc+1)%26));
            if ( o < 65){
                o += 26;
            }
            output.append(o);
            curLoc++;
        }
        //Printing out the output
        System.out.println(output.toString());
    }
}
