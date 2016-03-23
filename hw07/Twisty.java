//////////////////////////////////////
//Aidan Spencer
//Twisty Java Program
//Program description = Twist generator

//  import scanner
import java.util.Scanner;

//  define class
public class Twisty{
    
//  add main method
    public static void main(String[] args) {
        
//  declare instance of scanner
    Scanner myScanner = new Scanner( System.in );
    
    //ask for acceptable width and length
    System.out.println("Enter desired length as an integer: ");
    boolean acceptable1 = false; //create boolean to confirm proper input
    int length = 0; //variable to store length
    while( !acceptable1 ){
        if( myScanner.hasNextInt() ){
            length = myScanner.nextInt();
            if( length < 80 ){
                acceptable1 = true;
        //if and integer less than 80 is entered, store input and change boolean
            }
            else{
                System.out.println("    ERROR: input must be less than 80");
                System.out.println("Enter desired length as an integer: ");
                //return error for integer over 80 and ask again
            }
        }    
        else{
            System.out.println("    ERROR: input must be an integer");
            System.out.println("Enter desired length as an integer: ");
            myScanner.next();
            //return error for not giving an integer and ask again
        }
    }
    System.out.println("Enter desired width as an integer: ");
    boolean acceptable2 = false; //second boolean to confirm proper input for width
    int width = 0; //variable to store width
    while( !acceptable2 ){
        if( myScanner.hasNextInt() ){
            width = myScanner.nextInt();
            if( width < length ){
                acceptable2 = true;
                //if integer less than length is given, store value and change boolean
            }
            else{
                System.out.println("    ERROR: width must be smaller than length");
                System.out.println("Enter desired width as an integer: ");
                //return error for giving input greater than length and ask again
            }
        }
        else{
            System.out.println("    ERROR: input must be an integer");
            System.out.println("Enter desired length as an integer: ");
            //return error for non integer input and ask again
        }
    }
    int spaces = 0; //create variable to keep track of spaces between symbols
    
    int width2 = (2 * width); //after twice the width the pattern will repeat
    for( int x = 1; x <= width; x++ ){ //loop which determines the number of lines/width
        for( int y = 1; y <= length; y++ ){ //loop for each line to determine when to
                                            //print symbols or spaces
            if( (y - spaces) % width2 == 1){
                System.out.print("#");
            }
            else if( (y - spaces) % width == 1){
                System.out.print("\\");
            }
            else if( (y + spaces) % width2 == 0){
                System.out.print("#");
            }
            else if( (y + spaces) % width == 0){
                System.out.print("/");
            }
            else{ //print a space if the remainder is none of these values
                System.out.print(" ");
            }
        }
        System.out.println(" ");
        spaces++; //add to spacing counter until proper width is reached
    }
}
}