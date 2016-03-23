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
        
    int counter = 0; //create counters for while loops
    int counter2 = 0;
    int length = 0;
    
    //begin while loop to ask until positive integer is given
    while (counter < 1){
        System.out.print("Enter your desired length as a positive integer: ");
        length = myScanner.nextInt();
        if ( length > 0 ) {
            counter++;
        }
    }
    int remainder = (length % 3);
    
    while (counter2 < ((length - remainder)/3)){
        System.out.print("\\ /");
        switch( remainder ){
            case 1:
            System.out.println("\\");
            break;
            case 2:
            System.out.println(" ");
            break;
            default:
            System.out.println("");
            break;
        }
        System.out.print(" X ");
        switch( remainder ){
            case 1:
            System.out.println(" ");
            break;
            case 2:
            System.out.println("X");
            break;
            default:
            System.out.println("");
            break;
        }
        System.out.print("/ \\");
        switch( remainder ){
            case 1:
            System.out.println("/");
            break;
            case 2:
            System.out.println(" ");
            break;
            default:
            System.out.println("");
            break;
        }
        counter2++;
    }
  }
}    