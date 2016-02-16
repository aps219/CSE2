//////////////////////////////////////
//Aidan Spencer
//Conversion Java Program
//Program description = Meters to inches convertor

//  import scanner
import java.util.Scanner;

//  define class
public class Pyramid{
    
//  add main method
    public static void main(String[] args) {
     
//  declare instance of scanner
    Scanner myScanner = new Scanner( System.in );
    
    //ask for measurements of pyramid and store as doubles
    System.out.print("The square side of the pyramid is (input length) : ");
    double baseSide = myScanner.nextDouble();
    System.out.print("The height of the pyramid is (input length) : ");
    double height = myScanner.nextDouble();
    
    //calculate volume and store as double
    int volume=(int)((baseSide*baseSide) * (height/3));
    
    //return calculated volume
    System.out.println("The volume inside the pyramid is " + volume + ".");
    
    }   
}