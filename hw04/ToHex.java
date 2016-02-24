//////////////////////////////////////
//Aidan Spencer
//ToHex Java Program
//Program description = Decimal to hex convertor

//  import scanner
import java.util.Scanner;

//  define class
public class ToHex{
    
//  add main method
    public static void main(String [] args) {
        
//  declare instance of scanner
    Scanner myScanner = new Scanner( System.in );
    
    //ask for decimal values to be converted
    System.out.printf("Please enter three numbers representing RGB values:\n");
    //accept input and assign to 3 variables
    int r = myScanner.nextInt();
    int g = myScanner.nextInt();
    int b = myScanner.nextInt();
    
    //find remainders when divided by 16 for hex conversions
    int moduloR = r % 16;
    int moduloG = g % 16;
    int moduloB = b % 16;
    //also find quotients as integers for conversions
    int quotientR = r / 16;
    int quotientG = g / 16;
    int quotientB = b / 16;
    
    String hexValue = ""; //String to converted hex value
    
    if ( (r < 0) || (r > 255) || (g < 0) || (g > 255) || (b < 0) || (b > 255) ){
        System.out.printf("Sorry, you must enter values between 0-255.\n");
    }
    else{
    
        if ( r <= 9){
            hexValue = hexValue + "0" + Integer.toString(moduloR);
        }
        else{
            switch( quotientR ){
                case 10:
                hexValue = hexValue + "A";
                break;
                case 11:
                hexValue = hexValue + "B";
                break;
                case 12:
                hexValue = hexValue + "C";
                break;
                case 13:
                hexValue = hexValue + "D";
                break;
                case 14:
                hexValue = hexValue + "E";
                break;
                case 15:
                hexValue = hexValue + "F";
                break;
                default:
                hexValue = hexValue + Integer.toString(quotientR);
                break;
            }
            switch( moduloR ){
                case 10:
                hexValue = hexValue + "A";
                break;
                case 11:
                hexValue = hexValue + "B";
                break;
                case 12:
                hexValue = hexValue + "C";
                break;
                case 13:
                hexValue = hexValue + "D";
                break;
                case 14:
                hexValue = hexValue + "E";
                break;
                case 15:
                hexValue = hexValue + "F";
                break;
                default:
                hexValue = hexValue + Integer.toString(moduloR);
                break;
            }
        }
        if ( g <= 9){
            hexValue = hexValue + "0" + Integer.toString(moduloG);
        }
        else{
            switch( quotientG ){
                case 10:
                hexValue = hexValue + "A";
                break;
                case 11:
                hexValue = hexValue + "B";
                break;
                case 12:
                hexValue = hexValue + "C";
                break;
                case 13:
                hexValue = hexValue + "D";
                break;
                case 14:
                hexValue = hexValue + "E";
                break;
                case 15:
                hexValue = hexValue + "F";
                break;
                default:
                hexValue = hexValue + Integer.toString(quotientG);
                break;
            }
            switch( moduloG ){
                case 10:
                hexValue = hexValue + "A";
                break;
                case 11:
                hexValue = hexValue + "B";
                break;
                case 12:
                hexValue = hexValue + "C";
                break;
                case 13:
                hexValue = hexValue + "D";
                break;
                case 14:
                hexValue = hexValue + "E";
                break;
                case 15:
                hexValue = hexValue + "F";
                break;
                default:
                hexValue = hexValue + Integer.toString(moduloG);
                break;
            }
        }
        if ( b <= 9){
        hexValue = hexValue + "0" + Integer.toString(moduloB);
        }   
        else{
            switch( quotientB ){
                case 10:
                hexValue = hexValue + "A";
                break;
                case 11:
                hexValue = hexValue + "B";
                break;
                case 12:
                hexValue = hexValue + "C";
                break;
                case 13:
                hexValue = hexValue + "D";
                break;
                case 14:
                hexValue = hexValue + "E";
                break;
                case 15:
                hexValue = hexValue + "F";
                break;
                default:
                hexValue = hexValue + Integer.toString(quotientB);
                break;
            }
            switch( moduloB ){
                case 10:
                hexValue = hexValue + "A";
                break;
                case 11:
                hexValue = hexValue + "B";
                break;
                case 12:
                hexValue = hexValue + "C";
                break;
                case 13:
                hexValue = hexValue + "D";
                break;
                case 14:
                hexValue = hexValue + "E";
                break;
                case 15:
                hexValue = hexValue + "F";
                break;
                default:
                hexValue = hexValue + Integer.toString(moduloB);
                break;
            }
        }
        System.out.printf("The decimal numbers R:%d, G:%d, B:%d, is represented in hexidecimal as: %s\n", r, g, b, hexValue);
        }
    }
}