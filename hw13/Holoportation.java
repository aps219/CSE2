///////////////////////
// Aidan Spencer 
// Holoporter Java Program

//import scanner
import java.util.Scanner;

//import RNG
import java.util.Random;

//define class
public class Holoportation {
    
    public static void main(String[] args){
        String[][][] formattedArray = soRandom();
    }

    //soRandom method
    public static String[][][] soRandom() {

        Random random = new Random();
        String[][][] array = new String[random.nextInt(10)][][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new String[random.nextInt(10)][];
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                array[j][k] = new String[random.nextInt(10)];
            }
        }
        return array;
    }

    //coder method
    public static String coder() {

        int count = 0;
        String code = "";
        while (count < 2) {
            int num = (int)(Math.random() * 26);
            String letter = "";
            switch (num) {
                case 0:
                    letter = "A";
                    break;
                case 1:
                    letter = "B";
                    break;
                case 2:
                    letter = "C";
                    break;
                case 3:
                    letter = "D";
                    break;
                case 4:
                    letter = "E";
                    break;
                case 5:
                    letter = "F";
                    break;
                case 6:
                    letter = "G";
                    break;
                case 7:
                    letter = "H";
                    break;
                case 8:
                    letter = "I";
                    break;
                case 9:
                    letter = "J";
                    break;
                case 10:
                    letter = "K";
                    break;
                case 11:
                    letter = "L";
                    break;
                case 12:
                    letter = "M";
                    break;
                case 13:
                    letter = "N";
                    break;
                case 14:
                    letter = "O";
                    break;
                case 15:
                    letter = "P";
                    break;
                case 16:
                    letter = "Q";
                    break;
                case 17:
                    letter = "R";
                    break;
                case 18:
                    letter = "S";
                    break;
                case 19:
                    letter = "T";
                    break;
                case 20:
                    letter = "U";
                    break;
                case 21:
                    letter = "V";
                    break;
                case 22:
                    letter = "W";
                    break;
                case 23:
                    letter = "X";
                    break;
                case 24:
                    letter = "Y";
                    break;
                case 25:
                    letter = "Z";
                    break;
            }
            count++;
            code = code + letter; 
        }        
            
        int counter = 0;
        while (counter < 4) {
            int digit = (int)(Math.random() * 10);
            counter++;
            code = code + digit;
        }
        return code;
    }
    
    //print method
    public static void print(String[][][] array2){
        
        
        
    }

}
