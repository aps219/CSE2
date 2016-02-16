//////////////////////////////////////
//Aidan Spencer
//Conversion Java Program
//Program description = Meters to inches convertor

//  import scanner
import java.util.Scanner;

//  define class
public class Convert{
    
//  add main method
    public static void main(String[] args) {
     
//  declare instance of scanner
    Scanner myScanner = new Scanner( System.in );
  
    //ask for measurement in meters
    System.out.print("Enter the distance in meters: ");
    //accept input and assign to variable
    double distMeters = myScanner.nextDouble();
    
    //convert meter value to inches and store as double
    double distInches = (distMeters * 39.37);
    //convert to 4 decimal places
    int ones=(int) distInches;
    int tenths=(int)(distInches*10) % 10;
    int hundreths=(int)(distInches*100) % 10;
    int thousandths=(int)(distInches*1000) % 10;
    int tenthousandths=(int)(distInches*10000) % 10;
    
    //return converted value to user
    System.out.println(+ distMeters + " meters is " + ones + '.' + tenths 
    + hundreths + thousandths + tenthousandths + " inches.");
  
    }
}