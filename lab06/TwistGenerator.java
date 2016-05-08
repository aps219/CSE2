//////////////////////////////////////
//Aidan Spencer
//Twist Generator Java Program
//Program description = Simple twist generator

//  import scanner
import java.util.Scanner;

//  define class
public class TwistGenerator{
    
//  add main method
    public static void main(String[] args) {
        
//  declare instance of scanner
    Scanner myScanner = new Scanner( System.in );
        
    int length = 0;
    
    System.out.print("Enter your desired length as a positive integer: ");
    //begin while loop to ask until positive integer is given
    while (! myScanner.hasNextInt()){
        System.out.println ("Error: length must be an integer");
        myScanner.next();//clears bad imput
    }
    length = myScanner.nextInt();
    
    while (length <= 0){
        System.out.println ("Error: enter a positive number");
        length = myScanner.nextInt();//redefine so it won't run bad value infinitely, if you don't change condition in while loop: runs infinitely
    }
    
    int length2 = length;
    int length3 = length;
    
    while (length > 3){
        System.out.print("\\ /");
        length = length - 3;
        }
    switch( length ){
        case 1:
        System.out.println("\\");
        break;
        case 2:
        System.out.println("\\ ");
        break;
        case 3:
        System.out.println("\\ /");
        break;
    }
    
    while (length2 > 3){
        System.out.print(" X ");
        length2 = length2 - 3;
    }
    switch( length2 ){
        case 1:
        System.out.println(" ");
        break;
        case 2:
        System.out.println(" X");
        break;
        case 3:
        System.out.println(" X ");
        break;
    }
    
    while (length3 > 3){
        System.out.print("/ \\");
        length3 = length3 - 3;
    }    
    switch( length3 ){
        case 1:
        System.out.println("/");
        break;
        case 2:
        System.out.println("/ ");
        break;
        case 3:
        System.out.println("/ \\");
        break;
    }
    
  }
}    